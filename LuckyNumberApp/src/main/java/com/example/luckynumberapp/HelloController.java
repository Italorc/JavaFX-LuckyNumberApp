package com.example.luckynumberapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class HelloController {
    @FXML
    private Text welcomeText;
    @FXML
    private Text xErrorMsg;
    @FXML
    private Button xSubmitButton;
    @FXML
    private Button xCancelButton;
    @FXML
    private DatePicker xDob;
    @FXML
    private TextField xName;

    public void closeButtonOnAction(ActionEvent e){                //close button function
        Stage stage = (Stage) xCancelButton.getScene().getWindow();
        stage.close();
    }

    public void submitButtonOnAction(ActionEvent e){
        //Display a warning
        if (xName.getText().isBlank() == false || xDob.getValue() == null){
            xErrorMsg.setText("All fields are mandatory!");
        }
        //Getting name and dob
        String zName = xName.getText();
        LocalDate zDob = xDob.getValue();

        //Getting lucky number
        String bDate = zDob.toString();
        bDate = bDate.replaceAll("-", ""); //removing the "-" character

        String arrayDate[] = bDate.split("");  //putting all the numbers in an array
        int sum = 0;
        for (int i=0; i<= 7; i++) {   // for loop to sum all the array's items
            sum += Integer.parseInt(String.valueOf(arrayDate[i]));
        }

        int luckyNum=0;
        while(sum>0) {              //while loop to sum the algarisms of the sum result
            luckyNum += sum % 10;
            sum /= 10;
        }

        //declaring the variables for each lucky number to display on screen
        String friends1 = "Your friends numbers are: 1, 2, 4, 5, 7, 9";
        String neutral1 = "Your neutral number is: 3";
        String enemy1 = "Your enemy numbers are: 6, 8";
        String comment1 = "Just as Aries, the first sign of the zodiac, is about action and initiation, in numerology, 1 is linked to forward motion. 1 symbolizes a pioneering spirit, independent nature, and innate leadership capabilities. On a bad day, 1 can be a bit bossy or boastful, hiding any insecurities behind over-developed self-importance. 1 must remember that although it is first, it can very quickly become the loneliest number. Even the most autonomous 1s need the support of their friends, family, and lovers";

        String friends2 = "Your friends numbers are: 1, 2, 3, 4, 7, 8";
        String neutral2 = "Your neutral numbers are: 5, 6";
        String enemy2 = "Your enemy number is: 9";
        String comment2 = "2 is linked to sensitivity, balance, and harmony. Within numerology, the 2 vibration assumes the role of the mediator, creating harmony by bringing together dissonant forces through compassion, empathy, and kindness. 2 is linked to psychic abilities and intuition, and if this number appears as a Life Path or Destiny Number, the individual will be astute to subtle energy shifts and emotional nuances. Because 2 is so sensitive, it is very conflict-averse, and can end up feeling under-appreciated or unacknowledged. 2 must avoid seeking external validation and, instead, realize that perfect equilibrium needed already exists within.";

        String friends3 = "Your friends number are: 2, 3, 6, 8, 9";
        String neutral3 = "Your neutral numbers are: 1, 4, 7";
        String enemy3 = "Your enemy number is: 5";
        String comment3 = "Communication is paramount for 3. Symbolically, 3 represents the output of two joined forces: It is the essence of creation. 3 is highly gifted at expression, seamlessly sharing innovative and pioneering concepts through art, writing, and oration. Your work inspires, motivates, and uplifts others, and 3 finds great joy making others smile. However, 3 is also known to be quite moody, and if 3 feels misunderstood, may withdraw entirely. The escapist tendencies of 3 are easily mitigated by practicing peaceful mindfulness: With such an active imagination, its important for 3 to find moments of quiet to reset, restore, and recharge.";

        String friends4 = "Your friends number are: 1, 2, 4, 5, 7";
        String neutral4 = "Your neutral numbers are: 3, 8, 9";
        String enemy4 = "Your enemy number is: 6";
        String comment4 = "In numerology, 4 has an earthy-energy and is centered around fortifying its roots. 4 adamantly believes in the physical world and knows that investing in a solid infrastructure is necessary for building a lasting legacy. Practical, hardworking, and responsible, the vibration of the number 4 is focused on creating logical systems that can support scalable growth. There is a solidity to 4, however, that can quickly devolve into rigidity; 4 must remember that rules are meant to enhance, not inhibit. Its easy for 4 to become stubborn, so 4 benefits from learning to loosen up and think outside-the-box. 4 will feel liberated and inspired by finding the bravery to take a few bold risks.";

        String friends5 = "Your friends number are: 1, 4, 5";
        String neutral5 = "Your neutral numbers are: 2, 3, 6, 7";
        String enemy5 = "Your enemy numbers are: 8, 9";
        String comment5 = "Free-thinking, adventurous, and progressive, 5 is defined by freedom. 5 needs to experience the world by engaging its five senses: For 5, life lessons are acquired through spontaneous acts of bravery. Akin to Sagittarius energy within astrology, 5 is known for its playful, impulsive, and vivacious spirit. But on the other side of its signature joie de vivre, 5 can become restless and impatient. Since 5 is always seeking discovery, it has a difficult time accepting lifes day-to-day responsibilities  including professional and interpersonal commitments. 5 must remember that when it narrows its gaze, it will discover that the most rewarding exploration exists in its own backyard.";

        String friends6 = "Your friends number are: 3, 6, 9";
        String neutral6 = "Your neutral numbers are: 2, 4, 5, 7, 8";
        String enemy6 = "Your enemy number is: 1";
        String comment6 = "6 is recognized for its nurturing, supportive, and empathic nature. A true healer, 6 has the ability to problem solve in both the emotional and physical realms, helping others through its straightforward, yet gentle, approach. 6 has a strong sense of responsibility, and cares deeply for its friends, family, and lovers. This number also can easily communicate with children and animals, displaying a soft tenderness and caretaker spirit. But not everything needs to be parented, and sometimes 6s protective energy can become domineering and controlling. To avoid carrying the world on its shoulders, 6 must learn to build trust and understanding for others: Simply put, everyone must follow their own unique path.";

        String friends7 = "Your friends number are: 1, 3, 5, 6, 7, 8";
        String neutral7 = "YYour neutral numbers are: 2, 4";
        String enemy7 = "Your enemy number is: 9";
        String comment7 = "The detectives of numerology, 7 is known for its investigative abilities and analytical skills. Astrologically, the number 7 can be thought of as a blend of Virgo and Scorpio energy: 7 is extremely detail-oriented, but is driven by inner-wisdom as opposed to tangible realities. 7 has a keen eye, and its astute observations fuel a quick-witted, inventive spirit. Because it can quickly find the flaws in almost any system, 7 is a bit of a perfectionist. 7 will often assume fault, so its important for this number to counterbalance its inherent skepticism with an open mind. Not everything will be foolproof  but thats what makes life fun.";

        String friends8 = "Your friends number are: 3, 8";
        String neutral8 = "Your neutral numbers are: 2, 4, 5, 6, 7, 9";
        String enemy8 = "Your enemy number is: 1";
        String comment8 = "8 is all about abundance. Within numerology, this number is linked to material wealth and financial success. Ambitious and goal-oriented, 8 can effortlessly assume leadership positions through its natural magnetism. 8 applies big-picture thinking to broaden its scope, racing up the top of any ladder to reach extraordinary heights. But with great power comes great responsibility: 8 breeds workaholics, and on a bad day, can become excessively controlling and possessive. However, its negative qualities can be lessened by giving back to the community. By using is success to help others, 8 realizes that there is nothing more valuable than contributing to the greater good.";

        String friends9 = "Your friends number are: 3, 8, 9";
        String neutral9 = "Your neutral numbers are: 1, 4, 6, 7";
        String enemy9 = "Your enemy numbers are: 2, 5";
        String comment9 = "As the final single digit within numerology, 9 connotes an old soul. 9 is no stranger lifes ups-and-downs of life been there, done that. Accordingly, 9 can effortlessly synthesize large quantities of stimuli, psychically connecting the dots to form a cohesive whole. The mission for 9 is to reach its highest state of consciousness, and to help others also achieve this spiritual awareness. 9 isnt afraid to transform, and its malleable spirit inspires others to explore their own ranges of motion. Since 9, in many ways, has transcended the physical plane, it must constantly remember to anchor itself. 9 must learn to balance the abstract with the tangible, ultimately finding its place at the intersection of fantasy and reality.";

        //switch case to print different results based on luck number
        String friends = "";
        String neutral = "";
        String enemy = "";
        String comment = "";

        switch(luckyNum){
            case 1:
                friends = friends1;
                neutral = neutral1;
                enemy = enemy1;
                comment = comment1;
                break;
            case 2:
                friends = friends2;
                neutral = neutral2;
                enemy = enemy2;
                comment = comment2;
                break;
            case 3:
                friends = friends3;
                neutral = neutral3;
                enemy = enemy3;
                comment = comment3;
                break;
            case 4:
                friends = friends4;
                neutral = neutral4;
                enemy = enemy4;
                comment = comment4;
                break;
            case 5:
                friends = friends5;
                neutral = neutral5;
                enemy = enemy5;
                comment = comment5;
                break;
            case 6:
                friends = friends6;
                neutral = neutral6;
                enemy = enemy6;
                comment = comment6;
                break;
            case 7:
                friends = friends7;
                neutral = neutral7;
                enemy = enemy7;
                comment = comment7;
                break;
            case 8:
                friends = friends8;
                neutral = neutral8;
                enemy = enemy8;
                comment = comment8;
                break;
            case 9:
                friends = friends9;
                neutral = neutral9;
                enemy = enemy9;
                comment = comment9;
                break;
        }

        //Obtaining the first letter
        char luckyLetter = zName.charAt(0);

        String alphaResult = "";

        //Switch case for results based on letter
        switch(luckyLetter){
            case 'A':
                alphaResult = "People with the starting letter A in their name are considered to be very purposeful in life and have big ambitions, according to name numerology. Usually the independent type, the goal is everything to them and will do everything to get their dreams fulfilled. Everything they do is original, which is usually what makes them recognized by everyone. They can also be quite straightforward and can unintentionally hurt your feelings. Being bold and courageous, they do not just think and contemplate but will act and take steps forward, to reach their destination. Although, their personality can be a bit rigid, as they find it difficult to change or adapt according to situations.";
                break;
            case 'B':
                alphaResult = "People with the starting letter B in their name are the sentimental and emotional type. Being reserved and calm in nature, they will always try to maintain harmony everywhere they go. To know what they actually mean when they say or do something is not very difficult as they are quite transparent and open about their feelings. But their fixed way of thinking, that what they do or know is usually right is a bit challenging for people associating with them. It can also be a nuisance for them as they lose opportunities when they do not change their way of thinking sometimes.";
                break;
            case 'C':
                alphaResult = "People with the starting alphabet C in their name are the open and expressive ones. As per name numerology, they will not hesitate to share their deepest and darkest secrets and will express them with such seriousness that there will not be a chance to think they are joking. Whatever emotions they feel, they feel them more than anyone else, and because of this, they are always light and joyful. Neither do they feel depressed nor would they allow any to feel the same because they do not bottle up their feelings. This makes others around them comfortable doing the same. But in the efforts of trying everything, they can stick to one thought, which makes them lack stability.";
                break;
            case 'D':
                alphaResult = "People with the starting letter D in their name are the logical ones of the group. Spontaneity is not their thing as they like to analyze and calculate every movement and step. Because of their methodical manners, they rarely commit any mistakes which in turn gives them the results they desire. Their determination and dedication give them self-confidence and their courageous nature gives them a name in society. Although they have an authoritative nature and it suits them perfectly, they can be stubborn sometimes and will not yield to anyone else's opinion. According to the numerology of the alphabet, their way of approaching a problem will be in a practical way rather than emotional, and are not only dreamers but also doers.";
                break;
            case 'E':
                alphaResult = "People with the starting letter E in their name are outgoing and spontaneous. They love to pursue physical activities and enjoy the passion and positives in life. Since they love to live life to the fullest and do not regret anything, there are chances that they might get married more than once. Their enthusiasm for everything and their wish to fulfill every desire is contagious in a way that people around them get inspired to live the same way. Even if they are very emotional and sensible, they are equally rational and logical, and wonâ€™t be fooled easily. Unlike others, it is not difficult for them to view things from a different perspective and accept the same.";
                break;
            case 'F':
                alphaResult = "Positivity and goodness are what the people with F in their names spread wherever they go. Their way of living is quite inspiring. Always ready to help, they will never look away from someone in trouble. They are cheerful and sensible. These natives, according to name numerology, have an openness about them that makes them more approachable than others and helps them connect with a lot of people. They are somewhat of an empath, because of which they feel and understand others' emotions and worries. This can be a problem for them because as they feel for everyone and cannot look away from someone suffering, they will want to sacrifice their own happiness and success to make their close ones happy and satisfied.";
                break;
            case 'G':
                alphaResult = "People with the starting letter G in them are the dominating and powerful ones. Those who have the alphabet G in their name can be very intimidating as they are all business and have no bluff. They are always dedicated and hardworking and will reach their goal at any cost. Not caring what others have to say, they will work on their plan with determination and will get success without the help of others. They are usually on the right path and rarely make mistakes. But they can also be sensible and empathize. To reach their goal, they will not push someone down but will get everything they want along with lifting the other person. These people are also considered psychics as they can predict the future and can draw in fortune without effort. They also have the ability to telepath.";
                break;
            case 'H':
                alphaResult = "People with the starting letter H in their name are very sure of themselves and know what they are doing. They trust their intuition and feelings and opinions. Whatever they do is different from everyone else as they are creative and do not fear trying something new. Even if they have a tendency to lose money, they can earn it back just as easily. But they sometimes can get caught up in their emotions and can get lonely. As they tend to overthink a lot, it makes them skeptical of everything, binding them from enjoying. They just need to give their mind a rest and realize that with time everything will fall into place and life has a way of making everything right in the end.";
                break;
            case 'I':
                alphaResult = "People with the starting letter I am in their names, they are in general very sensitive and care very much about the feelings of others. They try very hard not to hurt anyone or to cause problems for anyone. Born to be artists, these alphabet people have quite a grip on the field of art and can get extremely creative. But they cannot function much in dire situations and lose control, which leads to them falling prey to accidents. Maintaining a balance is very important to have stability in life. Try thinking about the consequences and planning things beforehand to avoid difficult situations.";
                break;
            case 'J':
                alphaResult = "People with the starting letter J in their name are loved by everyone as they are who they are and do not pretend to be someone else. Dependable and responsible, they will not let anyone down. They are faithful and honest, because of which they can be trusted easily. Along with everything, they are also very sensible and empathize and connect with people easily. Even if they are ambitious, these people as per name numerology will not do anything at the expense of others. As compassionate people, they are always ready to be of help and support to anyone in tough situations. They are also creative in nature and are quite witty and resourceful which they can use to be successful in life. Just the right amount of motivation will push them to great heights.";
                break;
            case 'K':
                alphaResult = "Success is not negotiable for those who have the alphabet K in their name. Determined to achieve everything they wish for drives them to work hard and be consistent. They have an intuitive way of thinking and will listen to everything their inner self is saying. Their brains are filled with tons of knowledge and ideas and can mold themselves to fit any situation. Being headstrong and powerful, they have all the leadership qualities which define their personality. But every good thing comes with a bad thing too. These people, although powerful and ambitious, can sometimes fall prey to self-doubt. They sometimes become unsure of their decisions and falter when taking an important step, fearing failure. They should avoid that and realize that failure is a part of life and move on with confidence.";
                break;
            case 'L':
                alphaResult = "People with the starting letter p in their name are intelligent and do everything in an intellectual way. Making a decision is hard for them as they like to contemplate a lot. These people are genuine in nature and do everything with sincere hearts and will pretend otherwise. According to name numerology, the L name alphabet people possess all chances that they will be in accidents as they travel a lot. So they should be careful of that.";
                break;
            case 'M':
                alphaResult = "These people are very hardworking and do not like to sit around and waste time. But they should limit their working tendencies as they can overwork themselves. Since they like to have a domestic life, they work extra hard to be financially secure. Moreover, people with the alphabet M in name numerology provide their family with all the comfort. It is advised to people with this name numerology to manage their anger and solve every problem with a calm demeanor.";
                break;
            case 'N':
                alphaResult = "These people have a very intuitive mind and their inner self hard sends them the wrong message. Being the creative one of the lot, they will not follow the conventional ways and will come up with unique and innovative ideas. They like to gather knowledge as much as possible, and because of this they have an opinionated nature and believe in things they know. These people are also sensual, which can lead them to have many love affairs.";
                break;
            case 'O':
                alphaResult = "People with the starting letter O in their names are believed to be religious in nature. They have a strong moral compass and will avoid doing wrong to anyone. Their patients are commendable as they act calmly and rationally in even the most difficult situations. It is rare for them to ever break a law and always be careful with legal things. Even if they are disciplined and focused, this name numerology people sometimes get jealous about others' success but don't let that jealousy sway their morality.";
                break;
            case 'P':
                alphaResult = "These people are very intelligent and resourceful. They like to read news articles and watch documentaries as they help them to gather knowledge. Even if they can become close to people easily, they avoid it as much as possible as they love their space and like to stay by themselves most of the time. They will keep their distance when necessary and can also have secrets they cannot reveal. Moreover, according to this name, numerology people have attachment issues and find it hard to let go of things.";
                break;
            case 'Q':
                alphaResult = "Fortune is high when it comes to money for those who have Q in their name. But be careful as with good fortune comes difficult situations to balance things out. Although they earn money easily, they also become victims of loss. Dominating in nature, they have an aura about them that influences others' thoughts a lot. They do not like to open up about themselves a lot which gives them a mysterious form and usually becomes the talk of the town. They also have excellent communication skills.";
                break;
            case 'R':
                alphaResult = "People with the starting letter R in their name are empathic in nature and feel the pain of others. It is hard for them to see someone in pain and are always ready to help with everything they have. Their warm heart and inner strength are recognized by others which drives them to success. Things that can be drawbacks for them are their impatient nature and the fact that they lose their temper quite easily. Working on them will help them get all success, according to name numerology.";
                break;
            case 'S':
                alphaResult = "People with the starting letter S in their names are very attractive and good-looking and catch the attention of everyone wherever they go. They have kind and warm personalities which make them very desirable but they feel emotions at an extreme level, which leads them to have mood swings quite often. While making an important decision, they tend to get overwhelmed and make the decision in haste, which usually backfires on them. They should work on their endurance and try to meditate to calm their nerves.";
                break;
            case 'T':
                alphaResult = "These people love to have adventures and are enthusiastic to try different things. They try new things all the time and use them to have various perspectives on life. They care a lot about things that are dear to them and are emotions in nature. These people tend to get hurt quite easily as they are sensitive and care what others have to say about them. These people, as per the numerology of the alphabet have a protective tendency and will not let anything hurt their loved ones. They also tend to get a bit aggressive when in a relationship.";
                break;
            case 'U':
                alphaResult = "Fortune is always with these people as they attract good luck like ants to sugar. They are simply present at the right time in the right place which gets their job done easily. Even if they have strong intuition and are creative, it is hard for them to comprehend difficult situations sometimes. People with the letter U can also get quite lazy when it comes to hard work and have commitment issues. Although they are lucky when it comes to earning money, they also are prone to wasting the same for unnecessary reasons. They can also be a little selfish in certain circumstances.";
                break;
            case 'V':
                alphaResult = "People whose name starts with V have an active intuition and can sense things before they happen. These people are highly respected in society because of their wisdom and way of living. As they have a creative way of thinking, everything they do stands out and becomes an inspiration to others. They have ideas and thoughts that will give them a lot of success and fame if they set them in motion. What makes them different from the rest is their personality which is humble and helpful. Even if they are better than others in various fields, they will not gloat about them. Although they can be the possessive type when in a relationship.";
                break;
            case 'W':
                alphaResult = "These people know their goal and will work relentlessly towards it. They will use their creative ideas to help them achieve their dreams. They do not like to idle and waste time and can also multitask when needed. Working in tough situations is not very hard for them as they are used to doing everything themselves without the help of others. Their communication skills are also very good because of which people like to be around them at all times. Meeting new people and gaining experience is something they love to do because it broadens their horizons.";
                break;
            case 'X':
                alphaResult = "People whose name starts with X are specifically passionate about nature and their creativity gives them a place wherever they go. They are very open about their choices and are ready to try everything without judgment. Their different perspectives will open new doors and opportunities in the field of careers. Quick-witted in nature, they very easily grasp new information which makes achieving success easy for them. They are also believed to be sensual beings and will indulge in carnal activities quite often.";
                break;
            case 'Y':
                alphaResult = "These people love their freedom and want to experience everything without any limitations. They like exploring new ideas and want to pave their own path. They do not appreciate it when someone tries to restrict their way of thinking as they want to learn about things without judgment. Because of this, they might indulge in questionable things which others may think twice before trying. As they are brave and self-dependent, they express themselves better than anyone and become noticeable even in a crowd. They have a very good fashion sense and carry themselves quite nicely.";
                break;
            case 'Z':
                alphaResult = "A very unique letter for a name, those who have it is the confident and energetic type. Mediocre results are not worth their attention and strive to do things with excellence. Hardworking and dedicated, they will get things done without any sweating, but they expect the same from everyone around them, which tends to disappoint them in some instances. Their intuition is strong and is always aware of their surroundings. Along with being spontaneous and enthusiastic, they also carry a loving and kind heart and are always ready to be of service. Physically, they are strong and active and can do outdoor work very easily.";
                break;
        }

        //Finding the week day
        String xDay = "";
        String xMonth = "";
        String xYear = "";

        for(int j=0; j<4; j++){
            xYear = xYear + arrayDate[j];
           }
        for(int x=4; x<6; x++){
               xMonth = xMonth + arrayDate[x];
           }
        for(int y=6; y<=7; y++){
               xDay = xDay + arrayDate[y];
           }

        int zYear = Integer.parseInt(String.valueOf(xYear));
        int zMonth = Integer.parseInt(String.valueOf(xMonth)) - 1;
        int zDay = Integer.parseInt(String.valueOf(xDay)) - 1;

        //Creating an object date
        Date xDate = new Date(zYear, zMonth, zDay);
        //creating an object calendar and defining its date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(xDate);

        //Having the day of week
        int xWeekDay = calendar.get(Calendar.DAY_OF_WEEK);

        //associating the day of week number with your name
        String[] weekDay = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sathurday"};
        String zWeekDay = weekDay[xWeekDay - 1];

        String weekResult = "";

        //switch case to display the result based on day of week
        switch(xWeekDay) {
            case 1:
                weekResult = "Ruled by the Sun, Sunday is the first day of the week. People born on Sunday are the luckiest ducks in town not just because itâ€™s Sunday on Sunday but also because the Sun, as the King of all planets, has a great influence on such people. The Sun allows these people an aura and magnetic power like its own. This helps them connect well with their surroundings. For the unaware, the Sun visits the same spot that it occupied at the moment of your birth in one-year intervals. This is a sign of consistency. And consistency helps a person enhance the quality of leadership. Talking about leadership, these people, are free-spirited, like contributing their ideas instead of just nodding to what their senior says. Despite being introverted, Sunday-born people are fun to be around. However, they sometimes can be very self-centered, doubting, authoritative, and insecure too. Also, they don't like to be ignored. And if you do ignore them, they would not mind cutting you off from their life doesn't matter how much you matter to them. For them, self-respect is the highest form of respect.";
                break;
            case 2:
                weekResult = "Monday is the day of the Moon. And in astrology, Moon is rooted in a dedication to human emotions, comfort zone, maternal side, and how they express their feelings and vulnerability. It is one of the most important planets to consider when trying to use the zodiac as a tool for self-discovery. Like the moon entail the sheer power to influence tides on Earth, similarly, the Moon is said to influence the mood of the people born on Monday, making them emotional and prone to mood swings. They love being at home, fancy a feeling of shelter and consistency, and have a natural appetite for carving out their territory in the world. The emotional characteristics of the Moon can also make the people born on Monday a bit sensitive and unwelcoming towards emotional change. Such people like to be consistent with their feelings and are happiest when things are going as they have planned. People born on Monday in love are highly caring individuals and in careers are highly oriented with clear goals.";
                break;
            case 3:
                weekResult = "Tuesday is ruled by the warrior planet Mars. It is the nearest planet to Earth. The planet smears its energetic influence on people, and the people born on Tuesday thus have within themselves the uncrumpling desire to lead. Such people incline themselves toward change and are not scared to explore unfamiliar areas. However, Tuesday-born people could be materialistic. The trait, however, is not harmful until the glimmer of materialism doesn't begin to influence their decisions in life. On the downside, people born on Tuesday donâ€™t tend to think before speaking. They also have a tough time taking criticism. They get very competitive if you try to scrutinize them. This could often result in unwanted situations, especially arguments. However, the fact that Tuesday-born people entail within themselves a powerhouse of energy, they could simply undo things by arranging a special date.";
                break;
            case 4:
                weekResult = "Wednesday is ruled by the planet Mercury. It is the planet for finance travel and communication. While the trait makes them good with words, giving them the capability to talk you down into things, these people are also said to be very careless. Also, as many as three times a year, Mercury Retrograde can throw enough chaos into the lives of people born on Wednesday. However, instead of getting scared by it, their expertise in improvising helps them deal with a situation like a pro. Also, Wednesday-born people are very logical in approach and love to travel, especially with their loved ones. Talking about loved ones, people born on Wednesday in love don't tend to have a long list of demands from their partner. They are easy-going, however, could struggle at making a relationship work owing to their careless nature. Also, their tendency to keep mum when they witness emotional turmoil shrinks the possibility of emotional attachment.";
                break;
            case 5:
                weekResult = "In a week, Thursday is the day of Lord Vishnu and also represents the planet Jupiter. The planet Jupiter is said to be the most auspicious planet in astrology. It is said to bring growth, positivity, and optimism in an individuals' life when poised positively in ones' Kundli. People born on Thursday are blessed with bigger things in life. They are good at giving advice (Like Lord Vishnu, who used to advise Gods) and are said to be one of the most mature people out there. Moreover, Thursday-born people are family-oriented. If you tend to do ten things to keep your family happy, a Thursday-born will do 20. Such is their attachment to their family; with their partner being no exception. A Thursday born in love is very passionate. However, their tendency to get bored easily might need the other person in the relationship to try to spice up things. The straightforward attitude of a Thursday born could be irritating but again, the advice they have to share is very factual and human-friendly.";
                break;
            case 6:
                weekResult = "Friday is the mushiest planet in the Zodiac because hello, it got the Venus vibes. Venus as a planet not only rules over Friday but also romance, art, beauty, pleasures, and luxuries. Simply say, Venus is in the Deepika Padukone of planets. People born on Friday are said to be a tad bit materialistic, and a bit lazy (not when it comes to sex) yet still make great lovers. A Friday born tends to attract anyone around them. And when they can\'t, they usually get so jealous of them that they begin competing with them. In a nutshell, they have an ego problem. People born on Friday are great at jobs that require creativity. They can brew ideas instantly and go into things with a perfectionist mindset. However, on the dark side, Friday-borns are usually dependent on others for maybe ideas and even emotional composure. They get involved in a relationship with all their heart. Simply said be it either life or romance, they cherish harmony and prefer not to ruffle any feathers.";
                break;
            case 7:
                weekResult = "Lastly, the ruler of Saturday is Saturn. It is the planet of limitations. Saturn is the last planet visible in the sky to the naked eye from Earth. People born on Saturday are said to be determined and kind. They tend to be very mature and responsible for their duty. People born on Saturday are very studious, wise, and practical making them good with business. A Saturn can also get very speedy with things, which is a bummer for many in their vicinity. Moreover, people born on Saturday are also shy kind. Hence they often face difficulty to find and interacting with the opposite gender. With other humans around, they are very selective and could be crushing over a person but won't make a move. At things that don't involve the words L-O-V-E, their confidence can outshine others. Saturday-born people are typical individualists and prefer to be alone but have great organizational skills.";
                break;

        }

        //Displaying the results
        welcomeText.setText("Hi " + zName + "!" + "\nYou was born on " + xYear + "\n\nYour lucky number is " + luckyNum + "\n\n" + friends + "\n" + neutral + "\n" + enemy + "\n\n" + comment + "\n\nResults based on " + luckyLetter + " : " + alphaResult + "\n\nResults based on day of week: " + zWeekDay + "\n" + weekResult);

    }



}