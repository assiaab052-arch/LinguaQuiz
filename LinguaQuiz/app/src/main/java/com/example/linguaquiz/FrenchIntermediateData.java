package com.example.linguaquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrenchIntermediateData {
    public static List<StaticCourse> getCourses() {
        List<StaticCourse> list = new ArrayList<>();

        // 1. Le Passé Composé
        list.add(new StaticCourse("fr_int_1", Language.FRENCH, Level.INTERMEDIATE, 1, "Le Passé Composé", "Racontez des événements passés.", 
            "Auxiliaire (avoir / être) + Participe passé. Dr & Mrs Vandertramp utilisent être.",
            Arrays.asList(new VocabularyItem("Hier", "Yesterday"), new VocabularyItem("Parti", "Left")),
            Arrays.asList("Hier, j'ai travaillé.", "Elle est partie tôt."),
            Arrays.asList(
                new QuizQuestion(201, "Auxiliaire avec 'aller'?", Arrays.asList("Avoir", "Être", "Faire", "Vouloir"), 1),
                new QuizQuestion(202, "Participe passé de 'faire'?", Arrays.asList("Faisé", "Fais", "Fait", "Faisant"), 2),
                new QuizQuestion(203, "Complétez : 'Elle ___ partie'.", Arrays.asList("a", "est", "avait", "était"), 1),
                new QuizQuestion(204, "Participe passé de 'prendre'?", Arrays.asList("Prendu", "Prené", "Pris", "Prend"), 2),
                new QuizQuestion(205, "Nous ___ mangé.", Arrays.asList("sommes", "avons", "êtes", "ont"), 1),
                new QuizQuestion(206, "Laquelle est correcte?", Arrays.asList("Elle a allée.", "Il est mangé.", "Nous sommes partis.", "Tu as venue."), 2),
                new QuizQuestion(207, "Accord : 'Elles sont ___'?", Arrays.asList("arrivé", "arrivée", "arrivées", "arrivés"), 2),
                new QuizQuestion(208, "Passé composé de 'voir'?", Arrays.asList("J'ai vu", "Je suis vu", "J'ai voyé", "Je vois"), 0),
                new QuizQuestion(209, "Lequel prend ÊTRE?", Arrays.asList("Manger", "Parler", "Naître", "Finir"), 2),
                new QuizQuestion(210, "Passé composé de 'écrire'?", Arrays.asList("J'ai écrivé", "J'ai écrit", "Je suis écrit", "J'écrivais"), 1)
            )));

        // 2. L'Imparfait
        list.add(new StaticCourse("fr_int_2", Language.FRENCH, Level.INTERMEDIATE, 2, "L'Imparfait", "Descriptions et habitudes passées.", 
            "Terminaisons : -ais, -ais, -ait, -ions, -iez, -aient. Radical du présent (nous).",
            Arrays.asList(new VocabularyItem("Autrefois", "In the past"), new VocabularyItem("Enfant", "Child")),
            Arrays.asList("Quand j'étais petit...", "Il faisait beau."),
            Arrays.asList(
                new QuizQuestion(211, "Terminaison pour 'je'?", Arrays.asList("-e", "-ais", "-ai", "-is"), 1),
                new QuizQuestion(212, "Imparfait de 'être' (je)?", Arrays.asList("Je suis", "J'étais", "J'ai été", "Je serais"), 1),
                new QuizQuestion(213, "Habitude passée?", Arrays.asList("Il a mangé.", "Elle est adaptée.", "Nous regardions la télé.", "Ils ont fini."), 2),
                new QuizQuestion(214, "Temps du contexte?", Arrays.asList("Futur", "Présent", "Imparfait", "Passé composé"), 2),
                new QuizQuestion(215, "Ils (parler)?", Arrays.asList("Ils parlaient", "Ils ont parlé", "Ils parlent", "Ils parleront"), 0),
                new QuizQuestion(216, "Je ___ quand il ___.", Arrays.asList("dormais / a sonné", "dormais / est arrivé", "ai dormi / arrivait", "dormais / arrivait"), 1),
                new QuizQuestion(217, "Avoir (nous)?", Arrays.asList("Nous avions", "Nous avons eu", "Nous avons", "Nous aurions"), 0),
                new QuizQuestion(218, "'Autrefois' indique?", Arrays.asList("Futur", "Habitude passée", "Action immédiate", "Présent"), 1),
                new QuizQuestion(219, "Faire (tu)?", Arrays.asList("Tu fais", "Tu faisais", "Tu as fait", "Tu ferais"), 1),
                new QuizQuestion(220, "Laquelle est correcte?", Arrays.asList("Hier j'allais.", "Il allait au sport chaque lundi.", "Il est allait.", "Nous allâmes."), 1)
            )));

        // 3. Pronoms Relatifs
        list.add(new StaticCourse("fr_int_3", Language.FRENCH, Level.INTERMEDIATE, 3, "Les Pronoms Relatifs", "Relier des phrases.", 
            "Qui (sujet), Que (objet), Où (lieu/temps).",
            Arrays.asList(new VocabularyItem("Qui", "Who"), new VocabularyItem("Où", "Where")),
            Arrays.asList("L'homme qui chante.", "La ville où je vis."),
            Arrays.asList(
                new QuizQuestion(221, "La femme ___ parle?", Arrays.asList("que", "dont", "qui", "où"), 2),
                new QuizQuestion(222, "Le livre ___ je lis?", Arrays.asList("qui", "dont", "où", "que"), 3),
                new QuizQuestion(223, "Remplace 'de'?", Arrays.asList("Qui", "Que", "Dont", "Où"), 2),
                new QuizQuestion(224, "L'année ___ je suis né?", Arrays.asList("qui", "que", "dont", "où"), 3),
                new QuizQuestion(225, "L'ami ___ j'ai besoin?", Arrays.asList("qui", "que", "dont", "où"), 2),
                new QuizQuestion(226, "Laquelle est correcte?", Arrays.asList("La fille dont chante.", "Le livre qui j'aime.", "L'homme qui parle.", "La ville que habite."), 2),
                new QuizQuestion(227, "Le film ___ tu m'as parlé?", Arrays.asList("qui", "que", "dont", "où"), 2),
                new QuizQuestion(228, "'Où' exprime?", Arrays.asList("Sujet", "Lieu/Moment", "Objet", "Possesseur"), 1),
                new QuizQuestion(229, "La maison ___ ils habitent?", Arrays.asList("qui", "que", "dont", "où"), 3),
                new QuizQuestion(230, "Fonction de 'que'?", Arrays.asList("Sujet", "Objet direct", "Lieu", "Possesseur"), 1)
            )));

        // 4. Le Futur Simple
        list.add(new StaticCourse("fr_int_4", Language.FRENCH, Level.INTERMEDIATE, 4, "Le Futur Simple", "Projets et prédictions.", 
            "Infinitif + -ai, -as, -a, -ons, -ez, -ont.",
            Arrays.asList(new VocabularyItem("Demain", "Tomorrow"), new VocabularyItem("Irai", "Will go")),
            Arrays.asList("Demain, j'irai à la plage.", "Il fera chaud cet été."),
            Arrays.asList(
                new QuizQuestion(231, "Terminaison futur (je)?", Arrays.asList("-ais", "-ai", "-a", "-e"), 1),
                new QuizQuestion(232, "Futur de 'être' (je)?", Arrays.asList("J'étais", "J'ai été", "Je serai", "J'aurai"), 2),
                new QuizQuestion(233, "Futur de 'aller' (nous)?", Arrays.asList("Nous allons", "Nous allerons", "Nous irons", "Nous irions"), 2),
                new QuizQuestion(234, "Si tu viens, on ___ (faire)?", Arrays.asList("faisons", "ferons", "ferait", "avons fait"), 1),
                new QuizQuestion(235, "Exprime un projet?", Arrays.asList("J'ai fini.", "Je finis.", "Je finirai demain.", "Je finissais."), 2),
                new QuizQuestion(236, "Futur de 'voir' (il)?", Arrays.asList("Il voit", "Il verra", "Il voyait", "Il verrait"), 1),
                new QuizQuestion(237, "Futur de 'finir' (tu)?", Arrays.asList("Tu finissais", "Tu as fini", "Tu finiras", "Tu finisses"), 2),
                new QuizQuestion(238, "Futur de 'pouvoir' (je)?", Arrays.asList("Je peux", "Je pouvais", "Je pourrai", "Je pourrais"), 2),
                new QuizQuestion(239, "Structure conditionnelle?", Arrays.asList("Si+imp+cond", "Si+pres+fut", "Si+fut+pres", "Si+pc+fut"), 1),
                new QuizQuestion(240, "Futur de 'venir' (ils)?", Arrays.asList("Ils venaient", "Ils sont venus", "Ils viendront", "Ils viendraient"), 2)
            )));

        // 5. Expressions Idiomatiques
        list.add(new StaticCourse("fr_int_5", Language.FRENCH, Level.INTERMEDIATE, 5, "Expressions Idiomatiques", "Parlez comme un natif.", 
            "Avoir le cafard (déprimé), Il pleut des cordes (forte pluie).",
            Arrays.asList(new VocabularyItem("Cafard", "Blues"), new VocabularyItem("Lapin", "Rabbit/Stand up")),
            Arrays.asList("J'ai le cafard aujourd'hui.", "Il m'a posé un lapin."),
            Arrays.asList(
                new QuizQuestion(241, "Avoir le cafard?", Arrays.asList("Heureux", "Triste", "Fatigué", "Faim"), 1),
                new QuizQuestion(242, "Il pleut des cordes?", Arrays.asList("Neige", "Pluie forte", "Vent", "Soleil"), 1),
                new QuizQuestion(243, "Poser un lapin?", Arrays.asList("Cadeau", "Rdv manqué", "Agacer", "Aider"), 1),
                new QuizQuestion(244, "Faire la grasse matinée?", Arrays.asList("Manger bcp", "Cuisiner", "Dormir tard", "Courir"), 2),
                new QuizQuestion(245, "Donner sa langue au chat?", Arrays.asList("Nourrir", "Abandonner", "Trop parler", "Être timide"), 1),
                new QuizQuestion(246, "Tomber dans les pommes?", Arrays.asList("Marché", "Cuisiner", "S'évanouir", "Surprise"), 2),
                new QuizQuestion(247, "Mettre les pieds dans le plat?", Arrays.asList("Être maladroit", "Manger", "Marcher", "Inviter"), 0),
                new QuizQuestion(248, "Casser les pieds?", Arrays.asList("Aider", "Marcher", "Ennuyer/Agacer", "Soigner"), 2),
                new QuizQuestion(249, "Avoir d'autres chats à fouetter?", Arrays.asList("Aimer chats", "Choses plus importantes", "Être cruel", "Rien à faire"), 1),
                new QuizQuestion(250, "Prendre ses jambes à son cou?", Arrays.asList("S'enfuir", "S'asseoir", "Danser", "Sauter"), 0)
            )));

        return list;
    }
}
