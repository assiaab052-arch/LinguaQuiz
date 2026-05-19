package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername, etMail, etPassword, etPassword1;
    Button bRegister;

    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelper   = new DatabaseHelper(this);
        etUsername = findViewById(R.id.etUsername);
        etMail     = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);
        etPassword1= findViewById(R.id.etPassword1);
        bRegister  = findViewById(R.id.bRegister);

        bRegister.setOnClickListener(v -> {
            String username  = etUsername.getText().toString().trim();
            String mail      = etMail.getText().toString().trim();
            String password  = etPassword.getText().toString().trim();
            String password1 = etPassword1.getText().toString().trim();

            if (TextUtils.isEmpty(username)) {
                Toast.makeText(this, "Entrez un nom d'utilisateur", Toast.LENGTH_SHORT).show(); return;
            }
            if (TextUtils.isEmpty(mail)) {
                Toast.makeText(this, "Entrez votre email", Toast.LENGTH_SHORT).show(); return;
            }
            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Entrez un mot de passe", Toast.LENGTH_SHORT).show(); return;
            }
            if (password.length() < 6) {
                Toast.makeText(this, "Mot de passe: 6 caractères minimum", Toast.LENGTH_SHORT).show(); return;
            }
            if (!password.equals(password1)) {
                Toast.makeText(this, "Les mots de passe ne correspondent pas", Toast.LENGTH_SHORT).show(); return;
            }
            if (dbHelper.emailExists(mail)) {
                Toast.makeText(this, "Cet email est déjà utilisé", Toast.LENGTH_SHORT).show(); return;
            }

            boolean ok = dbHelper.registerUser(username, mail, password);
            if (ok) {
                Toast.makeText(this, "Inscription réussie ! / Registration successful!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, MainActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Erreur d'inscription", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
