package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static Random random = new Random();
    public static String question = "Find the greatest common divisor of given numbers.";
    public static void startGame() {
        String[][] rounds = new String[3][2];
        int number1;
        int number2;
        for (int i = 0; i < 3; i++) {
            number1 = random.nextInt(1, 101);
            number2 = random.nextInt(1, 101);
            rounds[i][0] = number1 + " " + number2;
            while (number2 != 0) {
                int r = number1 % number2;
                number1 = number2;
                number2 = r;
            }
            rounds[i][1] = String.valueOf(number1);
        }
        Engine engine = new Engine();
        engine.runGame(question, rounds);
    }
}
