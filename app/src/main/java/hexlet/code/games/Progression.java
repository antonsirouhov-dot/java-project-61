package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;

public class Progression {
    static Random random = new Random();
    public static String question = "What number is missing in the progression?";
    public static void startGame() {
        String[][] rounds = new String[3][2];
        int indexCount;
        int start;
        int step;
        for (int j = 0; j < 3; j++) {
            indexCount = random.nextInt(5, 11);
            start = random.nextInt(1, 101);
            step = random.nextInt(1, 11);
            String[] progression = new String[indexCount];
            for (int i = 0; i < progression.length; i++) {
                progression[i] = String.valueOf(start + i * step);
            }
            int correctIndex = random.nextInt(progression.length);
            rounds[j][1] = progression[correctIndex];
            progression[correctIndex] = "..";
            rounds[j][0] = String.join(" ", progression);
        }
        Engine engine = new Engine();
        engine.runGame(question, rounds);
    }
}
