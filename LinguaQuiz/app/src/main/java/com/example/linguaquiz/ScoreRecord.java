package com.example.linguaquiz;

public class ScoreRecord {
    private String language;
    private String level;
    private int score;
    private int total;
    private String date;

    public ScoreRecord(String language, String level, int score, int total, String date) {
        this.language = language;
        this.level = level;
        this.score = score;
        this.total = total;
        this.date = date;
    }

    public String getLanguage() { return language; }
    public String getLevel() { return level; }
    public int getScore() { return score; }
    public int getTotal() { return total; }
    public String getDate() { return date; }
    public int getPercentage() { return total > 0 ? (score * 100 / total) : 0; }
}
