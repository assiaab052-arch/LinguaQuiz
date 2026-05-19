package com.example.linguaquiz;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView tvUsername, tvEmail, tvTotalScore, tvCompletedCourses, tvGlobalPercent;
    ProgressBar pbGlobal;
    Button btnBack;

    ImageView imgProfile;

    DatabaseHelper dbHelper;
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        dbHelper = new DatabaseHelper(this);
        session = new SessionManager(this);

        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);
        tvTotalScore = findViewById(R.id.tvTotalScore);
        tvCompletedCourses = findViewById(R.id.tvCompletedCourses);
        tvGlobalPercent = findViewById(R.id.tvGlobalPercent);
        pbGlobal = findViewById(R.id.pbGlobal);
        btnBack = findViewById(R.id.btnBack);

        imgProfile = findViewById(R.id.imgProfile);

        loadUserData();
        loadProfileImage();

        btnBack.setOnClickListener(v -> finish());
    }

    private void loadUserData() {

        int userId = session.getUserId();

        tvUsername.setText(session.getUsername());
        tvEmail.setText(session.getEmail());

        int totalScore = dbHelper.getTotalScore(userId);
        int completedCount = dbHelper.getCompletedCoursesCount(userId);

        tvTotalScore.setText(String.valueOf(totalScore));
        tvCompletedCourses.setText(String.valueOf(completedCount));

        int totalCourses = 5;
        int percent = (completedCount * 100) / totalCourses;

        tvGlobalPercent.setText(percent + "%");
        pbGlobal.setProgress(percent);
    }

    private void loadProfileImage() {

        SharedPreferences prefs =
                getSharedPreferences("profile", MODE_PRIVATE);

        String image = prefs.getString("image", null);

        if (image != null) {

            byte[] bytes = Base64.decode(image, Base64.DEFAULT);

            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

            imgProfile.setImageBitmap(bitmap);
        }
    }
}