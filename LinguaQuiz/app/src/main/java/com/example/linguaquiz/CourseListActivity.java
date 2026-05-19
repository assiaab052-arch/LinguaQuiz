package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {

    RecyclerView rvCourses;
    CourseAdapter adapter;
    DatabaseHelper dbHelper;
    SessionManager session;
    String language, level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        dbHelper = new DatabaseHelper(this);
        session = new SessionManager(this);

        language = getIntent().getStringExtra("language");
        level = getIntent().getStringExtra("level");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(language.equals("FR") ? "Cours de Français" : "English Courses");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvCourses = findViewById(R.id.rvCourses);
        rvCourses.setLayoutManager(new LinearLayoutManager(this));

        loadCourses();
        
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadCourses(); // Refresh list to update unlock status
    }

    private void loadCourses() {
        List<Course> courses = dbHelper.getCourses(session.getUserId(), language, level);
        adapter = new CourseAdapter(courses, course -> {
            Intent intent = new Intent(CourseListActivity.this, LessonDetailsActivity.class);
            intent.putExtra("course_id", course.getId());
            startActivity(intent);
        });
        rvCourses.setAdapter(adapter);
    }
}
