package com.example.linguaquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrenchBeginnerData {
    public static List<StaticCourse> getCourses() {
        List<StaticCourse> list = new ArrayList<>();

        // 1. Les Salutations
        list.add(new StaticCourse("fr_beg_1", Language.FRENCH, Level.BEGINNER, 1, "Les Salutations", "Saluer et se présenter.", "Bonjour (jour), Bonsoir (soir), Salut (informel).",
            Arrays.asList(new VocabularyItem("Bonjour", "Hello"), new VocabularyItem("Merci", "Thank you")),
            Arrays.asList("Bonjour, comment ça va ?", "Je m'appelle Marie."),
            Arrays.asList(new QuizQuestion(1, "Hello?", Arrays.asList("Salut", "Bonjour", "Merci", "Chat"), 1),
                          new QuizQuestion(2, "Goodbye?", Arrays.asList("Bonjour", "Merci", "Salut", "Au revoir"), 3))));

        // 2. Les Chiffres
        list.add(new StaticCourse("fr_beg_2", Language.FRENCH, Level.BEGINNER, 2, "Les Chiffres", "Compter de 0 à 100.", "1 un, 2 deux, 10 dix, 20 vingt, 100 cent.",
            Arrays.asList(new VocabularyItem("Dix", "Ten"), new VocabularyItem("Cent", "Hundred")),
            Arrays.asList("J'ai vingt ans.", "Il y a dix élèves."),
            Arrays.asList(new QuizQuestion(3, "17?", Arrays.asList("Dix-sept", "Septante", "Seize", "Dix"), 0),
                          new QuizQuestion(4, "80?", Arrays.asList("Huitante", "Quatre-vingts", "Cent", "Soixante"), 1))));

        // 3. Couleurs
        list.add(new StaticCourse("fr_beg_3", Language.FRENCH, Level.BEGINNER, 3, "Les Couleurs", "Décrire le monde.", "Rouge, bleu, vert, jaune, blanc, noir.",
            Arrays.asList(new VocabularyItem("Rouge", "Red"), new VocabularyItem("Vert", "Green")),
            Arrays.asList("La voiture est rouge.", "L'herbe est verte."),
            Arrays.asList(new QuizQuestion(5, "Green?", Arrays.asList("Gris", "Bleu", "Vert", "Jaune"), 2),
                          new QuizQuestion(6, "White (fem)?", Arrays.asList("Blance", "Blanche", "Blanc", "Noir"), 1))));

        // 4. Famille
        list.add(new StaticCourse("fr_beg_4", Language.FRENCH, Level.BEGINNER, 4, "La Famille", "Parlez de vos proches.", "Le père, la mère, le frère, la sœur.",
            Arrays.asList(new VocabularyItem("Père", "Father"), new VocabularyItem("Mère", "Mother")),
            Arrays.asList("Mon père est Paul.", "J'ai une sœur."),
            Arrays.asList(new QuizQuestion(7, "Mother?", Arrays.asList("Père", "Mère", "Sœur", "Fille"), 1),
                          new QuizQuestion(8, "Grandparents?", Arrays.asList("Parents", "Enfants", "Grands-parents", "Amis"), 2))));

        // 5. Nourriture
        list.add(new StaticCourse("fr_beg_5", Language.FRENCH, Level.BEGINNER, 5, "Nourriture", "Au restaurant.", "Le pain, le fromage, l'eau, le vin.",
            Arrays.asList(new VocabularyItem("Pain", "Bread"), new VocabularyItem("Eau", "Water")),
            Arrays.asList("Je voudrais un café.", "L'addition s'il vous plaît."),
            Arrays.asList(new QuizQuestion(9, "I would like?", Arrays.asList("J'aime", "Je voudrais", "Je mange", "Merci"), 1),
                          new QuizQuestion(10, "The bill?", Arrays.asList("Le menu", "Le plat", "L'addition", "Le prix"), 2))));

        // 6. Météo
        list.add(new StaticCourse("fr_beg_6", Language.FRENCH, Level.BEGINNER, 6, "La Météo", "Le temps qu'il fait.", "Il fait beau, il pleut, il neige.",
            Arrays.asList(new VocabularyItem("Beau", "Fine"), new VocabularyItem("Pluie", "Rain")),
            Arrays.asList("Il fait beau aujourd'hui.", "Il pleut dehors."),
            Arrays.asList(new QuizQuestion(11, "It rains?", Arrays.asList("Il neige", "Il fait beau", "Il pleut", "Froid"), 2),
                          new QuizQuestion(12, "Nice weather?", Arrays.asList("Mauvais", "Beau", "Pluie", "Vent"), 1))));

        return list;
    }
}
