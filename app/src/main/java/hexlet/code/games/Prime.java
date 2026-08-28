package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static Random random = new Random();
    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startGame() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int number;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            number = random.nextInt(1, 101);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.runGame(question, rounds);
    }
}
