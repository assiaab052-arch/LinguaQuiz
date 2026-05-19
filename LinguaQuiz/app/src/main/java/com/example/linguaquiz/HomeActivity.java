package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    TextView tvWelcome;

    CardView cardFrench, cardEnglish, cardChatBot;

    Button bLogout, btnMap, btnLocation, btnCamera;

    ImageButton btnProfile;

    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        session = new SessionManager(this);

        tvWelcome = findViewById(R.id.tvWelcome);

        cardFrench = findViewById(R.id.cardFrench);
        cardEnglish = findViewById(R.id.cardEnglish);
        cardChatBot = findViewById(R.id.cardChatBot);

        bLogout = findViewById(R.id.bLogout);

        btnProfile = findViewById(R.id.btnProfile);

        btnMap = findViewById(R.id.btnMap);

        btnLocation = findViewById(R.id.btnLocation);

        btnCamera = findViewById(R.id.btnCamera);

        tvWelcome.setText(
                "Bonjour / Hello, "
                        + session.getUsername()
                        + " !"
        );

        // French
        cardFrench.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            LevelSelectionActivity.class
                    );

            intent.putExtra("language", "FRENCH");

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // English
        cardEnglish.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            LevelSelectionActivity.class
                    );

            intent.putExtra("language", "ENGLISH");

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // ChatBot
        cardChatBot.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            ChatBotActivity.class
                    );

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // Profile
        btnProfile.setOnClickListener(v -> {

            startActivity(
                    new Intent(
                            HomeActivity.this,
                            ProfileActivity.class
                    )
            );
        });

        // Location
        btnLocation.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            LocationActivity.class
                    );

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // Map
        btnMap.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            MapActivity.class
                    );

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // Camera
        btnCamera.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            CameraActivity.class
                    );

            startActivity(intent);

            overridePendingTransition(
                    R.anim.entry,
                    R.anim.exit
            );
        });

        // Logout
        bLogout.setOnClickListener(v -> {

            session.clearSession();

            startActivity(
                    new Intent(
                            HomeActivity.this,
                            MainActivity.class
                    )
            );

            finish();
        });
    }
}