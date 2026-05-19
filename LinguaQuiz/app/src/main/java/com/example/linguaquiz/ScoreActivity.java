package com.example.linguaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ScoreActivity extends AppCompatActivity {

    TextView tvScore, tvScoreLabel, tvScoreDetail, tvHistoryTitle;
    ProgressBar progressBar;
    Button bRetry, bHome, bLogout;
    LinearLayout llHistory;

    DatabaseHelper dbHelper;
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        dbHelper = new DatabaseHelper(this);
        session  = new SessionManager(this);

        tvScore       = findViewById(R.id.tvScore);
        tvScoreLabel  = findViewById(R.id.tvScoreLabel);
        tvScoreDetail = findViewById(R.id.tvScoreDetail);
        tvHistoryTitle= findViewById(R.id.tvHistoryTitle);
        progressBar   = findViewById(R.id.progressBar);
        bRetry        = findViewById(R.id.bTry);
        bHome         = findViewById(R.id.bHome);
        bLogout       = findViewById(R.id.bLogout);
        llHistory     = findViewById(R.id.llHistory);

        boolean showHistory = getIntent().getBooleanExtra("showHistory", false);

        if (showHistory) {
            // Show only history
            tvScore.setVisibility(View.GONE);
            tvScoreDetail.setVisibility(View.GONE);
            progressBar.setVisibility(View.GONE);
            bRetry.setVisibility(View.GONE);
            tvScoreLabel.setText("Historique / History");
            tvHistoryTitle.setVisibility(View.VISIBLE);
            llHistory.setVisibility(View.VISIBLE);
            loadHistory();
        } else {
            // Show result
            int score    = getIntent().getIntExtra("score", 0);
            int total    = getIntent().getIntExtra("total", 1);
            String lang  = getIntent().getStringExtra("language");
            String level = getIntent().getStringExtra("level");

            int percent = total > 0 ? score * 100 / total : 0;
            progressBar.setMax(100);
            progressBar.setProgress(percent);
            tvScore.setText(percent + " %");
            tvScoreLabel.setText("Votre score / Your score");
            tvScoreDetail.setText(score + " / " + total + " — " + lang + " · " + level);

            String message;
            if (percent == 100) message = "Parfait ! / Perfect! 🏆";
            else if (percent >= 80) message = "Excellent ! / Excellent! 🎉";
            else if (percent >= 60) message = "Bien ! / Good job! 👍";
            else if (percent >= 40) message = "Continuez ! / Keep going! 💪";
            else message = "Réessayez ! / Try again! 📚";

            tvHistoryTitle.setText(message);
            tvHistoryTitle.setVisibility(View.VISIBLE);
            llHistory.setVisibility(View.VISIBLE);
            loadHistory();
        }

        bRetry.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
            overridePendingTransition(R.anim.entry, R.anim.exit);
            finish();
        });

        bHome.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        });

        bLogout.setOnClickListener(v -> {
            session.clearSession();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }

    private void loadHistory() {
        List<ScoreRecord> records = dbHelper.getUserScores(session.getUserId());
        llHistory.removeAllViews();

        if (records.isEmpty()) {
            TextView empty = new TextView(this);
            empty.setText("Aucun historique / No history yet");
            empty.setPadding(16, 16, 16, 16);
            llHistory.addView(empty);
            return;
        }

        LayoutInflater inflater = LayoutInflater.from(this);
        for (ScoreRecord r : records) {
            View row = inflater.inflate(R.layout.item_score_row, llHistory, false);
            ((TextView) row.findViewById(R.id.tvRowLang)).setText(r.getLanguage() + " · " + r.getLevel());
            ((TextView) row.findViewById(R.id.tvRowScore)).setText(r.getScore() + "/" + r.getTotal() + " (" + r.getPercentage() + "%)");
            ((TextView) row.findViewById(R.id.tvRowDate)).setText(r.getDate());
            ((ProgressBar) row.findViewById(R.id.pbRow)).setProgress(r.getPercentage());
            llHistory.addView(row);
        }
    }
}
