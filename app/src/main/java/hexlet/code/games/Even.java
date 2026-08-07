package hexlet.code.games;

import hexlet.code.Game;

import  java.util.Random;

import  java.util.Scanner;

public class Even implements Game {
    static Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public boolean playRound() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'."); //NO SONAR
        int number = random.nextInt(1, 101);
        System.out.println("Question: " + number); //NOSONAR
        String answer = scanner.nextLine().trim().toLowerCase();
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        System.out.println("Your answer: " + answer); //NOSONAR
        if (!answer.equals((correctAnswer))) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
        return true;
    }
}
