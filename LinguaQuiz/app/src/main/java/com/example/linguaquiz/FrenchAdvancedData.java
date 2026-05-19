package com.example.linguaquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrenchAdvancedData {
    public static List<StaticCourse> getCourses() {
        List<StaticCourse> list = new ArrayList<>();

        // 1. Le Subjonctif
        list.add(new StaticCourse("fr_adv_1", Language.FRENCH, Level.ADVANCED, 1, "Le Subjonctif", "Doute, volonté et émotion.", "Que je sois, que j'aie, que j'aille. Utilisé après 'il faut que'.",
            Arrays.asList(new VocabularyItem("vienne", "come (subj.)"), new VocabularyItem("sache", "know (subj.)")),
            Arrays.asList("Il faut que tu viennes.", "Je doute qu'il sache."),
            Arrays.asList(
                new QuizQuestion(301, "Déclencheur subjonctif?", Arrays.asList("Je pense que", "Je sais que", "Il faut que", "Je vois que"), 2),
                new QuizQuestion(302, "Subjonctif de 'être' (je)?", Arrays.asList("Que je suis", "Que j'étais", "Que je sois", "Que j'aie été"), 2)
            )));

        // 2. Le Conditionnel
        list.add(new StaticCourse("fr_adv_2", Language.FRENCH, Level.ADVANCED, 2, "Le Conditionnel", "Hypothèses et regrets.", "Si + imparfait -> conditionnel présent. Si + plus-que-parfait -> conditionnel passé.",
            Arrays.asList(new VocabularyItem("irais", "would go"), new VocabularyItem("aurais dû", "should have")),
            Arrays.asList("Si j'avais su, je serais venu.", "Je voudrais un thé."),
            Arrays.asList(
                new QuizQuestion(303, "Si + imparfait -> ?", Arrays.asList("Futur", "Conditionnel", "Présent", "Passé"), 1),
                new QuizQuestion(304, "Regret passé?", Arrays.asList("J'irai", "J'irais", "J'aurais dû", "Je suis allé"), 2)
            )));

        // 3. La Voix Passive
        list.add(new StaticCourse("fr_adv_3", Language.FRENCH, Level.ADVANCED, 3, "La Voix Passive", "Focus sur l'action.", "Être + participe passé. Le complément d'agent est introduit par 'par'.",
            Arrays.asList(new VocabularyItem("est mangé", "is eaten"), new VocabularyItem("par", "by")),
            Arrays.asList("La souris est mangée par le chat.", "Le livre a été lu."),
            Arrays.asList(
                new QuizQuestion(305, "Forme passive?", Arrays.asList("Avoir + part", "Être + participe", "Faire + inf", "Se + verbe"), 1),
                new QuizQuestion(306, "Agent introduit par?", Arrays.asList("À", "Avec", "Par", "Pour"), 2)
            )));

        // 4. Argumentation
        list.add(new StaticCourse("fr_adv_4", Language.FRENCH, Level.ADVANCED, 4, "Argumentation", "Connecteurs logiques.", "En revanche, néanmoins, par conséquent, toutefois.",
            Arrays.asList(new VocabularyItem("certes", "admittedly"), new VocabularyItem("toutefois", "however")),
            Arrays.asList("Certes, c'est cher, mais c'est bien.", "Par conséquent, on reste."),
            Arrays.asList(
                new QuizQuestion(307, "Indique la conséquence?", Arrays.asList("En outre", "Par conséquent", "Certes", "Mais"), 1),
                new QuizQuestion(308, "Synonyme de 'cependant'?", Arrays.asList("Néanmoins", "Car", "Ainsi", "Puisque"), 0)
            )));

        return list;
    }
}
