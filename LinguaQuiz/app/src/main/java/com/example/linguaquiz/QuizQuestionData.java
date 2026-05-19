package com.example.linguaquiz;

import java.util.List;

public class QuizQuestionData {
    public String question;
    public List<String> choices;
    public int correctAnswerIndex;

    public QuizQuestionData(String question, List<String> choices, int correctAnswerIndex) {
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
