package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class LessonDetailsActivity extends AppCompatActivity {

    TextView tvTitle, tvExpl, tvVocab, tvExamples;
    Button btnStartQuiz;
    DatabaseHelper dbHelper;
    SessionManager session;
    int courseId;
    Course currentCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_details);

        dbHelper = new DatabaseHelper(this);
        session = new SessionManager(this);
        courseId = getIntent().getIntExtra("course_id", -1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvTitle = findViewById(R.id.tvLessonTitle);
        tvExpl = findViewById(R.id.tvExplanation);
        tvVocab = findViewById(R.id.tvVocab);
        tvExamples = findViewById(R.id.tvExamples);
        btnStartQuiz = findViewById(R.id.btnStartQuiz);

        loadCourseData();

        btnStartQuiz.setOnClickListener(v -> {
            List<Question> questions = dbHelper.getQuestionsForCourse(courseId);
            if (questions.isEmpty()) {
                Toast.makeText(this, "Quiz bientôt disponible !", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(this, QuizActivity.class);
            intent.putExtra("course_id", courseId);
            intent.putExtra("language", currentCourse.getLanguage());
            intent.putExtra("level", currentCourse.getLevel());
            startActivity(intent);
        });

        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void loadCourseData() {
        currentCourse = dbHelper.getCourseById(courseId, session.getUserId());
        if (currentCourse != null) {
            getSupportActionBar().setTitle(currentCourse.getTitle());
            tvTitle.setText(currentCourse.getTitle());
            tvExpl.setText(currentCourse.getContent());
            tvVocab.setText(currentCourse.getVocab());
            tvExamples.setText(currentCourse.getExamples());
            
            if (currentCourse.isCompleted()) {
                btnStartQuiz.setText("REFAIRE LE QUIZ (Validé ✓)");
                btnStartQuiz.setBackgroundTintList(android.content.res.ColorStateList.valueOf(0xFF3F51B5));
            }
        } else {
            Toast.makeText(this, "Erreur : cours introuvable", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
