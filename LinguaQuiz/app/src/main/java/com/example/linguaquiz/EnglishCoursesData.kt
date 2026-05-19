package com.example.linguaquiz

// ═══════════════════════════════════════════════════════════════
//  ENGLISH  –  BEGINNER  (4 courses)
// ═══════════════════════════════════════════════════════════════

val englishBeginnerCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "en_b_01",
        language = Language.ENGLISH,
        level = Level.BEGINNER,
        orderIndex = 1,
        title = "Greetings & Introductions",
        description = "Learn how to greet people and introduce yourself in English.",
        theoryContent = """
<b>Common Greetings</b><br>
<b>Formal:</b> Good morning · Good afternoon · Good evening · Hello<br>
<b>Informal:</b> Hi · Hey · What's up? · Howdy<br><br>
<b>Asking about wellbeing:</b><br>
How are you? → I'm fine, thank you. / Pretty good. / Not bad.<br>
How's it going? → Great! / So-so. / Could be better.<br><br>
<b>Introductions:</b><br>
My name is [name]. / I'm [name].<br>
Nice to meet you! / Pleased to meet you!<br>
This is my friend [name].<br><br>
<b>Farewells:</b><br>
Goodbye · Bye · See you later · Take care · Have a nice day!
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("Hello", "Bonjour", "həˈloʊ", "Hello! How are you today?"),
            VocabularyItem("Nice to meet you", "Enchanté(e)", "", "Nice to meet you, Sarah!"),
            VocabularyItem("How are you?", "Comment allez-vous ?", "", "Hi John, how are you?"),
            VocabularyItem("I'm fine", "Je vais bien", "", "I'm fine, thank you!"),
            VocabularyItem("Goodbye", "Au revoir", "ˌɡʊdˈbaɪ", "Goodbye, see you tomorrow!"),
            VocabularyItem("Please", "S'il vous plaît", "pliːz", "Can I have a coffee, please?"),
            VocabularyItem("Thank you", "Merci", "ˈθæŋk juː", "Thank you very much!"),
            VocabularyItem("You're welcome", "De rien", "", "You're welcome!")
        ),
        exampleSentences = listOf(
            "— Good morning! How are you? — I'm great, thanks!",
            "— Hi, I'm Alex. What's your name? — I'm Jordan. Nice to meet you!",
            "— This is my colleague, Maria. — Hello Maria, pleased to meet you.",
            "— Bye! Have a great day! — You too, take care!",
            "— Excuse me, could you help me? — Of course! You're welcome."
        ),
        quiz = listOf(
            QuizQuestion(1, "Which greeting is formal?",
                listOf("Hey!", "What's up?", "Good morning!", "Howdy!"), 2,
                "'Good morning' is a formal greeting."),
            QuizQuestion(2, "How do you introduce yourself?",
                listOf("Nice to meet you!", "My name is Alex.", "How are you?", "Goodbye!"), 1,
                "'My name is...' is used for introductions."),
            QuizQuestion(3, "What is the correct response to 'How are you?'",
                listOf("My name is Tom.", "I'm fine, thank you.", "Nice to meet you.", "Goodbye!"), 1,
                "'I'm fine, thank you' is the standard response."),
            QuizQuestion(4, "Which word means 'au revoir'?",
                listOf("Hello", "Please", "Goodbye", "Thank you"), 2, "Goodbye = au revoir."),
            QuizQuestion(5, "What do you say after someone says 'Thank you'?",
                listOf("Please!", "Goodbye!", "You're welcome!", "Hello!"), 2,
                "'You're welcome' is the response to 'thank you'."),
            QuizQuestion(6, "Which greeting is informal?",
                listOf("Good evening", "Hello", "Hi!", "Good afternoon"), 2,
                "'Hi' is an informal greeting."),
            QuizQuestion(7, "How do you say 'Enchanté' in English?",
                listOf("How are you?", "Nice to meet you!", "See you later!", "Take care!"), 1,
                "Nice to meet you = Enchanté(e)."),
            QuizQuestion(8, "Which phrase is a farewell?",
                listOf("Hello!", "How are you?", "Nice to meet you!", "See you later!"), 3,
                "'See you later' is a farewell expression."),
            QuizQuestion(9, "What does 'Please' mean?",
                listOf("Thank you", "Goodbye", "S'il vous plaît", "De rien"), 2,
                "Please = s'il vous plaît."),
            QuizQuestion(10, "Complete: '--- to meet you!' ",
                listOf("Good", "Well", "Nice", "Fine"), 2,
                "The correct expression is 'Nice to meet you!'")
        )
    ),

    StaticCourse(
        id = "en_b_02",
        language = Language.ENGLISH,
        level = Level.BEGINNER,
        orderIndex = 2,
        title = "Numbers & Time",
        description = "Count, tell the time, and talk about dates in English.",
        theoryContent = """
<b>Cardinal Numbers</b><br>
1 one · 2 two · 3 three · 4 four · 5 five · 6 six · 7 seven · 8 eight · 9 nine · 10 ten<br>
11 eleven · 12 twelve · 13 thirteen · 20 twenty · 21 twenty-one<br>
30 thirty · 40 forty · 50 fifty · 60 sixty · 70 seventy · 80 eighty · 90 ninety · 100 one hundred<br><br>
<b>Ordinal Numbers (for dates):</b><br>
1st first · 2nd second · 3rd third · 4th fourth · 5th fifth<br>
20th twentieth · 21st twenty-first<br><br>
<b>Telling the time:</b><br>
3:00 → It's three o'clock.<br>
3:15 → It's quarter past three.<br>
3:30 → It's half past three.<br>
3:45 → It's quarter to four.<br><br>
<b>Dates:</b> July 4th · the fourth of July · on Monday, May 12th
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("What time is it?", "Quelle heure est-il ?", "", "Excuse me, what time is it?"),
            VocabularyItem("o'clock", "heure pile", "", "It's five o'clock."),
            VocabularyItem("half past", "et demie", "", "It's half past two."),
            VocabularyItem("quarter past/to", "et quart / moins le quart", "", "It's quarter past six."),
            VocabularyItem("What's the date?", "Quelle est la date ?", "", "What's the date today?"),
            VocabularyItem("first, second, third", "premier, deuxième, troisième", "", "Today is the first of May.")
        ),
        exampleSentences = listOf(
            "— What time is it? — It's half past ten.",
            "— What's today's date? — It's the fifteenth of March.",
            "The meeting is at quarter to nine.",
            "There are thirty students in my class.",
            "My birthday is on the twenty-second of June."
        ),
        quiz = listOf(
            QuizQuestion(1, "How do you say '3:30' in English?",
                listOf("Three and thirty", "Half past three", "Quarter to three", "Three thirty o'clock"), 1,
                "3:30 = half past three."),
            QuizQuestion(2, "What is the ordinal form of '1'?",
                listOf("One", "Oneth", "First", "Oned"), 2, "1 → first."),
            QuizQuestion(3, "How do you say '45' in English?",
                listOf("Fourty-five", "Forty-five", "Four-five", "Fortyfive"), 1,
                "45 = forty-five (no 'u' in forty!)."),
            QuizQuestion(4, "What does '3:15' mean in words?",
                listOf("Half past three", "Quarter to three", "Quarter past three", "Three o'clock"), 2,
                "3:15 = quarter past three."),
            QuizQuestion(5, "What is the ordinal form of '3'?",
                listOf("Threeth", "Third", "Thrid", "Threed"), 1, "3 → third."),
            QuizQuestion(6, "How do you ask for the time?",
                listOf("What's the date?", "What time is it?", "When is it?", "How long is it?"), 1,
                "'What time is it?' is the standard question."),
            QuizQuestion(7, "How do you say 100 in English?",
                listOf("Ten hundred", "One thousand", "One hundred", "A hundreds"), 2,
                "100 = one hundred."),
            QuizQuestion(8, "What is '3:45' in words?",
                listOf("Quarter past four", "Quarter to four", "Half past three", "Three forty-five o'clock"), 1,
                "3:45 = quarter to four."),
            QuizQuestion(9, "How do you say the date 'May 1st'?",
                listOf("May one", "The first of May", "May first of", "One May"), 1,
                "Dates use ordinal numbers: the first of May."),
            QuizQuestion(10, "Which number has an irregular spelling?",
                listOf("Twenty", "Thirteen", "Forty", "Sixty"), 2,
                "'Forty' is spelled without a 'u' (not 'fourty').")
        )
    ),

    StaticCourse(
        id = "en_b_03",
        language = Language.ENGLISH,
        level = Level.BEGINNER,
        orderIndex = 3,
        title = "Daily Routines",
        description = "Describe your everyday activities using the Simple Present tense.",
        theoryContent = """
<b>Simple Present Tense</b><br>
Use for: habits, routines, general truths<br><br>
<b>Formation:</b><br>
I/You/We/They + base verb → I wake up at 7.<br>
He/She/It + verb + -s/-es → She wakes up at 7.<br><br>
<b>Negatives:</b><br>
I/You/We/They + don't + verb → I don't eat meat.<br>
He/She/It + doesn't + verb → He doesn't drink coffee.<br><br>
<b>Questions:</b><br>
Do + I/you/we/they + verb? → Do you walk to work?<br>
Does + he/she/it + verb? → Does she take the bus?<br><br>
<b>Frequency Adverbs (most → least frequent):</b><br>
always · usually · often · sometimes · rarely · never
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("wake up", "se réveiller", "", "I wake up at 6 AM every day."),
            VocabularyItem("get dressed", "s'habiller", "", "She gets dressed quickly."),
            VocabularyItem("have breakfast", "prendre le petit-déjeuner", "", "We always have breakfast together."),
            VocabularyItem("go to work", "aller au travail", "", "He goes to work by car."),
            VocabularyItem("usually", "habituellement", "", "I usually go to bed at 11 PM."),
            VocabularyItem("never", "jamais", "", "She never skips breakfast.")
        ),
        exampleSentences = listOf(
            "I usually wake up at 7 o'clock.",
            "She always has coffee in the morning.",
            "He doesn't eat breakfast on weekdays.",
            "Do you walk or take the bus to work?",
            "They often watch TV in the evening.",
            "She never goes to bed before midnight."
        ),
        quiz = listOf(
            QuizQuestion(1, "Which is correct for 'he'?",
                listOf("He wake up.", "He wakes up.", "He does wake.", "He waking up."), 1,
                "He/She/It + verb + -s → he wakes up."),
            QuizQuestion(2, "How do you make 'she eat pizza' negative?",
                listOf("She not eat pizza.", "She don't eat pizza.", "She doesn't eat pizza.", "She didn't eat pizza."), 2,
                "She → doesn't + base verb."),
            QuizQuestion(3, "Which adverb means '100% of the time'?",
                listOf("Often", "Usually", "Sometimes", "Always"), 3, "Always = 100% of the time."),
            QuizQuestion(4, "How do you ask a question with 'they'?",
                listOf("Does they work?", "Do they work?", "They do work?", "Work they?"), 1,
                "Do + they + verb."),
            QuizQuestion(5, "Which sentence describes a daily routine?",
                listOf("I ate pizza yesterday.", "I am eating now.", "I always drink tea in the morning.", "I will go tomorrow."), 2,
                "Simple present + frequency adverb = routine."),
            QuizQuestion(6, "What is the correct question form for 'she speaks French'?",
                listOf("Do she speak French?", "Does she speaks French?", "Does she speak French?", "She speaks French?"), 2,
                "Does + she + base verb (no -s on main verb!)."),
            QuizQuestion(7, "Which adverb means 'almost never'?",
                listOf("Always", "Often", "Usually", "Rarely"), 3, "Rarely = almost never."),
            QuizQuestion(8, "Complete: 'He ___ (not/work) on Sundays.'",
                listOf("doesn't works", "don't work", "doesn't work", "not works"), 2,
                "He → doesn't + base verb."),
            QuizQuestion(9, "What does 'I never skip breakfast' mean?",
                listOf("I always eat breakfast.", "I sometimes skip breakfast.", "I often skip breakfast.", "I don't eat breakfast."), 0,
                "Never skip = always do it."),
            QuizQuestion(10, "Which sentence is in Simple Present?",
                listOf("She was sleeping.", "He will come.", "They play football on Saturdays.", "I am eating."), 2,
                "Play (base form) + routine context = Simple Present.")
        )
    ),

    StaticCourse(
        id = "en_b_04",
        language = Language.ENGLISH,
        level = Level.BEGINNER,
        orderIndex = 4,
        title = "Shopping & Prices",
        description = "Navigate shops, ask about prices, and make purchases in English.",
        theoryContent = """
<b>Shopping Vocabulary</b><br>
price · discount · sale · receipt · cashier · fitting room · size<br>
How much does it cost? / How much is it? / What's the price?<br><br>
<b>Quantifiers:</b><br>
<b>Some</b> (affirmative) → I'd like some apples.<br>
<b>Any</b> (negative/question) → Do you have any apples? / I don't have any.<br>
<b>Much</b> (uncountable) → How much water? / Not much.<br>
<b>Many</b> (countable) → How many bags? / Not many.<br><br>
<b>Useful phrases:</b><br>
• Can I try this on? → the fitting room<br>
• Do you have this in a different size?<br>
• I'll take it! / I'll leave it.<br>
• Can I pay by card? / Do you accept cash?
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("How much is it?", "C'est combien ?", "", "Excuse me, how much is this jacket?"),
            VocabularyItem("discount", "réduction", "ˈdɪskaʊnt", "Is there a discount for students?"),
            VocabularyItem("Can I try it on?", "Puis-je l'essayer ?", "", "Can I try this dress on?"),
            VocabularyItem("receipt", "reçu / ticket de caisse", "rɪˈsiːt", "Could I have a receipt, please?"),
            VocabularyItem("I'll take it", "Je le/la prends", "", "It fits perfectly. I'll take it!"),
            VocabularyItem("sale", "soldes / promotion", "seɪl", "Everything is on sale this week!")
        ),
        exampleSentences = listOf(
            "— How much are these shoes? — They're fifty dollars.",
            "— Do you have this in a size 8? — Let me check for you.",
            "— Can I try this jacket on? — Of course! The fitting room is on the left.",
            "— I'll take the blue one, please. — Great! Cash or card?",
            "— Do you have any dresses on sale? — Yes, 20% off everything today!"
        ),
        quiz = listOf(
            QuizQuestion(1, "How do you ask the price of something?",
                listOf("What is this?", "How much is it?", "Do you have this?", "Where is the fitting room?"), 1,
                "'How much is it?' asks for the price."),
            QuizQuestion(2, "Which quantifier is used in questions and negatives?",
                listOf("Some", "Any", "Much", "Many"), 1,
                "'Any' is used in questions and negative sentences."),
            QuizQuestion(3, "What do you say before entering the fitting room?",
                listOf("I'll take it!", "How much is it?", "Can I try this on?", "Do you have a receipt?"), 2,
                "'Can I try this on?' = Puis-je l'essayer ?"),
            QuizQuestion(4, "Which is correct? (uncountable noun)",
                listOf("How many water?", "How much water?", "How many waters?", "How some water?"), 1,
                "Water is uncountable → how much water."),
            QuizQuestion(5, "What does 'on sale' mean?",
                listOf("Available", "Very expensive", "At a reduced price", "Sold out"), 2,
                "'On sale' = at a discounted price."),
            QuizQuestion(6, "Complete: 'Do you have ___ apples?' ",
                listOf("some", "any", "much", "many"), 1,
                "'Any' is used in questions."),
            QuizQuestion(7, "What do you ask to pay differently?",
                listOf("Can I try this on?", "Do you have a discount?", "Can I pay by card?", "Is this on sale?"), 2,
                "'Can I pay by card?' asks about payment method."),
            QuizQuestion(8, "How many is used with which type of noun?",
                listOf("Uncountable", "Countable", "Adjectives", "Verbs"), 1,
                "'Many' → countable nouns (books, bags, apples...)."),
            QuizQuestion(9, "What does 'I'll leave it' mean when shopping?",
                listOf("I'll buy it.", "I'll think about it later.", "I won't buy it.", "I'll take it home."), 2,
                "'I'll leave it' = I decide not to buy it."),
            QuizQuestion(10, "What is a 'receipt'?",
                listOf("A type of clothing", "A document showing what you paid", "A discount voucher", "A price tag"), 1,
                "Receipt = ticket de caisse / preuve d'achat.")
        )
    )
)

val englishIntermediateCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "en_i_01",
        language = Language.ENGLISH,
        level = Level.INTERMEDIATE,
        orderIndex = 1,
        title = "Present Perfect vs Simple Past",
        description = "Master the difference between these two essential past tenses.",
        theoryContent = """
<b>Simple Past</b><br>
Use for: finished actions at a specific time in the past<br>
Form: verb + -ed (regular) or irregular form<br>
Time markers: yesterday · last week · in 2010 · ago · then<br>
Ex.: I <b>visited</b> Paris last summer.<br><br>
<b>Present Perfect</b><br>
Use for: past actions connected to the present / experience / unfinished time<br>
Form: have/has + past participle<br>
Time markers: ever · never · already · yet · since · for · just · recently<br>
Ex.: I <b>have visited</b> Paris. (= at some point in my life)<br><br>
<b>Key contrasts:</b><br>
I <b>lost</b> my keys this morning. (specific past time – morning is over)<br>
I <b>have lost</b> my keys! (result affects now – I still can't find them)<br><br>
Since vs For:<br>
<b>Since</b> + point in time: since 2020 · since Monday<br>
<b>For</b> + duration: for two years · for a long time
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("Have you ever...?", "As-tu jamais... ?", "", "Have you ever tried sushi?"),
            VocabularyItem("I've already...", "J'ai déjà...", "", "I've already finished the report."),
            VocabularyItem("I haven't...yet", "Je n'ai pas encore...", "", "I haven't called him yet."),
            VocabularyItem("She has just...", "Elle vient de...", "", "She has just arrived."),
            VocabularyItem("since / for", "depuis", "", "I've lived here for five years / since 2019."),
            VocabularyItem("recently", "récemment", "", "Have you seen her recently?")
        ),
        exampleSentences = listOf(
            "I visited Rome in 2018. (Simple Past – specific year)",
            "I have visited Rome. (Present Perfect – life experience)",
            "Have you ever eaten croissants? — Yes, I had one last week.",
            "She has worked here for three years.",
            "I haven't finished my homework yet.",
            "He just called — he's on his way!"
        ),
        quiz = listOf(
            QuizQuestion(1, "Which sentence uses Simple Past correctly?",
                listOf("I have gone there yesterday.", "I went there yesterday.", "I have went there.", "Yesterday I have gone."), 1,
                "'Yesterday' = specific past time → Simple Past."),
            QuizQuestion(2, "Complete: 'Have you ___ been to Japan?'",
                listOf("already", "ever", "just", "since"), 1,
                "'Ever' is used in questions with Present Perfect."),
            QuizQuestion(3, "Which tense describes a life experience?",
                listOf("Simple Past", "Present Continuous", "Present Perfect", "Past Continuous"), 2,
                "Present Perfect = experience without a specific time."),
            QuizQuestion(4, "Complete: 'I've lived here ___ 2018.'",
                listOf("for", "since", "ago", "before"), 1,
                "'Since' + point in time."),
            QuizQuestion(5, "Which is correct?",
                listOf("She has visited Paris last year.", "She visited Paris last year.",
                    "She has visit Paris last year.", "She did visited Paris."), 1,
                "'Last year' = specific past time → Simple Past."),
            QuizQuestion(6, "Complete: 'I haven't eaten anything ___ this morning.'",
                listOf("for", "ever", "since", "just"), 2,
                "'Since' + point in time."),
            QuizQuestion(7, "What does 'I've just arrived' mean?",
                listOf("I arrived long ago.", "I arrived a moment ago.", "I will arrive soon.", "I arrive regularly."), 1,
                "'Just' = a very short time ago."),
            QuizQuestion(8, "Which word goes with Present Perfect for duration?",
                listOf("Yesterday", "Last month", "For", "In 2010"), 2,
                "'For' + duration with Present Perfect."),
            QuizQuestion(9, "Which sentence is Present Perfect?",
                listOf("She left an hour ago.", "She has left.", "She was leaving.", "She leaves."), 1,
                "Has + past participle = Present Perfect."),
            QuizQuestion(10, "What does 'yet' signal in a negative sentence?",
                listOf("The action is completed.", "The action hasn't happened but is expected.",
                    "The action happened just now.", "The action will never happen."), 1,
                "'Not...yet' = something expected but not done.")
        )
    ),

    StaticCourse(
        id = "en_i_02",
        language = Language.ENGLISH,
        level = Level.INTERMEDIATE,
        orderIndex = 2,
        title = "Modal Verbs",
        description = "Express ability, possibility, obligation, and advice using modal verbs.",
        theoryContent = """
<b>Modal Verbs + base verb (no 'to', no -s)</b><br><br>
<b>Ability:</b><br>
can (present) → I can swim.<br>
could (past) → She could run fast when she was young.<br><br>
<b>Permission:</b><br>
can / may (polite) → Can/May I open the window?<br><br>
<b>Possibility:</b><br>
might / may → It might rain tomorrow. / She may be late.<br><br>
<b>Advice:</b><br>
should → You should see a doctor.<br>
shouldn't → You shouldn't eat so much sugar.<br><br>
<b>Obligation:</b><br>
must (strong, internal) → I must finish this today.<br>
have to (external) → You have to wear a helmet. (law/rule)<br>
mustn't (prohibition) → You mustn't smoke here.<br>
don't have to (no obligation) → You don't have to come.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("can / could", "pouvoir / savoir", "", "Can you help me? I could swim at age 5."),
            VocabularyItem("should", "devoir (conseil)", "", "You should exercise more often."),
            VocabularyItem("must / have to", "devoir (obligation)", "", "You must show your passport."),
            VocabularyItem("might / may", "pourrait / peut-être", "", "It might snow tonight."),
            VocabularyItem("mustn't", "ne doit pas (interdiction)", "", "You mustn't use your phone while driving."),
            VocabularyItem("don't have to", "n'est pas obligé de", "", "You don't have to wear a tie.")
        ),
        exampleSentences = listOf(
            "You should drink more water every day.",
            "She can speak four languages fluently.",
            "You mustn't park here — it's a no-parking zone.",
            "He might come to the party, but he's not sure.",
            "I have to submit my report by Friday.",
            "You don't have to worry — everything is under control."
        ),
        quiz = listOf(
            QuizQuestion(1, "Which modal expresses advice?",
                listOf("Can", "Must", "Should", "Might"), 2, "'Should' is used for advice."),
            QuizQuestion(2, "Which is correct?",
                listOf("She cans speak Spanish.", "She can speaks Spanish.", "She can speak Spanish.", "She could speaks."), 2,
                "Modal + base verb (no -s, no 'to')."),
            QuizQuestion(3, "What does 'You mustn't smoke here' mean?",
                listOf("You don't need to smoke.", "You are not allowed to smoke.", "You should stop smoking.", "Smoking is fine."), 1,
                "'Mustn't' = prohibition / not allowed."),
            QuizQuestion(4, "What does 'You don't have to come' mean?",
                listOf("You are not allowed to come.", "It is not necessary for you to come.",
                    "You must come.", "You should not come."), 1,
                "'Don't have to' = no obligation."),
            QuizQuestion(5, "Which modal expresses future possibility?",
                listOf("Can", "Should", "Must", "Might"), 3, "'Might' expresses uncertainty/possibility."),
            QuizQuestion(6, "Choose the correct sentence:",
                listOf("You should to go.", "You should going.", "You should go.", "You should went."), 2,
                "Should + base verb (no 'to')."),
            QuizQuestion(7, "What is the difference between 'must' and 'have to'?",
                listOf("They are completely different tenses.",
                    "'Must' is personal obligation; 'have to' is external rule.",
                    "'Must' is for the past; 'have to' is for the present.",
                    "There is no difference."), 1,
                "Must = internal; have to = external rule."),
            QuizQuestion(8, "Which modal is used for polite permission requests?",
                listOf("Must", "Should", "May", "Might"), 2,
                "'May I...?' is the most polite way to ask permission."),
            QuizQuestion(9, "Complete: 'He ___ be at home — I saw his car outside.'",
                listOf("might", "should", "must", "can"), 2,
                "'Must' for logical deduction / certainty."),
            QuizQuestion(10, "What did 'could' express in the past?",
                listOf("Obligation", "Permission in the present", "Ability in the past", "Future possibility"), 2,
                "'Could' = past ability.")
        )
    ),

    StaticCourse(
        id = "en_i_03",
        language = Language.ENGLISH,
        level = Level.INTERMEDIATE,
        orderIndex = 3,
        title = "Conditionals (Types 0, 1 & 2)",
        description = "Express real and hypothetical conditions in English.",
        theoryContent = """
<b>Zero Conditional (general truth)</b><br>
If + present → present<br>
If you heat water to 100°C, it boils.<br><br>
<b>First Conditional (real / likely future)</b><br>
If + present simple → will + base verb<br>
If it rains tomorrow, I will stay home.<br>
Unless = if...not → Unless it rains, we'll have a picnic.<br><br>
<b>Second Conditional (unreal / hypothetical)</b><br>
If + past simple → would + base verb<br>
If I had a million dollars, I would travel the world.<br>
(I don't actually have a million dollars — it's hypothetical)<br><br>
<b>Special case: If I were you...</b><br>
Note: 'were' is used for all persons in Second Conditional (formal)<br>
If I were you, I would apologise.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("unless", "à moins que / sauf si", "", "Unless you hurry, you'll miss the train."),
            VocabularyItem("as long as", "tant que / à condition que", "", "You can borrow it as long as you return it."),
            VocabularyItem("provided that", "à condition que", "", "I'll help, provided that you help me too."),
            VocabularyItem("If I were you", "À ta place", "", "If I were you, I wouldn't do that."),
            VocabularyItem("would", "conditionnel", "", "I would travel more if I had time."),
            VocabularyItem("might", "pourrait", "", "If she studied, she might pass.")
        ),
        exampleSentences = listOf(
            "If you press this button, the machine starts. (Zero)",
            "If it's sunny tomorrow, we'll go to the beach. (First)",
            "If I were taller, I would play basketball. (Second)",
            "Unless you hurry, you'll miss the bus.",
            "If I lived in Paris, I would visit the Louvre every week.",
            "If I were you, I would accept the offer."
        ),
        quiz = listOf(
            QuizQuestion(1, "Which conditional expresses a scientific fact?",
                listOf("First", "Second", "Zero", "Third"), 2,
                "Zero Conditional = general truth / scientific fact."),
            QuizQuestion(2, "Complete (First Conditional): 'If she studies, she ___ pass.'",
                listOf("would", "will", "can", "might have"), 1,
                "First Conditional: If + present → will."),
            QuizQuestion(3, "Which is a Second Conditional sentence?",
                listOf("If it rains, I will stay in.", "If water boils, it evaporates.",
                    "If I had wings, I would fly.", "If she comes, tell her."), 2,
                "Second Conditional: If + past → would."),
            QuizQuestion(4, "What does 'unless' mean?",
                listOf("as long as", "if not", "even if", "when"), 1, "'Unless' = 'if not'."),
            QuizQuestion(5, "Complete (Zero Conditional): 'If you mix red and blue, you ___ purple.'",
                listOf("would get", "will get", "get", "got"), 2,
                "Zero Conditional: If + present → present."),
            QuizQuestion(6, "Which sentence is First Conditional?",
                listOf("If I were rich, I'd travel.", "If you heat ice, it melts.",
                    "If it's cold tomorrow, I'll wear a coat.", "If she had studied, she would have passed."), 2,
                "First Conditional: real future possibility."),
            QuizQuestion(7, "In Second Conditional, which form of 'be' is used?",
                listOf("Is", "Are", "Was", "Were"), 3,
                "'Were' is used for all persons in Second Conditional."),
            QuizQuestion(8, "What does Second Conditional express?",
                listOf("A real past event", "A likely future event",
                    "An unreal / hypothetical situation", "A general truth"), 2,
                "Second Conditional = unreal or hypothetical."),
            QuizQuestion(9, "Complete: 'If I ___ (be) you, I would apologise.'",
                listOf("am", "was", "were", "would be"), 2,
                "If I were you = Second Conditional (formal 'were')."),
            QuizQuestion(10, "Which sentence means the same as 'If you don't leave now, you'll be late'?",
                listOf("Although you leave now, you'll be late.", "Unless you leave now, you'll be late.",
                    "Provided you leave, you won't be late.", "As long as you stay, you'll be late."), 1,
                "Unless = if not → Unless you leave = if you don't leave.")
        )
    ),

    StaticCourse(
        id = "en_i_04",
        language = Language.ENGLISH,
        level = Level.INTERMEDIATE,
        orderIndex = 4,
        title = "Passive Voice",
        description = "Learn to use the passive voice to shift focus from doer to action.",
        theoryContent = """
<b>Passive Voice Formation</b><br>
Subject + be (conjugated) + past participle + (by + agent)<br><br>
<b>Present Simple:</b> Coffee is grown in Colombia.<br>
<b>Past Simple:</b> The Eiffel Tower was built in 1889.<br>
<b>Present Perfect:</b> A new law has been passed.<br>
<b>Future:</b> The report will be published tomorrow.<br>
<b>Modal:</b> This problem must be solved immediately.<br><br>
<b>When to use passive:</b><br>
• The agent is unknown: My car was stolen.<br>
• The agent is obvious: He was arrested. (by police = obvious)<br>
• Focus on the action/result: The bridge is being repaired.<br>
• Formal/scientific writing<br><br>
<b>Active vs Passive:</b><br>
Active: Shakespeare wrote Hamlet.<br>
Passive: Hamlet was written by Shakespeare.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("is made of", "est fait de", "", "This table is made of oak."),
            VocabularyItem("was built", "a été construit", "", "This bridge was built in 1920."),
            VocabularyItem("has been cancelled", "a été annulé", "", "The flight has been cancelled."),
            VocabularyItem("will be announced", "sera annoncé", "", "The winner will be announced tomorrow."),
            VocabularyItem("by", "par (agent)", "", "The novel was written by Orwell."),
            VocabularyItem("is being repaired", "est en cours de réparation", "", "The road is being repaired.")
        ),
        exampleSentences = listOf(
            "The Mona Lisa was painted by Leonardo da Vinci.",
            "Millions of emails are sent every day.",
            "The meeting has been postponed.",
            "New vaccines are being developed.",
            "The results will be announced next Friday.",
            "Your package must be collected by 5 PM."
        ),
        quiz = listOf(
            QuizQuestion(1, "How is the passive formed?",
                listOf("Have + past participle", "Be + past participle", "Do + past participle", "Get + infinitive"), 1,
                "Passive = be (conjugated) + past participle."),
            QuizQuestion(2, "Transform: 'They built the bridge in 1900.'",
                listOf("The bridge built in 1900.", "The bridge is built in 1900.",
                    "The bridge was built in 1900.", "The bridge has been built in 1900."), 2,
                "Past simple passive: was/were + past participle."),
            QuizQuestion(3, "Which passive tense is: 'The report has been submitted'?",
                listOf("Present Simple Passive", "Past Simple Passive",
                    "Present Perfect Passive", "Future Passive"), 2,
                "Has been + past participle = Present Perfect Passive."),
            QuizQuestion(4, "When is the passive used?",
                listOf("When the doer is the main focus.", "When the agent is unknown or unimportant.",
                    "Only in informal writing.", "Only in the present tense."), 1,
                "Passive is used when the agent is unknown/unimportant."),
            QuizQuestion(5, "Transform: 'Scientists are discovering new species.'",
                listOf("New species are discovering.", "New species are being discovered.",
                    "New species have been discovered.", "New species were discovered."), 1,
                "Present Continuous passive: is/are being + past participle."),
            QuizQuestion(6, "Which word introduces the agent in a passive sentence?",
                listOf("with", "from", "by", "of"), 2,
                "The agent is introduced by 'by'."),
            QuizQuestion(7, "Complete: 'The homework must ___ by Monday.'",
                listOf("submit", "be submitted", "submitted", "being submitted"), 1,
                "Modal passive: must + be + past participle."),
            QuizQuestion(8, "Which sentence is correct?",
                listOf("The cake eaten was by Maria.", "The cake was eat by Maria.",
                    "The cake was eaten by Maria.", "The cake has eat by Maria."), 2,
                "Was + eaten (past participle) + by."),
            QuizQuestion(9, "Transform to active: 'The letter was sent by John.'",
                listOf("John sends the letter.", "John sent the letter.",
                    "John has sent the letter.", "John is sending the letter."), 1,
                "Was sent = past simple passive → past simple active."),
            QuizQuestion(10, "Complete: 'A new hospital ___ in our city next year.'",
                listOf("builds", "will build", "will be built", "is being built"), 2,
                "Future passive: will + be + past participle.")
        )
    )
)

val englishAdvancedCourses: List<StaticCourse> = listOf(

    StaticCourse(
        id = "en_a_01",
        language = Language.ENGLISH,
        level = Level.ADVANCED,
        orderIndex = 1,
        title = "Advanced Grammar: Inversion & Cleft Sentences",
        description = "Use sophisticated grammar structures to add emphasis and vary style.",
        theoryContent = """
<b>Inversion after negative / restrictive adverbials</b><br>
When certain adverbials are placed first, the subject and auxiliary invert:<br><br>
• <b>Never</b> have I seen such beauty.<br>
• <b>Rarely</b> does she arrive on time.<br>
• <b>Not only</b> did he fail, but he also refused to apologise.<br>
• <b>Hardly</b> had I sat down when the phone rang.<br>
• <b>No sooner</b> had she left than it started raining.<br>
• <b>Only then</b> did I understand the truth.<br><br>
<b>Cleft Sentences with 'It is/was...that'</b><br>
Used to emphasise one part of a sentence:<br>
Normal: John broke the window yesterday.<br>
Emphasise who: <b>It was John who/that</b> broke the window.<br>
Emphasise when: <b>It was yesterday that</b> John broke the window.<br><br>
<b>'What' clauses</b><br>
What I need is a good rest.<br>
What surprised me was his reaction.
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("Never have I...", "Jamais je n'ai...", "", "Never have I felt so inspired."),
            VocabularyItem("Not only... but also", "Non seulement... mais aussi", "", "Not only is she talented, but she's also hardworking."),
            VocabularyItem("It was... that/who", "C'est... que/qui", "", "It was Maria who solved the problem."),
            VocabularyItem("Hardly had... when", "À peine... que", "", "Hardly had I arrived when it started raining."),
            VocabularyItem("What I find...", "Ce que je trouve...", "", "What I find remarkable is his dedication."),
            VocabularyItem("Only then", "C'est seulement alors que", "", "Only then did I realise my mistake.")
        ),
        exampleSentences = listOf(
            "Never before have scientists observed such a phenomenon.",
            "Not only did the team win, but they also broke the record.",
            "It was the lack of funding that caused the project to fail.",
            "Hardly had the match begun when the rain stopped play.",
            "What the government needs to address is the housing crisis.",
            "Only then did she understand the gravity of the situation."
        ),
        quiz = listOf(
            QuizQuestion(1, "What triggers subject-auxiliary inversion?",
                listOf("A question mark", "A fronted negative/restrictive adverbial",
                    "A passive construction", "A relative clause"), 1,
                "Inversion occurs after negative/restrictive adverbials at the front."),
            QuizQuestion(2, "Which sentence uses correct inversion?",
                listOf("Never I have seen this.", "Never have I seen this.",
                    "Never I seen have this.", "Have I never seen this."), 1,
                "Never + auxiliary + subject + main verb."),
            QuizQuestion(3, "What does a cleft sentence emphasise?",
                listOf("The verb tense", "One specific element of information",
                    "The entire sentence", "The passive voice"), 1,
                "Cleft sentences highlight one particular element."),
            QuizQuestion(4, "Transform: 'John invented the telephone.'  Emphasise 'John'.",
                listOf("It was the telephone that John invented.", "It was John who invented the telephone.",
                    "John, he invented the telephone.", "The telephone was invented by John who."), 1,
                "It was + [emphasis] + who/that + rest."),
            QuizQuestion(5, "Complete: 'Not only ___ she speak French, but she also speaks Arabic.'",
                listOf("does", "do", "is", "has"), 0,
                "Not only + auxiliary + subject + verb."),
            QuizQuestion(6, "Which sentence uses a 'What' cleft correctly?",
                listOf("What I need a holiday.", "What I need is a holiday.",
                    "What need I is a holiday.", "What is I need a holiday."), 1,
                "What + clause + be + [emphasis]."),
            QuizQuestion(7, "Complete: 'Hardly ___ he arrived when she left.'",
                listOf("have", "has", "had", "did"), 2,
                "Hardly had + subject + past participle (past perfect + inversion)."),
            QuizQuestion(8, "Which adverb triggers inversion?",
                listOf("Often", "Usually", "Seldom", "Frequently"), 2,
                "'Seldom' is a restrictive adverb that triggers inversion."),
            QuizQuestion(9, "What is the function of 'It was in Paris that they met'?",
                listOf("It describes the weather.", "It emphasises the location.",
                    "It is a passive sentence.", "It is a question."), 1,
                "Cleft sentence emphasising 'in Paris'."),
            QuizQuestion(10, "Which is more formal?",
                listOf("I have never seen this before.", "Never have I seen this before.",
                    "I haven't ever seen this.", "I didn't ever see this."), 1,
                "Inversion = more emphatic and formal register.")
        )
    ),

    StaticCourse(
        id = "en_a_02",
        language = Language.ENGLISH,
        level = Level.ADVANCED,
        orderIndex = 2,
        title = "Academic Writing & Formal Register",
        description = "Write clear, precise, and persuasive texts in academic English.",
        theoryContent = """
<b>Formal vs Informal Register</b><br>
Informal → Formal<br>
get → obtain / receive · show → demonstrate · use → utilise<br>
think → consider · find out → ascertain · help → facilitate<br>
a lot of → a considerable number of · but → however<br><br>
<b>PEEL Paragraph Structure:</b><br>
<b>P</b>oint → state your argument clearly<br>
<b>E</b>vidence → support with data, quotes, examples<br>
<b>E</b>xplain → interpret / analyse the evidence<br>
<b>L</b>ink → connect back to the essay question<br><br>
<b>Hedging Language (showing uncertainty):</b><br>
It would appear that… · This suggests that…<br>
It could be argued that… · There is evidence to suggest…<br>
Findings indicate that… · This may imply…<br><br>
<b>Discourse Markers:</b><br>
Furthermore · Nevertheless · In contrast · Consequently · In conclusion
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("demonstrate", "démontrer", "", "The data demonstrates a clear trend."),
            VocabularyItem("it could be argued", "on pourrait soutenir que", "", "It could be argued that technology improves education."),
            VocabularyItem("furthermore", "de plus / en outre", "", "Furthermore, the study reveals new patterns."),
            VocabularyItem("nevertheless", "néanmoins", "", "The results are inconclusive; nevertheless, they are significant."),
            VocabularyItem("in contrast", "en revanche / par contraste", "", "In contrast, the control group showed no improvement."),
            VocabularyItem("consequently", "par conséquent", "", "Consequently, further research is required.")
        ),
        exampleSentences = listOf(
            "The evidence strongly suggests that climate change is accelerating.",
            "Furthermore, the economic implications cannot be overstated.",
            "In contrast, previous studies yielded conflicting results.",
            "It could be argued that digital literacy is now a basic life skill.",
            "Consequently, policymakers must prioritise renewable energy investment.",
            "This study aims to demonstrate the correlation between exercise and wellbeing."
        ),
        quiz = listOf(
            QuizQuestion(1, "Which word is more formal than 'show'?",
                listOf("Tell", "Demonstrate", "Say", "Give"), 1, "'Demonstrate' is the formal equivalent of 'show'."),
            QuizQuestion(2, "What does PEEL stand for?",
                listOf("Point, Evidence, Explain, Link", "Paragraph, Example, Elaboration, Logic",
                    "Prove, Evidence, Evaluate, Language", "Point, Essay, Explain, Language"), 0,
                "PEEL = Point · Evidence · Explain · Link."),
            QuizQuestion(3, "Which phrase is an example of hedging?",
                listOf("This proves that...", "It is absolutely certain that...",
                    "It could be argued that...", "Everyone knows that..."), 2,
                "Hedging = cautious, academic language."),
            QuizQuestion(4, "Which is NOT appropriate in formal academic writing?",
                listOf("Furthermore", "Nevertheless", "It doesn't show", "In contrast"), 2,
                "'It doesn't' = contraction → informal → avoid in academic writing."),
            QuizQuestion(5, "What is the formal equivalent of 'a lot of'?",
                listOf("Many", "Tons of", "A considerable number of", "Loads of"), 2,
                "'A considerable number of' = formal academic style."),
            QuizQuestion(6, "Which discourse marker introduces a contrasting idea?",
                listOf("Furthermore", "Consequently", "Nevertheless", "Similarly"), 2,
                "'Nevertheless' = in spite of that / however."),
            QuizQuestion(7, "What does hedging language express?",
                listOf("Strong certainty", "Caution or uncertainty", "Personal opinion", "Informal register"), 1,
                "Hedging signals that a claim is not absolute."),
            QuizQuestion(8, "Which word is the formal equivalent of 'use'?",
                listOf("Apply", "Utilise", "Try", "Do"), 1, "'Utilise' is a formal academic synonym."),
            QuizQuestion(9, "Where does the 'Link' step go in a PEEL paragraph?",
                listOf("First", "After the Point", "After the Evidence", "Last"), 3,
                "PEEL: Point → Evidence → Explain → Link (at the end)."),
            QuizQuestion(10, "Which phrase correctly introduces evidence?",
                listOf("I think that...", "According to recent research...", "I guess...", "Everybody says..."), 1,
                "'According to recent research' is a formal evidence marker.")
        )
    ),

    StaticCourse(
        id = "en_a_03",
        language = Language.ENGLISH,
        level = Level.ADVANCED,
        orderIndex = 3,
        title = "Idiomatic English & Collocations",
        description = "Sound natural and fluent by mastering idioms and word partnerships.",
        theoryContent = """
<b>Advanced English Idioms</b><br>
• <b>Bite the bullet</b> = endure a difficult situation bravely<br>
• <b>The ball is in your court</b> = it's your turn to take action<br>
• <b>Burn bridges</b> = permanently damage a relationship<br>
• <b>Cut to the chase</b> = get to the point<br>
• <b>Hit the nail on the head</b> = describe exactly what is correct<br>
• <b>Under the weather</b> = feeling slightly ill<br>
• <b>Once in a blue moon</b> = very rarely<br>
• <b>Sit on the fence</b> = refuse to take sides<br>
• <b>Pull someone's leg</b> = to joke with someone<br>
• <b>Costs an arm and a leg</b> = very expensive<br><br>
<b>Common Collocations:</b><br>
make a decision · take action · give advice · do research<br>
heavy rain · strong wind · deep sleep · high demand<br>
break a record · miss an opportunity · reach a conclusion
        """.trimIndent(),
        vocabulary = listOf(
            VocabularyItem("bite the bullet", "serrer les dents", "", "Just bite the bullet and apologise."),
            VocabularyItem("cut to the chase", "aller droit au but", "", "Let's cut to the chase — will you take the job?"),
            VocabularyItem("under the weather", "ne pas être dans son assiette", "", "I'm a bit under the weather today."),
            VocabularyItem("make a decision", "prendre une décision", "", "It's time to make a decision."),
            VocabularyItem("break a record", "battre un record", "", "She broke the world record by two seconds."),
            VocabularyItem("once in a blue moon", "une fois tous les 36 du mois", "", "He visits us once in a blue moon.")
        ),
        exampleSentences = listOf(
            "I know the surgery is scary, but you'll have to bite the bullet.",
            "We've sent our proposal — now the ball is in their court.",
            "Let's cut to the chase: are you interested in the position or not?",
            "She hit the nail on the head with her analysis.",
            "He's under the weather and won't be coming to the meeting.",
            "That new restaurant costs an arm and a leg — the bill was enormous!"
        ),
        quiz = listOf(
            QuizQuestion(1, "What does 'bite the bullet' mean?",
                listOf("To eat something hard", "To endure a difficult situation bravely",
                    "To give up easily", "To make a mistake"), 1,
                "'Bite the bullet' = endure something painful or difficult."),
            QuizQuestion(2, "What does 'the ball is in your court' mean?",
                listOf("You made a mistake.", "It is now your responsibility to act.",
                    "You are playing sports.", "You are being blamed."), 1,
                "It's your turn / your responsibility now."),
            QuizQuestion(3, "Which collocation is correct?",
                listOf("Do a decision", "Make a decision", "Take a decision in France only", "Have a decision"), 1,
                "'Make a decision' is the standard collocation."),
            QuizQuestion(4, "What does 'under the weather' mean?",
                listOf("It's raining outside.", "Feeling slightly ill.", "Being very happy.", "Working outdoors."), 1,
                "'Under the weather' = not feeling well."),
            QuizQuestion(5, "What does 'cut to the chase' mean?",
                listOf("To start chasing someone", "To arrive late", "To get to the main point quickly", "To be nervous"), 2,
                "'Cut to the chase' = get to the point immediately."),
            QuizQuestion(6, "Which is the correct collocation with 'research'?",
                listOf("Make research", "Take research", "Do research", "Have research"), 2,
                "'Do research' is the correct collocation."),
            QuizQuestion(7, "What does 'once in a blue moon' mean?",
                listOf("Every month", "Very frequently", "Very rarely", "During full moon only"), 2,
                "'Once in a blue moon' = very rarely / almost never."),
            QuizQuestion(8, "What does 'hit the nail on the head' mean?",
                listOf("To make a mistake", "To hammer something", "To describe something exactly right", "To be too direct"), 2,
                "Hit the nail on the head = say/do exactly the right thing."),
            QuizQuestion(9, "Which collocation with 'advice' is correct?",
                listOf("Do advice", "Make advice", "Give advice", "Take an advice"), 2,
                "'Give advice' is correct (advice is uncountable)."),
            QuizQuestion(10, "What does 'costs an arm and a leg' mean?",
                listOf("Involves physical effort", "Is very cheap", "Is very expensive", "Is dangerous"), 2,
                "'Costs an arm and a leg' = is very expensive.")
        )
    )
)
