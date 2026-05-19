package com.example.linguaquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "lingua_quiz_final_v3.db"; 
    private static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, email TEXT UNIQUE, password TEXT)");
        db.execSQL("CREATE TABLE courses (id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, description TEXT, content TEXT, vocab TEXT, examples TEXT, language TEXT, level TEXT, order_index INTEGER)");
        db.execSQL("CREATE TABLE questions (id INTEGER PRIMARY KEY AUTOINCREMENT, question_text TEXT, option_a TEXT, option_b TEXT, option_c TEXT, option_d TEXT, correct_option TEXT, language TEXT, category TEXT, level TEXT, image_res TEXT, course_id INTEGER)");
        db.execSQL("CREATE TABLE user_progress (user_id INTEGER, course_id INTEGER, is_completed INTEGER DEFAULT 0, last_score INTEGER DEFAULT 0)");
        db.execSQL("CREATE TABLE scores (id INTEGER PRIMARY KEY AUTOINCREMENT, user_id INTEGER, language TEXT, level TEXT, score INTEGER, total INTEGER, date TEXT)");

        seedData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS questions");
        db.execSQL("DROP TABLE IF EXISTS scores");
        db.execSQL("DROP TABLE IF EXISTS courses");
        db.execSQL("DROP TABLE IF EXISTS user_progress");
        onCreate(db);
    }

    private void seedData(SQLiteDatabase db) {
        List<StaticCourse> allCourses = CourseRepository.getAllCourses();
        for (StaticCourse sc : allCourses) {
            StringBuilder vb = new StringBuilder();
            for (VocabularyItem vi : sc.vocabulary) {
                vb.append(vi.word).append(" : ").append(vi.translation).append("\n");
            }
            
            StringBuilder exB = new StringBuilder();
            for (int i = 0; i < sc.exampleSentences.size(); i++) {
                exB.append(sc.exampleSentences.get(i));
                if (i < sc.exampleSentences.size() - 1) exB.append("\n");
            }
            
            ContentValues cv = new ContentValues();
            cv.put("title", sc.title);
            cv.put("description", sc.description);
            cv.put("content", sc.theoryContent);
            cv.put("vocab", vb.toString());
            cv.put("examples", exB.toString());
            cv.put("language", sc.language.name()); // "FRENCH" or "ENGLISH"
            cv.put("level", sc.level.name());       // "BEGINNER", etc.
            cv.put("order_index", sc.orderIndex);
            long courseId = db.insert("courses", null, cv);
            
            for (QuizQuestion qq : sc.quiz) {
                String correct = (qq.correctAnswerIndex == 0) ? "A" : (qq.correctAnswerIndex == 1) ? "B" : (qq.correctAnswerIndex == 2) ? "C" : "D";
                ContentValues qv = new ContentValues();
                qv.put("question_text", qq.question);
                qv.put("option_a", qq.choices.size() > 0 ? qq.choices.get(0) : "");
                qv.put("option_b", qq.choices.size() > 1 ? qq.choices.get(1) : "");
                qv.put("option_c", qq.choices.size() > 2 ? qq.choices.get(2) : "");
                qv.put("option_d", qq.choices.size() > 3 ? qq.choices.get(3) : "");
                qv.put("correct_option", correct);
                qv.put("language", sc.language.name());
                qv.put("category", "Quiz");
                qv.put("level", sc.level.name());
                qv.put("course_id", (int)courseId);
                db.insert("questions", null, qv);
            }
        }
    }

    public List<Course> getCourses(int userId, String language, String level) {
        List<Course> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT c.*, p.is_completed, p.last_score FROM courses c " +
                "LEFT JOIN user_progress p ON c.id = p.course_id AND p.user_id = ? " +
                "WHERE c.language = ? AND c.level = ? ORDER BY c.order_index ASC";
        Cursor c = db.rawQuery(query, new String[]{String.valueOf(userId), language, level});
        while (c.moveToNext()) {
            Course course = new Course(c.getInt(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6), c.getString(7), c.getInt(8));
            course.setCompleted(c.getInt(9) == 1);
            course.setProgress(c.getInt(10));
            // Automatically unlock the first course or if the previous one is completed
            if (course.getOrderIndex() == 1 || (list.size() > 0 && list.get(list.size()-1).isCompleted())) {
                course.setUnlocked(true);
            }
            list.add(course);
        }
        c.close();
        return list;
    }

    public Course getCourseById(int courseId, int userId) {
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT c.*, p.is_completed, p.last_score FROM courses c " +
                "LEFT JOIN user_progress p ON c.id = p.course_id AND p.user_id = ? WHERE c.id = ?";
        Cursor c = db.rawQuery(query, new String[]{String.valueOf(userId), String.valueOf(courseId)});
        if (c.moveToFirst()) {
            Course course = new Course(c.getInt(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6), c.getString(7), c.getInt(8));
            course.setCompleted(c.getInt(9) == 1);
            course.setProgress(c.getInt(10));
            c.close(); return course;
        }
        c.close(); return null;
    }

    public void markCourseCompleted(int userId, int courseId, int score) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("user_id", userId); cv.put("course_id", courseId); cv.put("is_completed", 1); cv.put("last_score", score);
        int rows = db.update("user_progress", cv, "user_id=? AND course_id=?", new String[]{String.valueOf(userId), String.valueOf(courseId)});
        if (rows == 0) db.insert("user_progress", null, cv);
    }

    public List<Question> getQuestionsForCourse(int courseId) {
        List<Question> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query("questions", null, "course_id=?", new String[]{String.valueOf(courseId)}, null, null, null);
        while (c.moveToNext()) {
            list.add(new Question(c.getInt(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6), c.getString(7), c.getString(8), c.getString(9), c.getString(10), c.getInt(11)));
        }
        c.close(); return list;
    }

    public List<Question> getQuestions(String language, String level) {
        List<Question> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query("questions", null, "language=? AND level=?", new String[]{language, level}, null, null, null);
        while (c.moveToNext()) {
            list.add(new Question(c.getInt(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6), c.getString(7), c.getString(8), c.getString(9), c.getString(10), c.getInt(11)));
        }
        c.close(); return list;
    }

    public int getCompletedCoursesCount(int userId) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT COUNT(*) FROM user_progress WHERE user_id=? AND is_completed=1", new String[]{String.valueOf(userId)});
        int count = 0; if (c.moveToFirst()) count = c.getInt(0); c.close(); return count;
    }

    public int getTotalScore(int userId) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT SUM(score) FROM scores WHERE user_id=?", new String[]{String.valueOf(userId)});
        int sum = 0; if (c.moveToFirst()) sum = c.getInt(0); c.close(); return sum;
    }

    public void saveScore(int userId, String language, String level, int score, int total) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("user_id", userId); cv.put("language", language); cv.put("level", level); cv.put("score", score); cv.put("total", total);
        cv.put("date", new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault()).format(new Date()));
        db.insert("scores", null, cv);
    }

    public List<ScoreRecord> getUserScores(int userId) {
        List<ScoreRecord> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query("scores", null, "user_id=?", new String[]{String.valueOf(userId)}, null, null, "date DESC", "20");
        while (c.moveToNext()) { list.add(new ScoreRecord(c.getString(2), c.getString(3), c.getInt(4), c.getInt(5), c.getString(6))); }
        c.close(); return list;
    }

    public boolean registerUser(String username, String email, String password) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("username", username); cv.put("email", email); cv.put("password", password);
        return db.insert("users", null, cv) != -1;
    }

    public User loginUser(String email, String password) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("users", null, "email=? AND password=?", new String[]{email, password}, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            User user = new User(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            cursor.close(); return user;
        }
        return null;
    }

    public boolean emailExists(String email) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query("users", new String[]{"id"}, "email=?", new String[]{email}, null, null, null);
        boolean exists = (c != null && c.getCount() > 0);
        if (c != null) c.close(); return exists;
    }
}
