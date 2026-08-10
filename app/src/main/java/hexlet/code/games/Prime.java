package hexlet.code.games;

import hexlet.code.Game;
import java.util.Scanner;
import java.util.Random;

public class Prime implements Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public boolean playRound() {
        System.out.println("Answer 'yes' if given nubmer is prime. Otherwise answer 'no'.");
        int number = random.nextInt(1, 101);
        System.out.println("Question: " + number);
        String correctAnswer = "yes";
        if (number <= 1) {
            correctAnswer = "no";
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                break;
            }
        }
        String userAnswer = scanner.nextLine().trim().toLowerCase();
        System.out.println("Your answer: " + userAnswer);
        if (!userAnswer.equals(correctAnswer)) {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        } else {
            return true;
        }
    }
}
