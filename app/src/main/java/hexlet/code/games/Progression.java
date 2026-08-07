package hexlet.code.games;

import hexlet.code.Game;

import java.util.Arrays;
import java.util.Scanner;

import  java.util.Random;

public class Progression implements Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public boolean playRound() {
        System.out.println("What number is missing in the progression?"); //NO SONAR
        int indexCount = random.nextInt(3, 11);
        int start = random.nextInt(1, 101);
        int step = random.nextInt(1, 11);
        String[] progression = new String[indexCount];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        int correctIndex = random.nextInt(progression.length);
        String correctAnswer = progression[correctIndex];
        progression[correctIndex] = "..";
        System.out.println("Question " + Arrays.toString(progression));
        String userAnswer = scanner.nextLine().trim().toLowerCase();
        System.out.println("Your answer " + userAnswer);
        if (!userAnswer.equals(correctAnswer)) {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
        return true;
    }
}
