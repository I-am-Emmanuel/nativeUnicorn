import tddClass.Question;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PersonalityTest {

    public static void main(String[] args) {
        System.out.println("=========================Welcome for your personality Test============================");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        System.out.println("First Name & Last Name");
        input.next(); input.next();
        System.out.println("Age");
        input.next();
        System.out.println("Email Address");
        input.next();
        System.out.println("Test Date and Time");
        System.out.println(dtf.format(now));
        System.out.println("===================================================================================================================================================================================================================================================================================================");
        System.out.println("Preparing your Assessment\nInstructions\nRead the Questions carefully to select either A or B from the options as applied to you.\nNOTE: ALL INPUTS SHOULD BE IN UPPERCASE LETTERS ONLY\nGOOD LUCK!!!\n====================================================================================================================================================");
        String q1 = "Question 1\n(A)Expend energy, enjoy groups\n(B)Conserve energy, enjoy one-on-one";
        String q2 = "Question 2\n(A)Interpret literally\n(B)Look for meaning and possibilities";
        String q3 = "Question 3\n(A)Logical, thinking, questioning\n(B)Empathetic, feeling, accommodating";
        String q4 = "Question 4\n(A)Organized, orderly\n(B)Flexible, adaptable";
        String q5 = "Question 5\n(A)More outgoing, think out loud\n(B)More reserved, think to yourself";
        String q6 = "Question 6\n(A)Practical, realistic, experimental\n(B)Imaginative, innovative, theoretical";
        String q7 = "Question 7\n(A)Candid, straight forward, frank\n(B)Tactful, kind, encouraging";
        String q8 = "Question 8\n(A)Plan, schedule\n(B)Unplanned, spontaneous";
        String q9 = "Question 9\n(A)Seek many tasks, public activities, interaction with others\n(B)Seek private, solidarity activities with quiet to concentrate";
        String q10 = "Question 10\n(A)Standard, usual, conventional\n(B)Different, novel, unique";
        String q11 = "Question 11\n(A)Firm, tend to criticize, hold the line\n(B)Gentle, tend to appreciate, conciliate";
        String q12 = "Question 12\n(A)Regulated, structured\n(B)Easygoing, 'live' and 'let live' ";
        String q13 = "Question 13\n(A)External, communicative, express yourself\n(B)Internal, reticent, keep to yourself";
        String q14 = "Question 14\n(A)Focus on here-and-now\n(B)Look to the future, global perspective, 'big picture'";
        String q15 = "Question 15\n(A)Though-minded, just\n(B)Tender-heated, merciful";
        String q16 = "Question 16\n(A)Preparation, plan ahead\n(B)Go with the flow, adapt as you go";
        String q17 = "Question 17\n(A)Active, initiate\n(B)Reflective, deliberate";
        String q18 = "Question 18\n(A)Facts, things, 'what is'\n(B)Ideas, dreams, 'what could be,' philosophical";
        String q19 = "Question 19\n(A)Matter of fact, issue-oriented\n(B)Sensitive, people-oriented, compassionate";
        String q20 = "Question 20\n(A)Control, govern\n(B)Latitude, freedom";

        Question[] questions = {
                new Question(q1, "A", "B"),
                new Question(q2, "A", "B"),
                new Question(q3, "A", "B"),
                new Question(q4, "A", "B"),
                new Question(q5, "A", "B"),
                new Question(q6, "A", "B"),
                new Question(q7, "A", "B"),
                new Question(q8, "A", "B"),
                new Question(q9, "A", "B"),
                new Question(q10, "A", "B"),
                new Question(q11, "A", "B"),
                new Question(q12, "A", "B"),
                new Question(q13, "A", "B"),
                new Question(q14, "A", "B"),
                new Question(q15, "A", "B"),
                new Question(q16, "A", "B"),
                new Question(q17, "A", "B"),
                new Question(q18, "A", "B"),
                new Question(q19, "A", "B"),
                new Question(q20, "A", "B")
        };
        takeTest(questions);
    }
    public static void takeTest(Question[] questions) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        for (int counter = 0; counter < questions.length; counter++) {
            System.out.println(questions[counter].prompt);
            String answer = (input.nextLine() + ("A || B"));
            if (answer.equals(questions[counter].answerA)) {
                score++;
            }
        }
        if (score > 10) {
            System.out.println("====================================================================================================\nCongratulations!!!\nYou are an 'Extrovert'.");
        } else
            if (score < 10) {
            System.out.println("=====================================================================================================\nCongratulations!!!\nYou are an 'Introvert'.");
        } else
            if (score == 10) {
            System.out.println("=====================================================================================================\nCongratulations!!!\nYou are an 'Ambivert'");
        }
    }
}




