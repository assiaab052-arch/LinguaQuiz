package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LevelSelectionActivity extends AppCompatActivity {

    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        language = getIntent().getStringExtra("language");

        TextView tvTitle = findViewById(R.id.tvLevelTitle);
        if ("ENGLISH".equals(language)) {
            tvTitle.setText("Choose your level");
        }

        findViewById(R.id.cardBeginner).setOnClickListener(v -> startCourseList("BEGINNER"));
        findViewById(R.id.cardIntermediate).setOnClickListener(v -> startCourseList("INTERMEDIATE"));
        findViewById(R.id.cardAdvanced).setOnClickListener(v -> startCourseList("ADVANCED"));
    }

    private void startCourseList(String level) {
        Intent intent = new Intent(this, CourseListActivity.class);
        intent.putExtra("language", language);
        intent.putExtra("level", level);
        startActivity(intent);
        overridePendingTransition(R.anim.entry, R.anim.exit);
    }
}
