package com.example.linguaquiz

enum class Language { FRENCH, ENGLISH }
enum class Level { BEGINNER, INTERMEDIATE, ADVANCED }

data class VocabularyItem @JvmOverloads constructor(
    @JvmField val word: String,
    @JvmField val translation: String,
    @JvmField val phonetic: String = "",
    @JvmField val exampleSentence: String = ""
)

data class QuizQuestion @JvmOverloads constructor(
    @JvmField val id: Int,
    @JvmField val question: String,
    @JvmField val choices: List<String>,
    @JvmField val correctAnswerIndex: Int,
    @JvmField val explanation: String = ""
)

data class StaticCourse(
    @JvmField val id: String,
    @JvmField val language: Language,
    @JvmField val level: Level,
    @JvmField val orderIndex: Int,
    @JvmField val title: String,
    @JvmField val description: String,
    @JvmField val theoryContent: String,
    @JvmField val vocabulary: List<VocabularyItem>,
    @JvmField val exampleSentences: List<String>,
    @JvmField val quiz: List<QuizQuestion>
)
