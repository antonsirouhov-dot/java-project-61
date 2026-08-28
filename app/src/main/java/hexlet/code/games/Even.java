package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    static Random random = new Random();
    public static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int number;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            number = random.nextInt(1, 101);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(question, rounds);
    }
}
