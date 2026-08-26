package hexlet.code;

import java.util.Scanner;

public class Engine {
    Scanner scanner = new Scanner(System.in);
    public void runGame(String question, String[][] rounds) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?"); //NO SONAR
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!"); //NO SONAR
        System.out.println(question);
        String currentQuestion;
        String correctAnswer;
        String userAnswer;
        for (int i = 0; i < rounds.length; i++) {
            currentQuestion = rounds[i][0];
            System.out.println("Question: " + currentQuestion); //NOSONAR
            correctAnswer = rounds[i][1];
            userAnswer = scanner.nextLine().trim().toLowerCase();
            System.out.println("Your answer: " + userAnswer); //NOSONAR
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer //NOSONAR
                        + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'."); //NOSONAR
                System.out.println("Let's try again, " + name + "!"); //NOSONAR
                return;
            }
            System.out.println("Correct!"); //NOSONAR
        }
        System.out.println("Congratulations, " + name + "!"); //NOSONAR
    }
}
