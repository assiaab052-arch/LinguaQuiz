package com.example.linguaquiz

// ═══════════════════════════════════════════════════════════════
//  FRENCH  –  INTERMEDIATE  (5 courses)
// ═══════════════════════════════════════════════════════════════

val frenchIntermediateCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "fr_i_01",
        language = Language.FRENCH,
        level = Level.INTERMEDIATE,
        orderIndex = 1,
        title = "Le Passé Composé",
        description = "Racontez des événements passés avec le passé composé.",
        theoryContent = """
<b>Formation du passé composé</b><br>
Auxiliaire (avoir / être) + Participe passé<br><br>
<b>Avec AVOIR :</b> j'ai mangé · tu as fini · il a pris<br>
<b>Avec ÊTRE :</b> je suis allé(e) · tu es arrivé(e) · elle est partie<br><br>
<b>Verbes avec ÊTRE (Dr & Mrs Vandertramp) :</b><br>
Devenir · Revenir · Monter · Retourner · Sortir<br>
Venir · Aller · Naître · Descendre · Entrer · Rentrer · Tomber · Rester · Arriver · Mourir · Partir<br><br>
<b>Participes passés irréguliers :</b><br>
faire → fait · prendre → pris · voir → vu · être → été<br>
avoir → eu · boire → bu · écrire → écrit · lire → lu
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("j'ai mangé", "I ate", "", "J'ai mangé une pizza hier."),
            VocabularyItem("je suis allé(e)", "I went", "", "Je suis allée au cinéma."),
            VocabularyItem("il a pris", "he took", "", "Il a pris le train de 8h."),
            VocabularyItem("elle est partie", "she left", "", "Elle est partie tôt ce matin."),
            VocabularyItem("nous avons vu", "we saw", "", "Nous avons vu un beau film."),
            VocabularyItem("ils sont arrivés", "they arrived", "", "Ils sont arrivés en retard.")
        ),
        exampleSentences = listOf(
            "Hier, j'ai travaillé toute la journée.",
            "Elle est née en 1995 à Paris.",
            "Nous sommes allés au musée samedi dernier.",
            "Tu as fini tes devoirs ?",
            "Il a bu un café et il est sorti.",
            "Elles sont restées à la maison pendant le week-end."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quel auxiliaire utilise-t-on avec 'aller' au passé composé ?",
                listOf("Avoir", "Être", "Faire", "Vouloir"), 1, "Aller se conjugue avec être."),
            QuizQuestion(2, "Quel est le participe passé de 'faire' ?",
                listOf("Faisé", "Fais", "Fait", "Faisant"), 2, "Faire → fait."),
            QuizQuestion(3, "Complétez : 'Elle ___ partie tôt.'",
                listOf("a", "est", "avait", "était"), 1, "Partir → être → elle est partie."),
            QuizQuestion(4, "Quel est le participe passé de 'prendre' ?",
                listOf("Prendu", "Prené", "Pris", "Prend"), 2, "Prendre → pris."),
            QuizQuestion(5, "Complétez : 'Nous ___ mangé au restaurant.'",
                listOf("sommes", "avons", "êtes", "ont"), 1, "Manger → avoir → nous avons."),
            QuizQuestion(6, "Laquelle de ces phrases est correcte ?",
                listOf("Elle a allée.", "Il est mangé.", "Nous sommes partis.", "Tu as venue."), 2,
                "Partir → être → nous sommes partis (accord au pluriel)."),
            QuizQuestion(7, "Accordez le participe : 'Elles sont ___ (arriver)'",
                listOf("arrivé", "arrivée", "arrivées", "arrivés"), 2,
                "Être + sujet féminin pluriel → arrivées."),
            QuizQuestion(8, "Quel est le passé composé de 'voir' ?",
                listOf("J'ai vu", "Je suis vu", "J'ai voyé", "Je vois"), 0, "Voir → avoir → j'ai vu."),
            QuizQuestion(9, "Quel verbe prend ÊTRE au passé composé ?",
                listOf("Manger", "Parler", "Naître", "Finir"), 2, "Naître fait partie du groupe Dr & Mrs Vandertramp."),
            QuizQuestion(10, "Quel est le passé composé de 'écrire' ?",
                listOf("J'ai écrivé", "J'ai écrit", "Je suis écrit", "J'écrivais"), 1, "Écrire → écrit.")
        )
    ),

    StaticCourse(
        id = "fr_i_02",
        language = Language.FRENCH,
        level = Level.INTERMEDIATE,
        orderIndex = 2,
        title = "L'Imparfait",
        description = "Décrivez des situations passées et des habitudes avec l'imparfait.",
        theoryContent = """
<b>Formation de l'imparfait</b><br>
Radical du présent (nous) + terminaisons :<br>
-ais · -ais · -ait · -ions · -iez · -aient<br><br>
<b>Exemple avec 'parler' :</b><br>
je parlais · tu parlais · il parlait · nous parlions · vous parliez · ils parlaient<br><br>
<b>Exception : être → j'étais (radical : ét-)</b><br><br>
<b>Emplois de l'imparfait :</b><br>
• Description : Il faisait beau, le ciel était bleu.<br>
• Habitude : Chaque soir, je lisais un livre.<br>
• Action en cours interrompue : Je dormais quand le téléphone a sonné.<br><br>
<b>Imparfait vs Passé composé :</b><br>
Imparfait = décor/contexte · Passé composé = action principale
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("je faisais", "I was doing / I used to do", "", "Je faisais du sport chaque semaine."),
            VocabularyItem("il habitait", "he lived / he used to live", "", "Il habitait à Bordeaux."),
            VocabularyItem("nous allions", "we used to go", "", "Nous allions à la plage en été."),
            VocabularyItem("quand j'étais enfant", "when I was a child", "", "Quand j'étais enfant, j'adorais les bonbons."),
            VocabularyItem("autrefois", "in the past / formerly", "", "Autrefois, il n'y avait pas Internet."),
            VocabularyItem("chaque jour", "every day", "", "Chaque jour, elle prenait le bus.")
        ),
        exampleSentences = listOf(
            "Quand j'étais petit, j'habitais à la campagne.",
            "Il pleuvait et le vent soufflait fort.",
            "Chaque été, nous partions en vacances en Bretagne.",
            "Je lisais quand mon ami a appelé.",
            "Elle était fatiguée, alors elle s'est couchée tôt.",
            "Autrefois, les gens voyageaient beaucoup moins."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quelle est la terminaison de l'imparfait pour 'je' ?",
                listOf("-e", "-ais", "-ai", "-is"), 1, "Je → -ais à l'imparfait."),
            QuizQuestion(2, "Quel est l'imparfait de 'être' à la 1ère personne ?",
                listOf("Je suis", "J'étais", "J'ai été", "Je serais"), 1, "Être → j'étais (radical ét-)."),
            QuizQuestion(3, "Quelle phrase exprime une habitude passée ?",
                listOf("Il a mangé une pizza.", "Elle est arrivée.", "Chaque soir, nous regardions la télé.", "Ils ont fini."), 2,
                "L'habitude passée → imparfait."),
            QuizQuestion(4, "Quel temps décrit le contexte d'une histoire ?",
                listOf("Le futur", "Le présent", "L'imparfait", "Le passé composé"), 2,
                "L'imparfait décrit le décor/contexte."),
            QuizQuestion(5, "Conjuguez 'parler' à l'imparfait, 3ème personne pluriel.",
                listOf("Ils parlaient", "Ils ont parlé", "Ils parlent", "Ils parleront"), 0,
                "Parler → ils parlaient."),
            QuizQuestion(6, "Choisissez le bon temps : 'Je ___ (dormir) quand il ___ (arriver).'",
                listOf("dormais / a sonné", "dormais / est arrivé", "ai dormi / arrivait", "dormais / arrivait"), 1,
                "Imparfait (contexte) + passé composé (action)."),
            QuizQuestion(7, "Quelle est la forme correcte de 'avoir' à l'imparfait, 'nous' ?",
                listOf("Nous avions", "Nous avons eu", "Nous avons", "Nous aurions"), 0,
                "Avoir → nous avions."),
            QuizQuestion(8, "Que signifie 'Autrefois, les gens vivaient différemment' ?",
                listOf("In the future, people will live differently.",
                    "In the past, people used to live differently.",
                    "Today, people live differently.", "People live differently."), 1,
                "Autrefois + imparfait = past habits/situations."),
            QuizQuestion(9, "Quel est l'imparfait de 'faire' à la 2ème personne du singulier ?",
                listOf("Tu fais", "Tu faisais", "Tu as fait", "Tu ferais"), 1, "Faire → tu faisais."),
            QuizQuestion(10, "Quelle phrase utilise correctement l'imparfait ?",
                listOf("Hier j'allais au cinéma.", "Chaque lundi, il allait à la salle de sport.",
                    "Il est allait.", "Nous allâmes."), 1,
                "Habitude régulière → imparfait.")
        )
    ),

    StaticCourse(
        id = "fr_i_03",
        language = Language.FRENCH,
        level = Level.INTERMEDIATE,
        orderIndex = 3,
        title = "Les Pronoms Relatifs",
        description = "Reliez des propositions avec qui, que, dont et où.",
        theoryContent = """
<b>Les pronoms relatifs</b><br><br>
<b>QUI</b> = sujet du verbe de la relative<br>
→ L'homme <b>qui</b> parle est mon professeur. (qui = l'homme)<br><br>
<b>QUE / QU'</b> = objet direct du verbe de la relative<br>
→ Le livre <b>que</b> je lis est intéressant. (que = le livre)<br><br>
<b>DONT</b> = complément introduit par 'de'<br>
→ Le film <b>dont</b> je parle est superbe. (parler DE ce film)<br>
→ L'ami <b>dont</b> j'ai besoin est là. (avoir besoin DE)<br><br>
<b>OÙ</b> = lieu ou temps<br>
→ La ville <b>où</b> je vis est magnifique.<br>
→ L'année <b>où</b> elle est née, tout a changé.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("qui", "who / which (subject)", "", "La fille qui chante est ma cousine."),
            VocabularyItem("que / qu'", "which / that (object)", "", "Le café que tu prépares sent bon."),
            VocabularyItem("dont", "whose / of which", "", "Le livre dont tu parles est épuisé."),
            VocabularyItem("où", "where / when (relative)", "", "Le quartier où j'habite est calme."),
            VocabularyItem("la proposition relative", "relative clause", "", "")
        ),
        exampleSentences = listOf(
            "C'est un sujet qui m'intéresse beaucoup.",
            "Le gâteau qu'elle a préparé était délicieux.",
            "Voilà le collègue dont je t'ai parlé.",
            "La maison où il habite est très grande.",
            "C'est une situation dont tout le monde a peur.",
            "Le moment où il est arrivé, on mangeait."
        ),
        quiz = listOf(
            QuizQuestion(1, "Complétez : 'La femme ___ parle est directrice.'",
                listOf("que", "dont", "qui", "où"), 2, "La femme est sujet de 'parle' → qui."),
            QuizQuestion(2, "Complétez : 'Le roman ___ tu lis est célèbre.'",
                listOf("qui", "dont", "où", "que"), 3, "Le roman est objet de 'lis' → que."),
            QuizQuestion(3, "Quel pronom relatif remplace un complément introduit par 'de' ?",
                listOf("Qui", "Que", "Dont", "Où"), 2, "Dont remplace 'de + nom'."),
            QuizQuestion(4, "Complétez : 'La ville ___ je suis né est petite.'",
                listOf("qui", "que", "dont", "où"), 3, "Lieu → où."),
            QuizQuestion(5, "Complétez : 'C'est un ami ___ j'ai besoin.'",
                listOf("qui", "que", "dont", "où"), 2, "Avoir besoin DE → dont."),
            QuizQuestion(6, "Quelle phrase est correcte ?",
                listOf("La fille dont chante.", "Le livre qui j'aime.", "L'homme qui parle.", "La ville que habite."), 2,
                "Qui + verbe sans pronom objet = correct."),
            QuizQuestion(7, "Complétez : 'Le film ___ tu m'as parlé passe ce soir.'",
                listOf("qui", "que", "dont", "où"), 2, "Parler DE ce film → dont."),
            QuizQuestion(8, "Que remplace 'où' dans une phrase temporelle ?",
                listOf("Un sujet", "Un lieu ou un moment", "Un objet", "Un possesseur"), 1,
                "Où peut exprimer le lieu ou le moment."),
            QuizQuestion(9, "Complétez : 'Voilà la maison ___ ils habitent.'",
                listOf("qui", "que", "dont", "où"), 3, "Habiter dans un lieu → où."),
            QuizQuestion(10, "Quelle est la fonction de 'que' dans : 'Le café que tu bois est fort' ?",
                listOf("Sujet", "Objet direct", "Complément de lieu", "Complément introduit par de"), 1,
                "Tu bois quoi ? → le café → objet direct → que.")
        )
    ),

    StaticCourse(
        id = "fr_i_04",
        language = Language.FRENCH,
        level = Level.INTERMEDIATE,
        orderIndex = 4,
        title = "Le Futur Simple",
        description = "Exprimez des projets et des prédictions avec le futur simple.",
        theoryContent = """
<b>Formation du futur simple</b><br>
Infinitif + terminaisons : -ai · -as · -a · -ons · -ez · -ont<br><br>
<b>Exemple avec 'parler' :</b><br>
je parlerai · tu parleras · il parlera · nous parlerons · vous parlerez · ils parleront<br><br>
<b>Attention aux verbes en -RE :</b><br>
prendre → je prendrai · attendre → j'attendrai<br><br>
<b>Futurs irréguliers :</b><br>
être → je serai · avoir → j'aurai · aller → j'irai<br>
faire → je ferai · venir → je viendrai · voir → je verrai<br>
pouvoir → je pourrai · vouloir → je voudrai · savoir → je saurai<br><br>
<b>Condition : Si + présent → futur</b><br>
Si tu travailles, tu réussiras.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("je serai", "I will be", "", "Dans dix ans, je serai médecin."),
            VocabularyItem("nous irons", "we will go", "", "Demain, nous irons à la mer."),
            VocabularyItem("il fera", "he will do/make", "", "Il fera beau ce week-end."),
            VocabularyItem("tu auras", "you will have", "", "Tu auras le temps demain."),
            VocabularyItem("elles viendront", "they will come", "", "Elles viendront nous voir."),
            VocabularyItem("dans X ans", "in X years", "", "Dans cinq ans, je parlerai couramment.")
        ),
        exampleSentences = listOf(
            "L'année prochaine, j'irai en France.",
            "Si tu étudies, tu réussiras l'examen.",
            "Elle sera contente quand elle verra tes progrès.",
            "Nous déménagerons dans un mois.",
            "Il fera froid demain, prends ton manteau.",
            "Vous pourrez visiter le musée mardi prochain."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quelle est la terminaison du futur à 'je' pour les verbes réguliers ?",
                listOf("-ais", "-ai", "-a", "-e"), 1, "Je + -ai au futur simple."),
            QuizQuestion(2, "Quel est le futur de 'être' à 'je' ?",
                listOf("J'étais", "J'ai été", "Je serai", "Je suis"), 2, "Être → je serai."),
            QuizQuestion(3, "Quel est le futur de 'aller' à 'nous' ?",
                listOf("Nous allons", "Nous allerons", "Nous irons", "Nous allâmes"), 2, "Aller → nous irons."),
            QuizQuestion(4, "Complétez : 'Si tu viens, on ___ (faire) une fête.'",
                listOf("faisons", "ferons", "faisait", "avons fait"), 1, "Si + présent → futur."),
            QuizQuestion(5, "Quelle phrase exprime un projet futur ?",
                listOf("J'ai visité Paris.", "Je visite Paris.", "Je visiterai Paris l'été prochain.", "Je visitais Paris."), 2,
                "Futur simple = projection dans l'avenir."),
            QuizQuestion(6, "Quel est le futur de 'voir' à la 3ème personne du singulier ?",
                listOf("Il voit", "Il verra", "Il voyait", "Il a vu"), 1, "Voir → il verra."),
            QuizQuestion(7, "Conjuguez 'finir' au futur, 2ème personne du singulier.",
                listOf("Tu finissais", "Tu as fini", "Tu finiras", "Tu finisses"), 2, "Finir → tu finiras."),
            QuizQuestion(8, "Quel est le futur de 'pouvoir' à 'je' ?",
                listOf("Je peux", "Je pouvais", "Je pourrai", "J'ai pu"), 2, "Pouvoir → je pourrai."),
            QuizQuestion(9, "Quelle structure exprime une condition au futur ?",
                listOf("Si + imparfait + conditionnel", "Si + présent + futur",
                    "Si + futur + présent", "Si + passé composé + futur"), 1,
                "Condition réelle : si + présent + futur."),
            QuizQuestion(10, "Quel est le futur de 'venir' à 'ils' ?",
                listOf("Ils venaient", "Ils sont venus", "Ils viendront", "Ils viennent"), 2,
                "Venir → ils viendront.")
        )
    ),

    StaticCourse(
        id = "fr_i_05",
        language = Language.FRENCH,
        level = Level.INTERMEDIATE,
        orderIndex = 5,
        title = "Les Expressions Idiomatiques",
        description = "Maîtrisez les expressions figurées pour parler comme un natif.",
        theoryContent = """
<b>Les expressions idiomatiques françaises</b><br>
Les expressions idiomatiques sont des phrases dont le sens ne peut pas être déduit mot à mot.<br><br>
<b>Expressions courantes :</b><br>
• <b>Avoir le cafard</b> = to feel down / to be blue<br>
• <b>Casser les pieds à quelqu'un</b> = to annoy someone<br>
• <b>Donner sa langue au chat</b> = to give up (guessing)<br>
• <b>Il pleut des cordes</b> = it's raining cats and dogs<br>
• <b>Avoir d'autres chats à fouetter</b> = to have other fish to fry<br>
• <b>Poser un lapin</b> = to stand someone up<br>
• <b>Mettre les pieds dans le plat</b> = to put your foot in it<br>
• <b>Faire la grasse matinée</b> = to sleep in / to have a lie-in<br>
• <b>Avoir le beurre et l'argent du beurre</b> = to have your cake and eat it<br>
• <b>Tomber dans les pommes</b> = to faint
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("avoir le cafard", "to feel down", "", "Elle a le cafard depuis lundi."),
            VocabularyItem("poser un lapin", "to stand someone up", "", "Il m'a encore posé un lapin !"),
            VocabularyItem("il pleut des cordes", "it's raining cats and dogs", "", "Reste à la maison, il pleut des cordes."),
            VocabularyItem("faire la grasse matinée", "to sleep in", "", "Le dimanche, j'adore faire la grasse matinée."),
            VocabularyItem("donner sa langue au chat", "to give up guessing", "", "Je donne ma langue au chat !"),
            VocabularyItem("tomber dans les pommes", "to faint", "", "Elle a eu si chaud qu'elle est tombée dans les pommes.")
        ),
        exampleSentences = listOf(
            "— Qu'est-ce qui se passe ? — J'ai le cafard, c'est tout.",
            "Il a posé un lapin à Marie encore une fois !",
            "Il pleut des cordes, on ne peut pas sortir.",
            "Ce week-end, je vais faire la grasse matinée.",
            "Je ne sais pas la réponse, je donne ma langue au chat.",
            "Tu mets toujours les pieds dans le plat !"
        ),
        quiz = listOf(
            QuizQuestion(1, "Que signifie 'avoir le cafard' ?",
                listOf("To be happy", "To have a cockroach", "To feel down", "To be tired"), 2,
                "Avoir le cafard = être triste / déprimé."),
            QuizQuestion(2, "Que signifie 'il pleut des cordes' ?",
                listOf("It is snowing.", "It is raining cats and dogs.", "It is windy.", "It is cloudy."), 1,
                "Il pleut des cordes = it's raining very heavily."),
            QuizQuestion(3, "Qu'est-ce que 'poser un lapin à quelqu'un' ?",
                listOf("To give someone a rabbit", "To stand someone up", "To annoy someone", "To help someone"), 1,
                "Poser un lapin = ne pas venir à un rendez-vous."),
            QuizQuestion(4, "Que signifie 'faire la grasse matinée' ?",
                listOf("To eat a lot in the morning", "To cook breakfast", "To sleep in late", "To wake up early"), 2,
                "Faire la grasse matinée = rester au lit tard le matin."),
            QuizQuestion(5, "Que veut dire 'donner sa langue au chat' ?",
                listOf("To feed a cat", "To speak too much", "To give up guessing", "To be shy"), 2,
                "On dit cela quand on ne trouve pas la réponse à une devinette."),
            QuizQuestion(6, "Que signifie 'tomber dans les pommes' ?",
                listOf("To fall in apples", "To go to the market", "To faint", "To be surprised"), 2,
                "Tomber dans les pommes = s'évanouir."),
            QuizQuestion(7, "Quelle expression signifie 'to put your foot in it' ?",
                listOf("Avoir le cafard", "Mettre les pieds dans le plat",
                    "Casser les pieds", "Poser un lapin"), 1,
                "Mettre les pieds dans le plat = dire quelque chose de maladroit."),
            QuizQuestion(8, "Que signifie 'casser les pieds à quelqu'un' ?",
                listOf("To help someone walk", "To break someone's feet",
                    "To annoy / bore someone", "To invite someone"), 2,
                "Casser les pieds = ennuyer / agacer quelqu'un."),
            QuizQuestion(9, "Dans quel contexte dit-on 'il pleut des cordes' ?",
                listOf("When it is very hot", "When it is raining very hard",
                    "When it is snowing", "When it is foggy"), 1,
                "C'est une façon imagée de décrire une pluie intense."),
            QuizQuestion(10, "Que signifie 'avoir d'autres chats à fouetter' ?",
                listOf("To have many cats", "To love animals",
                    "To have other/more important things to do", "To be very busy with cats"), 2,
                "= avoir des choses plus importantes à faire.")
        )
    )
)
