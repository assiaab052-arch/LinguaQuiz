package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button bLogin;
    TextView tvRegister;

    DatabaseHelper dbHelper;
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);
        session = new SessionManager(this);

        // Auto-login if session exists
        if (session.isLoggedIn()) {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
            return;
        }

        etEmail    = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);
        bLogin     = findViewById(R.id.bLogin);
        tvRegister = findViewById(R.id.tvRegister);

        bLogin.setOnClickListener(view -> {
            String email    = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "Entrez votre email / Enter your email", Toast.LENGTH_SHORT).show();
                return;
            }
            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Entrez votre mot de passe / Enter your password", Toast.LENGTH_SHORT).show();
                return;
            }

            User user = dbHelper.loginUser(email, password);
            if (user != null) {
                session.saveSession(user);
                Toast.makeText(this, "Bienvenue / Welcome " + user.getUsername() + " !", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, HomeActivity.class));
                overridePendingTransition(R.anim.entry, R.anim.exit);
                finish();
            } else {
                Toast.makeText(this, "Email ou mot de passe incorrect / Wrong credentials", Toast.LENGTH_LONG).show();
            }
        });

        tvRegister.setOnClickListener(view ->
                startActivity(new Intent(this, RegisterActivity.class))
        );
    }
}
