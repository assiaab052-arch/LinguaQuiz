package com.example.linguaquiz

// ═══════════════════════════════════════════════════════════════
//  FRENCH  –  ADVANCED  (4 courses)
// ═══════════════════════════════════════════════════════════════

val frenchAdvancedCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "fr_a_01",
        language = Language.FRENCH,
        level = Level.ADVANCED,
        orderIndex = 1,
        title = "Le Subjonctif",
        description = "Maîtrisez le subjonctif pour exprimer le doute, la volonté et l'émotion.",
        theoryContent = """
<b>Formation du subjonctif présent</b><br>
Radical de la 3ème personne du pluriel (présent) + terminaisons :<br>
-e · -es · -e · -ions · -iez · -ent<br><br>
Exemple : <i>parler</i> → ils parlent → parl-<br>
que je parle · que tu parles · qu'il parle · que nous parlions · que vous parliez · qu'ils parlent<br><br>
<b>Subjonctifs irréguliers :</b><br>
être → que je sois · avoir → que j'aie · aller → que j'aille<br>
faire → que je fasse · pouvoir → que je puisse · savoir → que je sache<br><br>
<b>Déclencheurs principaux :</b><br>
• Volonté : vouloir que · souhaiter que · exiger que<br>
• Émotion : être content(e) que · avoir peur que · regretter que<br>
• Doute/Opinion : douter que · ne pas penser que · il est possible que<br>
• Obligation : il faut que · il est nécessaire que
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("il faut que", "it is necessary that", "", "Il faut que tu sois là à 9h."),
            VocabularyItem("je veux que", "I want (sb) to", "", "Je veux que tu comprennes."),
            VocabularyItem("bien que", "although", "", "Bien qu'il soit tard, elle travaille."),
            VocabularyItem("pour que", "so that / in order that", "", "Je t'explique pour que tu saches."),
            VocabularyItem("à moins que", "unless", "", "À moins qu'il ne pleuve, on sort."),
            VocabularyItem("que je sois", "that I am (subj.)", "", "Il est étonnant que je sois en retard.")
        ),
        exampleSentences = listOf(
            "Il faut que vous finissiez avant midi.",
            "Je suis contente qu'elle soit venue.",
            "Bien qu'il fasse froid, elle ne porte pas de manteau.",
            "Il est possible que nous ayons tort.",
            "Je doute qu'il puisse venir à l'heure.",
            "Elle parle doucement pour que les enfants l'entendent."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quelle expression déclenche toujours le subjonctif ?",
                listOf("Je pense que", "Je sais que", "Il faut que", "Je vois que"), 2,
                "'Il faut que' exige toujours le subjonctif."),
            QuizQuestion(2, "Quel est le subjonctif de 'être' à 'je' ?",
                listOf("Que je suis", "Que j'étais", "Que je sois", "Que j'aie été"), 2,
                "Être → que je sois."),
            QuizQuestion(3, "Complétez : 'Je veux que tu ___ (venir) ce soir.'",
                listOf("viens", "viennes", "viendrais", "es venu"), 1,
                "Vouloir que + subjonctif : que tu viennes."),
            QuizQuestion(4, "Quelle conjonction est toujours suivie du subjonctif ?",
                listOf("Parce que", "Bien que", "Depuis que", "Quand"), 1,
                "'Bien que' (although) → toujours subjonctif."),
            QuizQuestion(5, "Quel est le subjonctif de 'avoir' à 'nous' ?",
                listOf("Que nous avons", "Que nous ayons", "Que nous aurions", "Que nous avions"), 1,
                "Avoir → que nous ayons."),
            QuizQuestion(6, "Complétez : 'Il est possible qu'elle ___ (savoir) la vérité.'",
                listOf("sait", "savait", "sache", "saura"), 2,
                "Il est possible que → subjonctif → qu'elle sache."),
            QuizQuestion(7, "Quel déclencheur exprime une émotion ?",
                listOf("Il faut que", "Je suis ravi(e) que", "Je pense que", "Il est vrai que"), 1,
                "Être ravi(e) que = émotion → subjonctif."),
            QuizQuestion(8, "Quel est le subjonctif de 'aller' à 'il' ?",
                listOf("Qu'il va", "Qu'il allait", "Qu'il aille", "Qu'il sera allé"), 2,
                "Aller → qu'il aille."),
            QuizQuestion(9, "Quelle phrase utilise correctement le subjonctif ?",
                listOf("Il faut que tu viens.", "Je suis heureux qu'elle est là.",
                    "Bien qu'il soit fatigué, il continue.", "Je doute que tu as raison."), 2,
                "Bien que → subjonctif → qu'il soit fatigué."),
            QuizQuestion(10, "Complétez : 'Je parle lentement pour que tu ___ (comprendre).'",
                listOf("comprends", "comprendrais", "comprennes", "as compris"), 2,
                "Pour que → subjonctif → que tu comprennes.")
        )
    ),

    StaticCourse(
        id = "fr_a_02",
        language = Language.FRENCH,
        level = Level.ADVANCED,
        orderIndex = 2,
        title = "Le Conditionnel et l'Hypothèse",
        description = "Exprimez des conditions irréelles et des regrets avec le conditionnel.",
        theoryContent = """
<b>Conditionnel présent</b><br>
Radical du futur + terminaisons de l'imparfait :<br>
-ais · -ais · -ait · -ions · -iez · -aient<br><br>
Ex. : parler → je parlerais · être → je serais · avoir → j'aurais<br><br>
<b>Conditionnel passé</b><br>
Auxiliaire au conditionnel + participe passé<br>
j'aurais mangé · je serais allé(e)<br><br>
<b>Structures hypothétiques :</b><br>
• Hypothèse réalisable : Si + présent → futur<br>
• Hypothèse peu probable : Si + imparfait → conditionnel présent<br>
• Hypothèse irréelle (passé) : Si + plus-que-parfait → conditionnel passé<br><br>
<b>Regret :</b><br>
J'aurais dû travailler. · Si seulement j'avais su…
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("je voudrais", "I would like", "", "Je voudrais un café, s'il vous plaît."),
            VocabularyItem("si j'avais su", "if I had known", "", "Si j'avais su, j'aurais agi autrement."),
            VocabularyItem("j'aurais dû", "I should have", "", "J'aurais dû écouter tes conseils."),
            VocabularyItem("à ta place", "if I were you", "", "À ta place, je n'accepterais pas."),
            VocabularyItem("on pourrait", "we could", "", "On pourrait partir plus tôt."),
            VocabularyItem("il aurait fallu", "it would have been necessary", "", "Il aurait fallu prévenir avant.")
        ),
        exampleSentences = listOf(
            "Si j'avais plus d'argent, je voyagerais davantage.",
            "Si tu avais étudié, tu aurais réussi l'examen.",
            "À ta place, je refuserais cette offre.",
            "Il aurait dû venir hier, tout serait différent.",
            "Vous pourriez m'aider, s'il vous plaît ?",
            "Si seulement elle avait dit la vérité…"
        ),
        quiz = listOf(
            QuizQuestion(1, "Quelle structure exprime une hypothèse irréalisable au présent ?",
                listOf("Si + présent + futur", "Si + imparfait + conditionnel présent",
                    "Si + plus-que-parfait + conditionnel passé", "Si + subjonctif"), 1,
                "Hypothèse peu probable : si + imparfait → conditionnel."),
            QuizQuestion(2, "Quel est le conditionnel présent de 'être' à 'je' ?",
                listOf("J'étais", "Je serais", "Je serai", "J'ai été"), 1, "Être → je serais."),
            QuizQuestion(3, "Complétez : 'Si tu ___ (étudier), tu ___ (réussir).'",
                listOf("étudiais / réussiras", "étudiais / réussirais",
                    "études / réussirais", "auras étudié / réussissais"), 1,
                "Si + imparfait → conditionnel présent."),
            QuizQuestion(4, "Que signifie 'j'aurais dû partir' ?",
                listOf("I will leave.", "I should leave.", "I should have left.", "I had to leave."), 2,
                "'Aurais dû' = should have (regret)."),
            QuizQuestion(5, "Quel est le conditionnel passé de 'avoir' à 'il' ?",
                listOf("Il avait eu", "Il aurait eu", "Il aura eu", "Il avait"), 1,
                "Avoir → conditionnel présent + participe → il aurait eu."),
            QuizQuestion(6, "Quelle phrase exprime un regret ?",
                listOf("Si je viens demain…", "Je viendrai demain.", "J'aurais dû dire la vérité.",
                    "Si tu étudies, tu réussiras."), 2,
                "Conditionnel passé + 'devoir' = regret."),
            QuizQuestion(7, "Complétez : 'Si j'___ (savoir), je ne serais pas venu.'",
                listOf("savais", "saurais", "avais su", "aurais su"), 2,
                "Hypothèse irréelle (passé) : si + plus-que-parfait."),
            QuizQuestion(8, "Comment dit-on 'you could help me' de façon polie ?",
                listOf("Tu peux m'aider.", "Tu pourrais m'aider.", "Tu peux m'aider ?", "Tu aideras."), 1,
                "Conditionnel présent = politesse."),
            QuizQuestion(9, "Quelle est la structure pour une hypothèse irréelle dans le passé ?",
                listOf("Si + présent + futur", "Si + imparfait + conditionnel présent",
                    "Si + plus-que-parfait + conditionnel passé", "Si + subjonctif + imparfait"), 2,
                "Irréel passé : si + plus-que-parfait → conditionnel passé."),
            QuizQuestion(10, "Que signifie 'À ta place, je refuserais' ?",
                listOf("You refused.", "If I were you, I would refuse.", "You should refuse.", "I refused."), 1,
                "'À ta place' + conditionnel = conseil.")
        )
    ),

    StaticCourse(
        id = "fr_a_03",
        language = Language.FRENCH,
        level = Level.ADVANCED,
        orderIndex = 3,
        title = "La Voix Passive",
        description = "Transformez des phrases actives en passives et inversement.",
        theoryContent = """
<b>Formation de la voix passive</b><br>
Être (conjugué au temps voulu) + Participe passé (accordé avec le sujet)<br><br>
<b>Présent :</b> Le gâteau est mangé par les enfants.<br>
<b>Passé composé :</b> Le livre a été écrit par cet auteur.<br>
<b>Imparfait :</b> La lettre était envoyée chaque semaine.<br>
<b>Futur :</b> Le pont sera construit l'année prochaine.<br><br>
<b>Complément d'agent :</b><br>
Introduit par 'par' (action) ou 'de' (état, sentiment)<br>
Ex. : Il est aimé <b>de</b> tous. · Le colis est livré <b>par</b> le facteur.<br><br>
<b>Restrictions :</b><br>
Seuls les verbes transitifs directs peuvent se mettre au passif.<br>
'Partir', 'aller', 'naître' ne peuvent pas être mis au passif.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("est construit", "is being built", "", "Un nouveau centre est construit ici."),
            VocabularyItem("a été écrit", "was written", "", "Ce roman a été écrit en 1945."),
            VocabularyItem("sera livré", "will be delivered", "", "Le colis sera livré demain."),
            VocabularyItem("par", "by (agent)", "", "Le film a été réalisé par ce cinéaste."),
            VocabularyItem("est aimé de tous", "is loved by all", "", "Ce professeur est aimé de tous."),
            VocabularyItem("être + participe passé", "passive construction", "", "")
        ),
        exampleSentences = listOf(
            "Ce roman a été écrit par Victor Hugo.",
            "La ville sera rénovée par la mairie.",
            "Le match était suivi par des millions de téléspectateurs.",
            "Les résultats seront publiés demain.",
            "La décision a été prise par le directeur.",
            "Ce chanteur est adoré de tous ses fans."
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment forme-t-on la voix passive en français ?",
                listOf("Avoir + infinitif", "Être + participe passé", "Avoir + participe passé", "Se + verbe"), 1,
                "Voix passive = être (conjugué) + participe passé."),
            QuizQuestion(2, "Transformez en passif : 'Hugo écrit ce roman.'",
                listOf("Ce roman est écrit par Hugo.", "Ce roman a été écrit.",
                    "Ce roman est écrivé par Hugo.", "Hugo est écrit ce roman."), 0,
                "Actif → passif : sujet devient complément d'agent avec 'par'."),
            QuizQuestion(3, "Quel temps est utilisé dans 'Le pont sera construit' ?",
                listOf("Présent", "Passé composé", "Imparfait", "Futur"), 3,
                "'Sera' = futur de être → voix passive au futur."),
            QuizQuestion(4, "Quelle préposition introduit généralement le complément d'agent ?",
                listOf("À", "Avec", "Par", "Pour"), 2, "Le complément d'agent est introduit par 'par'."),
            QuizQuestion(5, "Quel verbe NE PEUT PAS être mis au passif ?",
                listOf("Manger", "Écrire", "Partir", "Voir"), 2,
                "'Partir' est intransitif → pas de voix passive possible."),
            QuizQuestion(6, "Quel est le passif de 'On mange la pizza' ?",
                listOf("La pizza est mangée.", "La pizza a été manger.", "La pizza mange.", "On est mangé."), 0,
                "Pizza (féminin) → est mangée (accord)."),
            QuizQuestion(7, "Quelle phrase est à la voix passive ?",
                listOf("Elle mange une pomme.", "Il court vite.", "Le livre a été lu.", "Nous partons."), 2,
                "'A été lu' = passé composé passif."),
            QuizQuestion(8, "Complétez : 'Cette décision ___ prise hier par le PDG.'",
                listOf("a", "est", "a été", "était été"), 2,
                "Passé composé passif = a été + participe passé."),
            QuizQuestion(9, "Pourquoi dit-on 'est aimé de tous' avec 'de' et non 'par' ?",
                listOf("'Par' is wrong.", "It describes a state or feeling, not a dynamic action.",
                    "Both are always interchangeable.", "'De' is used only with people."), 1,
                "'De' s'utilise pour les états et les sentiments."),
            QuizQuestion(10, "Transformez : 'Le directeur annoncera les résultats.'",
                listOf("Les résultats sont annoncés.", "Les résultats seront annoncés par le directeur.",
                    "Les résultats ont été annoncés.", "Les résultats seront annoncés."), 1,
                "Futur actif → futur passif avec complément d'agent.")
        )
    ),

    StaticCourse(
        id = "fr_a_04",
        language = Language.FRENCH,
        level = Level.ADVANCED,
        orderIndex = 4,
        title = "Argumentation et Rhétorique",
        description = "Construisez des arguments solides et persuasifs en français.",
        theoryContent = """
<b>Structure d'un texte argumentatif</b><br>
1. <b>Introduction :</b> accroche + problématique + annonce du plan<br>
2. <b>Développement :</b> thèse → arguments + exemples → antithèse<br>
3. <b>Conclusion :</b> synthèse + ouverture<br><br>
<b>Connecteurs logiques :</b><br>
• <b>Addition :</b> de plus · en outre · par ailleurs · également<br>
• <b>Opposition :</b> cependant · néanmoins · or · en revanche · toutefois<br>
• <b>Cause :</b> en effet · car · puisque · étant donné que<br>
• <b>Conséquence :</b> ainsi · donc · par conséquent · c'est pourquoi<br>
• <b>Illustration :</b> par exemple · notamment · tel que · à titre d'exemple<br><br>
<b>Nuancer :</b><br>
Certes… mais · Il est vrai que… cependant · D'un côté… de l'autre
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("en outre", "moreover / furthermore", "", "En outre, il faut considérer les coûts."),
            VocabularyItem("néanmoins", "nevertheless", "", "Cette solution est coûteuse ; néanmoins, elle est efficace."),
            VocabularyItem("par conséquent", "consequently / therefore", "", "Il a échoué ; par conséquent, il doit recommencer."),
            VocabularyItem("certes", "granted / admittedly", "", "Certes, le problème est complexe, mais des solutions existent."),
            VocabularyItem("en revanche", "on the other hand", "", "Ce poste est exigeant ; en revanche, il est bien rémunéré."),
            VocabularyItem("il convient de", "it is appropriate to", "", "Il convient de nuancer cette affirmation.")
        ),
        exampleSentences = listOf(
            "Certes, la technologie offre de nombreux avantages ; néanmoins, elle présente aussi des risques.",
            "En outre, il convient de mentionner l'impact environnemental.",
            "Par conséquent, une réforme profonde s'impose.",
            "D'un côté, l'économie se développe ; de l'autre, les inégalités augmentent.",
            "Cette mesure est inefficace en raison du manque de ressources.",
            "À titre d'exemple, la Finlande a réformé son système éducatif avec succès."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quel connecteur introduit une conséquence ?",
                listOf("En outre", "Par conséquent", "Certes", "En revanche"), 1,
                "'Par conséquent' = therefore / consequently."),
            QuizQuestion(2, "Que signifie 'néanmoins' ?",
                listOf("Moreover", "Because", "Nevertheless", "For example"), 2,
                "Néanmoins = nevertheless / however."),
            QuizQuestion(3, "Quel connecteur ajoute un argument supplémentaire ?",
                listOf("Cependant", "Bien que", "En outre", "Or"), 2,
                "'En outre' = furthermore / moreover."),
            QuizQuestion(4, "Quelle est la structure d'un texte argumentatif ?",
                listOf("Introduction → Conclusion → Développement",
                    "Développement → Introduction → Conclusion",
                    "Introduction → Développement → Conclusion",
                    "Problématique → Arguments → Introduction"), 2,
                "Structure classique : intro → développement → conclusion."),
            QuizQuestion(5, "Quel connecteur introduit une opposition ?",
                listOf("De plus", "Puisque", "En revanche", "Notamment"), 2,
                "'En revanche' = on the other hand."),
            QuizQuestion(6, "Que signifie 'certes... mais' ?",
                listOf("Because... therefore", "Admittedly... but", "Moreover... also", "Although... nevertheless"), 1,
                "'Certes' concède un point avant d'introduire une opposition."),
            QuizQuestion(7, "Quel connecteur est synonyme de 'c'est pourquoi' ?",
                listOf("En effet", "Néanmoins", "Ainsi", "Certes"), 2,
                "'Ainsi' = so / therefore, proche de 'c'est pourquoi'."),
            QuizQuestion(8, "Quel élément NE fait PAS partie d'une introduction réussie ?",
                listOf("Une accroche", "Une problématique", "Une conclusion partielle", "Une annonce de plan"), 2,
                "La conclusion partielle appartient à la conclusion, pas à l'introduction."),
            QuizQuestion(9, "Que signifie 'en effet' ?",
                listOf("On the other hand", "In fact / indeed", "Therefore", "Although"), 1,
                "'En effet' confirme ou justifie ce qui précède."),
            QuizQuestion(10, "Quelle phrase nuance correctement un argument ?",
                listOf("C'est totalement faux.", "D'un côté... de l'autre...",
                    "Je n'ai aucun doute.", "C'est absolument vrai."), 1,
                "'D'un côté... de l'autre' = structure de nuance classique.")
        )
    )
)
