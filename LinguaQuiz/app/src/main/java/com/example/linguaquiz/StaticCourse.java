package com.example.linguaquiz;

import java.util.List;

/**
 * @deprecated Utiliser la version Kotlin dans CourseModels.kt
 */
@Deprecated
class StaticCourseJava {
    public String title;
    public String description;
    public String content;
    public List<VocabularyItemJava> vocabulary;
    public List<String> examples;
    public String language;
    public String level;
    public int orderIndex;
    public List<QuizQuestionData> quiz;

    public StaticCourseJava(String title, String description, String content, List<VocabularyItemJava> vocabulary, 
                        List<String> examples, String language, String level, int orderIndex, 
                        List<QuizQuestionData> quiz) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.vocabulary = vocabulary;
        this.examples = examples;
        this.language = language;
        this.level = level;
        this.orderIndex = orderIndex;
        this.quiz = quiz;
    }
}
