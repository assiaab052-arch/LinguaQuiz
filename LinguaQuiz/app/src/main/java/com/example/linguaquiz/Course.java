package com.example.linguaquiz;

public class Course {
    private int id;
    private String title;
    private String description;
    private String content;
    private String vocab;
    private String examples;
    private String language;
    private String level;
    private int orderIndex;
    private boolean isUnlocked;
    private boolean isCompleted;
    private int progress;

    public Course(int id, String title, String description, String content, String vocab, String examples, String language, String level, int orderIndex) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.vocab = vocab;
        this.examples = examples;
        this.language = language;
        this.level = level;
        this.orderIndex = orderIndex;
        this.isUnlocked = false;
        this.isCompleted = false;
        this.progress = 0;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getContent() { return content; }
    public String getVocab() { return vocab; }
    public String getExamples() { return examples; }
    public String getLanguage() { return language; }
    public String getLevel() { return level; }
    public int getOrderIndex() { return orderIndex; }
    public boolean isUnlocked() { return isUnlocked; }
    public void setUnlocked(boolean unlocked) { isUnlocked = unlocked; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
    public int getProgress() { return progress; }
    public void setProgress(int progress) { this.progress = progress; }
}
