package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LessonActivity extends AppCompatActivity {

    TextView tvTitle, tvExpl, tvVocab;
    Button btnStart;
    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvTitle = findViewById(R.id.tvLessonTitle);
        tvExpl = findViewById(R.id.tvExplanation);
        tvVocab = findViewById(R.id.tvVocabEx);
        btnStart = findViewById(R.id.btnStartQuiz);

        language = getIntent().getStringExtra("language");

        loadLessonContent();

        btnStart.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizActivity.class);
            intent.putExtra("language", language);
            intent.putExtra("level", "Débutant"); 
            startActivity(intent);
            overridePendingTransition(R.anim.entry, R.anim.exit);
        });
        
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void loadLessonContent() {
        if ("FR".equals(language)) {
            setTitle("Leçon de Français");
            tvTitle.setText("Le Présent de l'Indicatif");
            tvExpl.setText("Le présent s'utilise pour exprimer une action qui se déroule au moment où l'on parle ou pour des vérités générales.\n\nLes terminaisons des verbes du 1er groupe (-er) sont : -e, -es, -e, -ons, -ez, -ent.");
            tvVocab.setText("• Bonjour = Hello\n• Merci = Thank you\n• Maison = House\n• Chat = Cat\n• Pomme = Apple\n\nExemples :\n1. Je mange une pomme.\n2. La maison est grande.");
            btnStart.setText("Commencer le Quiz");
        } else {
            setTitle("English Lesson");
            tvTitle.setText("The Present Simple");
            tvExpl.setText("We use the present simple for facts, habits, and general truths.\n\nFor 'he, she, it', we usually add '-s' to the verb. Example: I eat, but He eats.");
            tvVocab.setText("• To eat = Manger\n• Always = Toujours\n• School = École\n• Friend = Ami\n• Water = Eau\n\nExamples:\n1. I go to school every day.\n2. She drinks water.");
            btnStart.setText("Start Quiz");
        }
    }
}
