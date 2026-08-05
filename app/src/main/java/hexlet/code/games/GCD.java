package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

import java.util.Scanner;

public class GCD implements Game {
    Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public boolean playRound() {
        System.out.println("Find the greatest common divisor of given numbers."); //NO SONAR
        int number1 = random.nextInt(1, 101);
        int number2 = random.nextInt(1, 101);
        System.out.println("Question: " + number1 + " " + number2); //NO SONAR
        while (number2 != 0) {
            int r = number1 % number2;
            number1 = number2;
            number2 = r;
        }
        int correctanswer = number1;
        String answer = scanner.nextLine().trim();
        System.out.println("Your answer: " + answer);
        if (!answer.equals(String.valueOf(correctanswer))) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctanswer + "'.");
            return false;
        }
        return true;
    }
}
