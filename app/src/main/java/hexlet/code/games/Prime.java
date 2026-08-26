package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static Random random = new Random();
    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        String[][] rounds = new String[3][2];
        int number;
        for (int j = 0; j < 3; j++) {
            number = random.nextInt(1, 101);
            rounds[j][0] = String.valueOf(number);
            rounds[j][1] = "yes";
            if (number <= 1) {
                rounds[j][1] = "no";
            }
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    rounds[j][1] = "no";
                    break;
                }
            }
        }
        Engine engine = new Engine();
        engine.runGame(question, rounds);
    }
}
