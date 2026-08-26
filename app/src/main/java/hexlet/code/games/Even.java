package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    static Random random = new Random();
    public static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        String[][] rounds = new String[3][2];
        int number;
        for (int i = 0; i < 3; i++) {
            number = random.nextInt(1, 101);
            rounds[i][0] = String.valueOf(number);
            if (number % 2 == 0) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        Engine engine = new Engine();
        engine.runGame(question, rounds);
    }
}
