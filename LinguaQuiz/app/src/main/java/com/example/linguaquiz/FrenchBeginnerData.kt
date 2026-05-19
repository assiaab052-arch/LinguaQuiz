package com.example.linguaquiz

// ═══════════════════════════════════════════════════════════════
//  FRENCH  –  BEGINNER  (6 courses)
// ═══════════════════════════════════════════════════════════════

val frenchBeginnerCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "fr_b_01",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 1,
        title = "Les Salutations",
        description = "Apprenez à saluer et à vous présenter en français.",
        theoryContent = """
<b>Les salutations de base</b><br>
En français, on utilise différentes salutations selon le moment de la journée et le niveau de formalité.<br><br>
<b>Formelles :</b> Bonjour (matin/après-midi) · Bonsoir (soir) · Bonne nuit (en partant)<br>
<b>Informelles :</b> Salut · Coucou<br><br>
<b>Pour se présenter :</b><br>
• Je m'appelle [prénom]. → Mon nom est [prénom].<br>
• Comment vous appelez-vous ? (formel)<br>
• Tu t'appelles comment ? (informel)<br><br>
<b>Réponses utiles :</b><br>
• Enchanté(e) ! · Ravi(e) de vous rencontrer !
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("Bonjour", "Hello / Good morning", "bɔ̃.ʒuʁ", "Bonjour, comment allez-vous ?"),
            VocabularyItem("Bonsoir", "Good evening", "bɔ̃.swaʁ", "Bonsoir, madame."),
            VocabularyItem("Salut", "Hi (informal)", "sa.ly", "Salut, ça va ?"),
            VocabularyItem("Au revoir", "Goodbye", "o.ʁə.vwaʁ", "Au revoir et bonne journée !"),
            VocabularyItem("Je m'appelle", "My name is", "ʒə ma.pɛl", "Je m'appelle Marie."),
            VocabularyItem("Enchanté(e)", "Nice to meet you", "ɑ̃.ʃɑ̃.te", "Enchanté, je suis Paul."),
            VocabularyItem("S'il vous plaît", "Please (formal)", "sil vu plɛ", "Un café, s'il vous plaît."),
            VocabularyItem("Merci", "Thank you", "mɛʁ.si", "Merci beaucoup !")
        ),
        exampleSentences = listOf(
            "— Bonjour ! Je m'appelle Lucas. Et vous ?",
            "— Bonjour ! Je m'appelle Sophie. Enchantée !",
            "— Salut, tu t'appelles comment ?",
            "— Je m'appelle Léa. Et toi ?",
            "— Bonsoir madame, bonsoir monsieur.",
            "— Au revoir, à bientôt !"
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment dit-on 'Good morning' en français ?",
                listOf("Bonsoir", "Bonjour", "Salut", "Bonne nuit"), 1,
                "'Bonjour' s'utilise le matin et l'après-midi."),
            QuizQuestion(2, "Quelle phrase utilise-t-on pour se présenter ?",
                listOf("Où es-tu ?", "Je m'appelle Marie.", "Comment ça va ?", "Merci beaucoup."), 1,
                "'Je m'appelle' signifie 'My name is'."),
            QuizQuestion(3, "Quelle salutation est informelle ?",
                listOf("Bonjour", "Bonsoir", "Salut", "Au revoir"), 2,
                "'Salut' est utilisé entre amis."),
            QuizQuestion(4, "Comment dit-on 'Goodbye' ?",
                listOf("Bonjour", "Bonsoir", "Merci", "Au revoir"), 3,
                "'Au revoir' = Goodbye."),
            QuizQuestion(5, "Que répond-on quand on rencontre quelqu'un pour la première fois ?",
                listOf("Au revoir", "Enchanté(e)", "Bonne nuit", "S'il vous plaît"), 1,
                "'Enchanté(e)' = Nice to meet you."),
            QuizQuestion(6, "Comment dit-on 'Good evening' ?",
                listOf("Bonjour", "Bonsoir", "Salut", "Coucou"), 1,
                "'Bonsoir' s'utilise le soir."),
            QuizQuestion(7, "Quelle formule est formelle ?",
                listOf("Coucou", "Salut", "Bonjour", "Hé !"), 2,
                "'Bonjour' est la salutation formelle standard."),
            QuizQuestion(8, "Comment dit-on 'Thank you' ?",
                listOf("S'il vous plaît", "Merci", "Enchanté", "Bonjour"), 1,
                "'Merci' = Thank you."),
            QuizQuestion(9, "Qu'est-ce que 'Comment vous appelez-vous ?' signifie ?",
                listOf("How are you?", "Where are you from?", "What is your name?", "How old are you?"), 2,
                "C'est la façon formelle de demander le prénom."),
            QuizQuestion(10, "Que signifie 'Bonne nuit' ?",
                listOf("Good morning", "Good afternoon", "Good evening", "Good night"), 3,
                "'Bonne nuit' se dit en allant se coucher.")
        )
    ),

    StaticCourse(
        id = "fr_b_02",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 2,
        title = "Les Chiffres et Les Nombres",
        description = "Comptez de 0 à 100 et utilisez les nombres dans la vie quotidienne.",
        theoryContent = """
<b>Les nombres de 0 à 20</b><br>
0 zéro · 1 un · 2 deux · 3 trois · 4 quatre · 5 cinq<br>
6 six · 7 sept · 8 huit · 9 neuf · 10 dix<br>
11 onze · 12 douze · 13 treize · 14 quatorze · 15 quinze<br>
16 seize · 17 dix-sept · 18 dix-huit · 19 dix-neuf · 20 vingt<br><br>
<b>Les dizaines</b><br>
30 trente · 40 quarante · 50 cinquante · 60 soixante<br>
70 soixante-dix · 80 quatre-vingts · 90 quatre-vingt-dix · 100 cent<br><br>
<b>Règle importante :</b> On relie les dizaines et les unités avec un tiret.<br>
Ex. : 21 = vingt-et-un · 22 = vingt-deux · 71 = soixante-et-onze
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("un / une", "one", "œ̃ / yn", "J'ai un frère."),
            VocabularyItem("deux", "two", "dø", "Elle a deux chats."),
            VocabularyItem("dix", "ten", "dis", "Il y a dix élèves."),
            VocabularyItem("vingt", "twenty", "vɛ̃", "J'ai vingt ans."),
            VocabularyItem("cent", "hundred", "sɑ̃", "Cent euros."),
            VocabularyItem("Quel âge avez-vous ?", "How old are you?", "", "Quel âge avez-vous, monsieur ?")
        ),
        exampleSentences = listOf(
            "J'ai vingt-cinq ans.",
            "Mon numéro est le zéro six, trente-deux, quarante-cinq, dix-huit, soixante.",
            "Il y a trente étudiants dans la classe.",
            "Le prix est quarante-neuf euros.",
            "Nous sommes le quinze mars."
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment écrit-on le nombre '17' en français ?",
                listOf("Dix-sept", "Septante", "Soixante-dix", "Dix-six"), 0, "17 = dix-sept."),
            QuizQuestion(2, "Quel est le résultat de 'vingt + dix' ?",
                listOf("Quarante", "Trente", "Vingt-dix", "Cinquante"), 1, "20 + 10 = 30 = trente."),
            QuizQuestion(3, "Comment dit-on '80' en français ?",
                listOf("Huitante", "Quatre-vingts", "Octante", "Soixante-vingt"), 1,
                "80 = quatre-vingts (littéralement 4 × 20)."),
            QuizQuestion(4, "Quelle phrase demande l'âge de quelqu'un ?",
                listOf("Tu habites où ?", "Quel âge as-tu ?", "Comment tu t'appelles ?", "Tu viens d'où ?"), 1,
                "'Quel âge as-tu ?' = How old are you?"),
            QuizQuestion(5, "Comment dit-on '71' ?",
                listOf("Soixante-et-onze", "Septante-et-un", "Soixante-dix-un", "Soixante-onze"), 0,
                "71 = soixante-et-onze."),
            QuizQuestion(6, "Quel nombre vient après 'dix-neuf' ?",
                listOf("Dix", "Trente", "Vingt", "Quinze"), 2, "19 + 1 = 20 = vingt."),
            QuizQuestion(7, "Comment dit-on '100' ?",
                listOf("Mille", "Cent", "Dix", "Vingt"), 1, "100 = cent."),
            QuizQuestion(8, "Que signifie 'J'ai trente ans' ?",
                listOf("I am 13.", "I am 30.", "I have 30 euros.", "I am 3."), 1,
                "'Avoir X ans' = to be X years old."),
            QuizQuestion(9, "Comment écrit-on '45' ?",
                listOf("Cinquante-quatre", "Quarante-cinq", "Quatre-vingts-cinq", "Soixante-cinq"), 1,
                "45 = quarante-cinq."),
            QuizQuestion(10, "Quel nombre est 'soixante-dix' ?",
                listOf("60", "76", "70", "80"), 2, "Soixante-dix = 70.")
        )
    ),

    StaticCourse(
        id = "fr_b_03",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 3,
        title = "Les Couleurs et les Formes",
        description = "Décrivez le monde qui vous entoure avec les couleurs et les formes.",
        theoryContent = """
<b>Les couleurs principales</b><br>
rouge · bleu/bleue · vert/verte · jaune · orange · violet/violette<br>
blanc/blanche · noir/noire · gris/grise · rose · marron · beige<br><br>
<b>Accord de l'adjectif :</b><br>
Les adjectifs de couleur s'accordent avec le nom :<br>
• Un chat <b>noir</b> → Une robe <b>noire</b><br>
• Un ballon <b>rouge</b> → Une pomme <b>rouge</b> (même forme)<br>
• Exception : 'marron' et 'orange' sont invariables.<br><br>
<b>Les formes :</b><br>
un cercle · un carré · un rectangle · un triangle · un ovale
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("rouge", "red", "ʁuʒ", "Elle porte une robe rouge."),
            VocabularyItem("bleu/bleue", "blue", "blø/bly", "Le ciel est bleu."),
            VocabularyItem("vert/verte", "green", "vɛʁ/vɛʁt", "L'herbe est verte."),
            VocabularyItem("noir/noire", "black", "nwaʁ", "Il a un chat noir."),
            VocabularyItem("blanc/blanche", "white", "blɑ̃/blɑ̃ʃ", "La neige est blanche."),
            VocabularyItem("jaune", "yellow", "ʒon", "Le soleil est jaune.")
        ),
        exampleSentences = listOf(
            "Ma voiture est bleue.",
            "Le tableau est vert et blanc.",
            "Elle a les yeux verts et les cheveux noirs.",
            "Quelle est ta couleur préférée ? — C'est le rouge.",
            "Le cercle est orange et le carré est violet."
        ),
        quiz = listOf(
            QuizQuestion(1, "Quelle est la forme féminine de 'blanc' ?",
                listOf("Blance", "Blanche", "Blanque", "Blanc"), 1, "Blanc → blanche au féminin."),
            QuizQuestion(2, "Comment dit-on 'green' ?",
                listOf("Gris", "Bleu", "Vert", "Jaune"), 2, "Green = vert/verte."),
            QuizQuestion(3, "Quel adjectif est invariable (ne change pas) ?",
                listOf("Noir", "Blanc", "Marron", "Vert"), 2, "Marron ne change jamais de forme."),
            QuizQuestion(4, "Quelle couleur est associée au ciel par beau temps ?",
                listOf("Rouge", "Vert", "Jaune", "Bleu"), 3, "Le ciel est bleu."),
            QuizQuestion(5, "Accordez correctement : 'une robe ___' (noir)",
                listOf("noir", "noire", "noirs", "noirre"), 1, "Robe est féminin → noire."),
            QuizQuestion(6, "Comment dit-on 'circle' en français ?",
                listOf("Carré", "Triangle", "Cercle", "Rectangle"), 2, "Circle = cercle."),
            QuizQuestion(7, "Quelle couleur obtient-on en mélangeant rouge et blanc ?",
                listOf("Orange", "Violet", "Rose", "Beige"), 2, "Rouge + blanc = rose."),
            QuizQuestion(8, "Comment dit-on 'yellow' ?",
                listOf("Marron", "Beige", "Gris", "Jaune"), 3, "Yellow = jaune."),
            QuizQuestion(9, "Que signifie 'Quelle est ta couleur préférée ?'",
                listOf("What is your favorite shape?", "What is your favorite color?",
                    "What color is this?", "Do you like colors?"), 1,
                "Couleur préférée = favorite color."),
            QuizQuestion(10, "Quelle est la forme féminine de 'vert' ?",
                listOf("Verts", "Verte", "Vertue", "Verde"), 1, "Vert → verte au féminin.")
        )
    ),

    StaticCourse(
        id = "fr_b_04",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 4,
        title = "La Famille",
        description = "Parlez de votre famille et décrivez les liens familiaux.",
        theoryContent = """
<b>Les membres de la famille</b><br>
le père / la mère → les parents<br>
le fils / la fille → les enfants<br>
le frère / la sœur<br>
le grand-père / la grand-mère → les grands-parents<br>
l'oncle / la tante<br>
le cousin / la cousine<br>
le mari / la femme (l'époux / l'épouse)<br><br>
<b>Les adjectifs possessifs :</b><br>
mon père / ma mère / mes parents<br>
ton frère / ta sœur / tes enfants<br>
son oncle / sa tante / ses cousins
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("le père", "father", "lə pɛʁ", "Mon père s'appelle Jean."),
            VocabularyItem("la mère", "mother", "la mɛʁ", "Ma mère est médecin."),
            VocabularyItem("le frère", "brother", "lə fʁɛʁ", "J'ai deux frères."),
            VocabularyItem("la sœur", "sister", "la sœʁ", "Ma sœur a 15 ans."),
            VocabularyItem("les grands-parents", "grandparents", "", "Mes grands-parents habitent à Lyon."),
            VocabularyItem("le mari / la femme", "husband / wife", "", "Mon mari s'appelle Pierre.")
        ),
        exampleSentences = listOf(
            "J'ai une grande famille : deux frères and une sœur.",
            "Mon père est ingénieur et ma mère est professeure.",
            "Mes grands-parents habitent à la campagne.",
            "Tu as des frères et sœurs ?",
            "Sa femme s'appelle Claire et ils ont trois enfants."
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment dit-on 'mother' en français ?",
                listOf("Le père", "La mère", "La sœur", "La fille"), 1, "Mother = la mère."),
            QuizQuestion(2, "Quel est le féminin de 'cousin' ?",
                listOf("Cousine", "Cousins", "Cousoeur", "La cousin"), 0, "Cousin → cousine."),
            QuizQuestion(3, "Comment dit-on 'my brother' ?",
                listOf("Ton frère", "Sa frère", "Mon frère", "Ma frère"), 2,
                "Mon s'utilise avec un nom masculin."),
            QuizQuestion(4, "Que signifie 'les grands-parents' ?",
                listOf("The parents", "The children", "The grandparents", "The cousins"), 2,
                "Grands-parents = grandparents."),
            QuizQuestion(5, "Comment dit-on 'her sister' ?",
                listOf("Mon sœur", "Sa sœur", "Ta sœur", "Ma sœur"), 1,
                "Sa s'utilise pour 'his' ou 'her' + féminin."),
            QuizQuestion(6, "Quel mot désigne à la fois 'wife' et 'woman' ?",
                listOf("La fille", "La mère", "La femme", "La cousine"), 2, "La femme = woman / wife."),
            QuizQuestion(7, "Comment dit-on 'I have two brothers' ?",
                listOf("J'ai deux pères.", "J'ai deux frères.", "J'ai deux sœurs.", "J'ai deux cousins."), 1,
                "Frère = brother."),
            QuizQuestion(8, "Que signifie 'mon oncle' ?",
                listOf("My aunt", "My uncle", "My grandfather", "My cousin"), 1, "Oncle = uncle."),
            QuizQuestion(9, "Comment dit-on 'Do you have siblings?' de façon informelle ?",
                listOf("Vous avez des enfants ?", "Tu as des frères et sœurs ?",
                    "Il a des cousins ?", "Elle a des parents ?"), 1,
                "Frères et sœurs = siblings."),
            QuizQuestion(10, "Quel adjectif possessif utilise-t-on avec 'parents' (pluriel) ?",
                listOf("Mon", "Ma", "Mes", "Ton"), 2, "Mes s'utilise pour les pluriels.")
        )
    ),

    StaticCourse(
        id = "fr_b_05",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 5,
        title = "La Nourriture et les Boissons",
        description = "Commandez au restaurant et parlez de vos préférences alimentaires.",
        theoryContent = """
<b>Les aliments</b><br>
Le pain · le fromage · la viande · le poulet · le poisson<br>
Les légumes : la tomate, la carotte, les haricots<br>
Les fruits : la pomme, la banane, l'orange, les fraises<br><br>
<b>Les boissons</b><br>
l'eau · le café · le thé · le jus d'orange · le vin · la bière<br><br>
<b>Exprimer ses goûts :</b><br>
J'aime… / Je n'aime pas… / J'adore… / Je déteste…<br>
Je préfère… / Mon plat préféré est…<br><br>
<b>Au restaurant :</b><br>
• Je voudrais… / Je vais prendre…<br>
• L'addition, s'il vous plaît.<br>
• C'est combien ? / Quel est le prix ?
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("le pain", "bread", "lə pɛ̃", "Je mange du pain au petit-déjeuner."),
            VocabularyItem("le fromage", "cheese", "lə fʁo.maʒ", "La France a 300 fromages."),
            VocabularyItem("la pomme", "apple", "la pɔm", "Je mange une pomme par jour."),
            VocabularyItem("l'eau", "water", "lo", "Un verre d'eau, s'il vous plaît."),
            VocabularyItem("Je voudrais", "I would like", "ʒə vu.dʁɛ", "Je voudrais un café."),
            VocabularyItem("l'addition", "the bill", "la.di.sjɔ̃", "L'addition, s'il vous plaît !")
        ),
        exampleSentences = listOf(
            "— Bonjour, vous désirez ? — Je voudrais un café et un croissant.",
            "J'aime beaucoup le fromage, mais je n'aime pas le poisson.",
            "Mon plat préféré est la quiche lorraine.",
            "L'addition, s'il vous plaît !",
            "C'est combien, le menu du jour ?"
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment dit-on 'I would like' pour commander ?",
                listOf("J'aime", "Je voudrais", "Je mange", "J'adore"), 1,
                "'Je voudrais' est la formule polie pour commander."),
            QuizQuestion(2, "Que signifie 'l'addition' ?",
                listOf("The menu", "The dish", "The bill", "The price"), 2, "L'addition = the bill."),
            QuizQuestion(3, "Comment dit-on 'bread' ?",
                listOf("Le fromage", "Le pain", "La viande", "Le poulet"), 1, "Bread = le pain."),
            QuizQuestion(4, "Quelle phrase exprime un dégoût ?",
                listOf("J'aime le café.", "J'adore les fraises.", "Je déteste les épinards.", "Je préfère le thé."), 2,
                "'Détester' = to hate."),
            QuizQuestion(5, "Comment dit-on 'apple' ?",
                listOf("La poire", "La banane", "L'orange", "La pomme"), 3, "Apple = la pomme."),
            QuizQuestion(6, "Que signifie 'Je n'aime pas le poisson' ?",
                listOf("I love fish.", "I don't like fish.", "I prefer fish.", "I eat fish."), 1,
                "Ne...pas = négation."),
            QuizQuestion(7, "Comment demande-t-on l'eau au restaurant ?",
                listOf("Du pain, s'il vous plaît.", "Un café, merci.", "De l'eau, s'il vous plaît.", "Le menu !"), 2,
                "De l'eau = some water."),
            QuizQuestion(8, "Comment dit-on 'cheese' ?",
                listOf("Le pain", "La viande", "Le fromage", "Le beurre"), 2, "Cheese = le fromage."),
            QuizQuestion(9, "Que signifie 'Mon plat préféré est la pizza' ?",
                listOf("I hate pizza.", "My favorite dish is pizza.", "I eat pizza.", "Pizza is expensive."), 1,
                "Plat préféré = favorite dish."),
            QuizQuestion(10, "Comment dit-on 'How much is it?' ?",
                listOf("Où est la table ?", "C'est combien ?", "Qu'est-ce que c'est ?", "À quelle heure ?"), 1,
                "'C'est combien ?' = How much is it?")
        )
    ),

    StaticCourse(
        id = "fr_b_06",
        language = Language.FRENCH,
        level = Level.BEGINNER,
        orderIndex = 6,
        title = "Le Temps et la Météo",
        description = "Parlez du temps qu'il fait et demandez l'heure.",
        theoryContent = """
<b>La météo</b><br>
Il fait beau. · Il fait mauvais. · Il fait chaud. · Il fait froid.<br>
Il pleut. · Il neige. · Il y a du vent. · Il y a du soleil. · Il y a du brouillard.<br><br>
<b>L'heure</b><br>
Quelle heure est-il ? / Il est quelle heure ?<br>
Il est… 8h00 = huit heures · 8h15 = huit heures et quart<br>
8h30 = huit heures et demie · 8h45 = neuf heures moins le quart<br><br>
<b>Les jours :</b> lundi · mardi · mercredi · jeudi · vendredi · samedi · dimanche<br>
<b>Les mois :</b> janvier · février · mars · avril · mai · juin ·
juillet · août · septembre · octobre · novembre · décembre
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("Il fait beau", "The weather is nice", "", "Il fait beau aujourd'hui !"),
            VocabularyItem("Il pleut", "It is raining", "il plø", "Il pleut, prends ton parapluie."),
            VocabularyItem("Il neige", "It is snowing", "il nɛʒ", "Il neige en décembre."),
            VocabularyItem("Quelle heure est-il ?", "What time is it?", "", "Quelle heure est-il, s'il vous plaît ?"),
            VocabularyItem("aujourd'hui", "today", "o.ʒuʁ.dɥi", "Aujourd'hui c'est lundi."),
            VocabularyItem("demain", "tomorrow", "də.mɛ̃", "Demain il fera beau.")
        ),
        exampleSentences = listOf(
            "— Quelle heure est-il ? — Il est dix heures et demie.",
            "Aujourd'hui il fait froid et il y a du vent.",
            "En été, il fait chaud et il y a beaucoup de soleil.",
            "Quel jour sommes-nous ? — Nous sommes jeudi.",
            "Mon anniversaire est le 5 juin."
        ),
        quiz = listOf(
            QuizQuestion(1, "Comment dit-on 'It is raining' ?",
                listOf("Il neige.", "Il fait beau.", "Il pleut.", "Il fait froid."), 2, "Il pleut = It is raining."),
            QuizQuestion(2, "Quelle phrase demande l'heure ?",
                listOf("Quel temps fait-il ?", "Quelle heure est-il ?", "Quel jour est-on ?", "Comment ça va ?"), 1,
                "'Quelle heure est-il ?' = What time is it?"),
            QuizQuestion(3, "Comment dit-on '8h30' ?",
                listOf("Huit heures moins le quart", "Huit heures et quart", "Huit heures et demie", "Neuf heures"), 2,
                "8h30 = huit heures et demie."),
            QuizQuestion(4, "Quel est le premier jour de la semaine en France ?",
                listOf("Dimanche", "Samedi", "Lundi", "Mardi"), 2, "En France, la semaine commence le lundi."),
            QuizQuestion(5, "Comment dit-on 'It is snowing' ?",
                listOf("Il pleut.", "Il fait froid.", "Il y a du vent.", "Il neige."), 3, "Il neige = It is snowing."),
            QuizQuestion(6, "Quel mois vient après 'mars' ?",
                listOf("Février", "Mai", "Avril", "Juin"), 2, "Après mars vient avril."),
            QuizQuestion(7, "Que signifie 'Il fait beau' ?",
                listOf("It is cold.", "It is raining.", "The weather is nice.", "It is windy."), 2,
                "'Faire beau' = nice weather."),
            QuizQuestion(8, "Comment dit-on 'tomorrow' ?",
                listOf("Hier", "Aujourd'hui", "Demain", "Après-demain"), 2, "Tomorrow = demain."),
            QuizQuestion(9, "Quelle phrase décrit un temps venteux ?",
                listOf("Il fait chaud.", "Il y a du soleil.", "Il y a du vent.", "Il neige."), 2,
                "'Il y a du vent.' = It is windy."),
            QuizQuestion(10, "Comment dit-on '8h45' ?",
                listOf("Neuf heures et quart", "Huit heures moins le quart",
                    "Neuf heures moins le quart", "Huit heures et demie"), 2,
                "8h45 = neuf heures moins le quart.")
        )
    )
)
