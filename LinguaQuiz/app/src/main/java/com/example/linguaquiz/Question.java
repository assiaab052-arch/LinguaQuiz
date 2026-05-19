package com.example.linguaquiz;

public class Question {
    private int id;
    private String text;
    private String optionA, optionB, optionC, optionD;
    private String correctOption; // "A","B","C","D"
    private String language;
    private String category;
    private String level;
    private String imageRes;
    private int courseId; // Ajouté pour lier au cours

    public Question(int id, String text, String optionA, String optionB,
                    String optionC, String optionD, String correctOption,
                    String language, String category, String level, String imageRes, int courseId) {
        this.id = id;
        this.text = text;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
        this.language = language;
        this.category = category;
        this.level = level;
        this.imageRes = imageRes;
        this.courseId = courseId;
    }

    public int getId() { return id; }
    public String getText() { return text; }
    public String getOptionA() { return optionA; }
    public String getOptionB() { return optionB; }
    public String getOptionC() { return optionC; }
    public String getOptionD() { return optionD; }
    public String getCorrectOption() { return correctOption; }
    public String getLanguage() { return language; }
    public String getCategory() { return category; }
    public String getLevel() { return level; }
    public String getImageRes() { return imageRes; }
    public int getCourseId() { return courseId; }

    public String getCorrectAnswer() {
        switch (correctOption) {
            case "A": return optionA;
            case "B": return optionB;
            case "C": return optionC;
            case "D": return optionD;
            default: return optionA;
        }
    }
}
