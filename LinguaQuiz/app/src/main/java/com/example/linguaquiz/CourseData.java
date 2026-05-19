package com.example.linguaquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseData {

    public static List<StaticCourse> getAllCourses() {
        List<StaticCourse> all = new ArrayList<>();
        
        // ==========================================
        //  FRANÇAIS – DÉBUTANT
        // ==========================================
        all.add(new StaticCourse(
            "fr_beg_1",
            Language.FRENCH,
            Level.BEGINNER,
            1,
            "Les Salutations",
            "Saluer et se présenter.",
            "Bonjour (jour), Bonsoir (soir), Salut (ami).",
            Arrays.asList(new VocabularyItem("Bonjour", "Hello"), new VocabularyItem("Merci", "Thank you")),
            Arrays.asList("Bonjour, je m'appelle Marie.", "Ravi de vous rencontrer."),
            Arrays.asList(
                new QuizQuestion(1, "Comment dit-on 'Hello'?", Arrays.asList("Salut", "Bonjour", "Merci", "Chat"), 1),
                new QuizQuestion(2, "Salutation informelle?", Arrays.asList("Bonjour", "Bonsoir", "Salut", "Au revoir"), 2),
                new QuizQuestion(3, "Comment dit-on 'Goodbye'?", Arrays.asList("Salut", "Merci", "Au revoir", "Pardon"), 2),
                new QuizQuestion(4, "'Enchanté' signifie ?", Arrays.asList("Happy", "Nice to meet you", "Welcome", "Please"), 1),
                new QuizQuestion(5, "Quand dit-on 'Bonsoir'?", Arrays.asList("Le matin", "À midi", "Le soir", "Jamais"), 2),
                new QuizQuestion(6, "S'il vous plaît?", Arrays.asList("Please", "Thank you", "Sorry", "Yes"), 0),
                new QuizQuestion(7, "Comment dit-on 'My name is'?", Arrays.asList("J'habite", "Je m'appelle", "J'ai", "Je suis"), 1),
                new QuizQuestion(8, "Réponse à Merci?", Arrays.asList("De rien", "Bonjour", "Au revoir", "S'il vous plaît"), 0),
                new QuizQuestion(9, "Salut signifie?", Arrays.asList("Hello only", "Goodbye only", "Both Hello and Bye", "Nothing"), 2),
                new QuizQuestion(10, "Pardon?", Arrays.asList("Please", "Sorry", "Thanks", "Hello"), 1)
            )));

        all.add(new StaticCourse(
            "fr_beg_2",
            Language.FRENCH,
            Level.BEGINNER,
            2,
            "Les Nombres",
            "Compter de 0 à 20.",
            "1 un, 2 deux, 3 trois... 10 dix, 20 vingt.",
            Arrays.asList(new VocabularyItem("Dix", "Ten"), new VocabularyItem("Vingt", "Twenty")),
            Arrays.asList("J'ai deux chats.", "Il y a dix élèves."),
            Arrays.asList(
                new QuizQuestion(1, "Nombre 17?", Arrays.asList("Seize", "Dix-sept", "Dix-huit", "Sept"), 1),
                new QuizQuestion(2, "2 + 3 = ?", Arrays.asList("Quatre", "Cinq", "Six", "Sept"), 1),
                new QuizQuestion(3, "Nombre 12?", Arrays.asList("Onze", "Douze", "Treize", "Vingt"), 1),
                new QuizQuestion(4, "20 en français?", Arrays.asList("Dix", "Vingt", "Trente", "Cent"), 1),
                new QuizQuestion(5, "15?", Arrays.asList("Quatorze", "Quinze", "Seize", "Cinq"), 1),
                new QuizQuestion(6, "Après 19?", Arrays.asList("Dix", "Vingt", "Trente", "Onze"), 1),
                new QuizQuestion(7, "Nombre 8?", Arrays.asList("Six", "Sept", "Huit", "Neuf"), 2),
                new QuizQuestion(8, "11?", Arrays.asList("Dix", "Onze", "Douze", "Un"), 1),
                new QuizQuestion(9, "Zéro?", Arrays.asList("0", "1", "10", "100"), 0),
                new QuizQuestion(10, "Combien font dix + dix?", Arrays.asList("Dix", "Vingt", "Trente", "Cent"), 1)
            )));

        // ==========================================
        //  FRANÇAIS – INTERMÉDIAIRE
        // ==========================================
        all.add(new StaticCourse(
            "fr_int_1",
            Language.FRENCH,
            Level.INTERMEDIATE,
            1,
            "Le Passé Composé",
            "Raconter des actions passées.",
            "Auxiliaire (avoir/être) + Participe passé.",
            Arrays.asList(new VocabularyItem("Hier", "Yesterday"), new VocabularyItem("Mangé", "Eaten")),
            Arrays.asList("J'ai mangé une pomme.", "Elle est allée au parc."),
            Arrays.asList(
                new QuizQuestion(1, "Auxiliaire avec 'Aller'?", Arrays.asList("Avoir", "Être", "Faire", "Vouloir"), 1),
                new QuizQuestion(2, "Participe de 'Prendre'?", Arrays.asList("Prendu", "Pris", "Prené", "Prend"), 1),
                new QuizQuestion(3, "Hier, j'___ (finir).", Arrays.asList("ai fini", "suis fini", "finit", "finis"), 0),
                new QuizQuestion(4, "Elle ___ (partir).", Arrays.asList("a parti", "est partie", "partira", "partait"), 1),
                new QuizQuestion(5, "Nous ___ (voir).", Arrays.asList("avons vu", "sommes vu", "voyons", "vu"), 0),
                new QuizQuestion(6, "Lequel utilise Être?", Arrays.asList("Manger", "Venir", "Finir", "Boire"), 1),
                new QuizQuestion(7, "Participe de 'Faire'?", Arrays.asList("Fait", "Faisé", "Fas", "Fais"), 0),
                new QuizQuestion(8, "Tu ___ (boire).", Arrays.asList("as bu", "es bu", "buvais", "boiras"), 0),
                new QuizQuestion(9, "Ils ___ (arriver).", Arrays.asList("ont arrivés", "sont arrivés", "arrivent", "arrivait"), 1),
                new QuizQuestion(10, "Participe de 'Être'?", Arrays.asList("Été", "Êtru", "Suis", "Était"), 0)
            )));

        // ==========================================
        //  ENGLISH – BEGINNER
        // ==========================================
        all.add(new StaticCourse(
            "en_beg_1",
            Language.ENGLISH,
            Level.BEGINNER,
            1,
            "Greetings",
            "Basic English greetings.",
            "Hello, Hi, Good morning, Good night.",
            Arrays.asList(new VocabularyItem("Hello", "Bonjour"), new VocabularyItem("Goodbye", "Au revoir")),
            Arrays.asList("Hello, how are you?", "Have a nice day!"),
            Arrays.asList(
                new QuizQuestion(1, "Bonjour in English?", Arrays.asList("Bye", "Hello", "Thanks", "No"), 1),
                new QuizQuestion(2, "Evening greeting?", Arrays.asList("Good morning", "Good afternoon", "Good evening", "Hi"), 2),
                new QuizQuestion(3, "What is 'Thanks'?", Arrays.asList("Pardon", "Merci", "S'il vous plaît", "Bonjour"), 1),
                new QuizQuestion(4, "Before bed?", Arrays.asList("Good morning", "Good night", "Good afternoon", "Hello"), 1),
                new QuizQuestion(5, "Nice to ___ you.", Arrays.asList("see", "hear", "meet", "know"), 2),
                new QuizQuestion(6, "Formal 'Salut'?", Arrays.asList("Hi", "Hello", "Hey", "Yo"), 1),
                new QuizQuestion(7, "Au revoir?", Arrays.asList("Welcome", "Please", "Goodbye", "Thanks"), 2),
                new QuizQuestion(8, "De rien?", Arrays.asList("Welcome", "You're welcome", "Please", "No"), 1),
                new QuizQuestion(9, "Response to 'How are you?'", Arrays.asList("I'm fine", "I'm John", "Goodbye", "Yes"), 0),
                new QuizQuestion(10, "Pardon?", Arrays.asList("Sorry", "Thanks", "Please", "Hello"), 0)
            )));

        all.add(new StaticCourse(
            "en_beg_2",
            Language.ENGLISH,
            Level.BEGINNER,
            2,
            "Daily Routines",
            "Simple Present for habits.",
            "I wake up, I eat, I sleep. Use always/never.",
            Arrays.asList(new VocabularyItem("Always", "Toujours"), new VocabularyItem("Usually", "Habituellement")),
            Arrays.asList("I always drink water.", "She usually works at home."),
            Arrays.asList(
                new QuizQuestion(1, "He ___ (wake) up.", Arrays.asList("wake", "wakes", "waking", "woke"), 1),
                new QuizQuestion(2, "I ___ like tea.", Arrays.asList("don't", "doesn't", "am not", "no"), 0),
                new QuizQuestion(3, "100% frequency?", Arrays.asList("Never", "Sometimes", "Often", "Always"), 3),
                new QuizQuestion(4, "She ___ (go) home.", Arrays.asList("go", "goes", "going", "gone"), 1),
                new QuizQuestion(5, "Question for 'you'?", Arrays.asList("Do you", "Does you", "Is you", "Are you"), 0),
                new QuizQuestion(6, "Never means:", Arrays.asList("Toujours", "Souvent", "Jamais", "Parfois"), 2),
                new QuizQuestion(7, "They ___ (play) football.", Arrays.asList("play", "plays", "playing", "played"), 0),
                new QuizQuestion(8, "Does he ___ lunch?", Arrays.asList("has", "have", "having", "had"), 1),
                new QuizQuestion(9, "Usually?", Arrays.asList("Habituellement", "Jamais", "Toujours", "Rarement"), 0),
                new QuizQuestion(10, "We ___ (not) sleep.", Arrays.asList("don't", "doesn't", "no", "not"), 0)
            )));

        // ==========================================
        //  ENGLISH – INTERMEDIATE
        // ==========================================
        all.add(new StaticCourse(
            "en_int_1",
            Language.ENGLISH,
            Level.INTERMEDIATE,
            1,
            "Present Perfect",
            "Life experiences.",
            "Have/Has + past participle. Since/For.",
            Arrays.asList(new VocabularyItem("Ever", "Déjà"), new VocabularyItem("Since", "Depuis")),
            Arrays.asList("I have been to London.", "She has worked here for 2 years."),
            Arrays.asList(
                new QuizQuestion(1, "I ___ (see) it.", Arrays.asList("saw", "have seen", "am seeing", "see"), 1),
                new QuizQuestion(2, "Since 2010?", Arrays.asList("For", "Since", "Ago", "Last"), 1),
                new QuizQuestion(3, "Have you ___ been?", Arrays.asList("already", "ever", "just", "yet"), 1),
                new QuizQuestion(4, "She ___ (not) finish.", Arrays.asList("hasn't", "didn't", "haven't", "isn't"), 0),
                new QuizQuestion(5, "For 5 years?", Arrays.asList("For", "Since", "Ago", "During"), 0),
                new QuizQuestion(6, "He ___ just arrived.", Arrays.asList("is", "has", "was", "does"), 1),
                new QuizQuestion(7, "Participle of 'Go'?", Arrays.asList("Went", "Gone", "Goes", "Going"), 1),
                new QuizQuestion(8, "We ___ known him.", Arrays.asList("have", "has", "are", "were"), 0),
                new QuizQuestion(9, "Already vs Yet?", Arrays.asList("Already in neg", "Yet in neg", "Both same", "None"), 1),
                new QuizQuestion(10, "They ___ (be) here.", Arrays.asList("has been", "have been", "are", "were"), 1)
            )));

        return all;
    }
}
