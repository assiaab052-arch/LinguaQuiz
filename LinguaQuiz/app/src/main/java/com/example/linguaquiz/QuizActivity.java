package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    TextView tvQuestionNumber, tvQuestion, tvCategory, tvProgress;
    RadioGroup rg;
    RadioButton rbA, rbB, rbC, rbD;
    Button bNext;
    ProgressBar progressBar;

    DatabaseHelper dbHelper;
    SessionManager session;

    List<Question> questions;
    int currentIndex = 0;
    int score = 0;
    String language, level;
    int courseId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        dbHelper = new DatabaseHelper(this);
        session  = new SessionManager(this);

        language = getIntent().getStringExtra("language");
        level    = getIntent().getStringExtra("level");
        courseId = getIntent().getIntExtra("course_id", -1);

        tvQuestionNumber = findViewById(R.id.tvQuestionNumber);
        tvQuestion       = findViewById(R.id.tvQuestion);
        tvCategory       = findViewById(R.id.tvCategory);
        tvProgress       = findViewById(R.id.tvProgress);
        rg               = findViewById(R.id.rg);
        rbA              = findViewById(R.id.rbA);
        rbB              = findViewById(R.id.rbB);
        rbC              = findViewById(R.id.rbC);
        rbD              = findViewById(R.id.rbD);
        bNext            = findViewById(R.id.bNext);
        progressBar      = findViewById(R.id.progressBar);

        if (courseId != -1) {
            questions = dbHelper.getQuestionsForCourse(courseId);
        } else {
            questions = dbHelper.getQuestions(language, level);
        }

        if (questions == null || questions.isEmpty()) {
            Toast.makeText(this, "Aucune question disponible / No questions available", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        progressBar.setMax(questions.size());
        loadQuestion();

        bNext.setOnClickListener(v -> {
            if (rg.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this,
                        "Merci de choisir une réponse S.V.P ! / Please select an answer!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton selected = findViewById(rg.getCheckedRadioButtonId());
            String selectedTag = selected.getTag().toString();
            Question q = questions.get(currentIndex);

            if (selectedTag.equals(q.getCorrectOption())) {
                score++;
                showFeedback(true, q.getCorrectAnswer());
            } else {
                showFeedback(false, q.getCorrectAnswer());
            }

            currentIndex++;

            if (currentIndex < questions.size()) {
                rg.setEnabled(false);
                bNext.setEnabled(false);
                rg.postDelayed(() -> {
                    rg.setEnabled(true);
                    bNext.setEnabled(true);
                    loadQuestion();
                }, 900);
            } else {
                int percent = (score * 100) / questions.size();
                
                if (courseId != -1 && percent >= 80) {
                    dbHelper.markCourseCompleted(session.getUserId(), courseId, percent);
                    Toast.makeText(this, "Cours validé ! 🎉", Toast.LENGTH_SHORT).show();
                } else if (courseId != -1) {
                    Toast.makeText(this, "Score insuffisant pour valider (min 80%)", Toast.LENGTH_LONG).show();
                }

                dbHelper.saveScore(session.getUserId(), language, level, score, questions.size());

                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total", questions.size());
                intent.putExtra("language", language);
                intent.putExtra("level", level);
                intent.putExtra("showHistory", false);
                startActivity(intent);
                overridePendingTransition(R.anim.entry, R.anim.exit);
                finish();
            }
        });
    }

    private void loadQuestion() {
        rg.clearCheck();
        rbA.setBackgroundResource(R.drawable.option_selector);
        rbB.setBackgroundResource(R.drawable.option_selector);
        rbC.setBackgroundResource(R.drawable.option_selector);
        rbD.setBackgroundResource(R.drawable.option_selector);

        Question q = questions.get(currentIndex);

        tvQuestionNumber.setText("Question " + (currentIndex + 1) + " / " + questions.size());
        tvQuestion.setText(q.getText());
        tvCategory.setText(q.getCategory());
        tvProgress.setText(score + " ✓");

        rbA.setText("A.  " + q.getOptionA());
        rbB.setText("B.  " + q.getOptionB());
        rbC.setText("C.  " + q.getOptionC());
        rbD.setText("D.  " + q.getOptionD());

        rbA.setTag("A");
        rbB.setTag("B");
        rbC.setTag("C");
        rbD.setTag("D");

        progressBar.setProgress(currentIndex + 1);

        if (currentIndex == questions.size() - 1) {
            bNext.setText("Terminer / Finish");
        } else {
            bNext.setText("Suivant / Next");
        }
    }

    private void showFeedback(boolean correct, String correctAnswer) {
        Question q = questions.get(currentIndex);
        RadioButton correctBtn = getButtonForOption(q.getCorrectOption());
        RadioButton selectedBtn = (RadioButton) findViewById(rg.getCheckedRadioButtonId());

        if (correctBtn != null)
            correctBtn.setBackgroundColor(0xFF4CAF50);

        if (!correct && selectedBtn != null)
            selectedBtn.setBackgroundColor(0xFFF44336);

        if (correct) {
            Toast.makeText(this, "✓ Correct !", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "✗ Réponse correcte: " + correctAnswer, Toast.LENGTH_SHORT).show();
        }
    }

    private RadioButton getButtonForOption(String option) {
        switch (option) {
            case "A": return rbA;
            case "B": return rbB;
            case "C": return rbC;
            case "D": return rbD;
            default:  return null;
        }
    }
}
