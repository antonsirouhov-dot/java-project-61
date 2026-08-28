package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;

public class Progression {
    static Random random = new Random();
    public static String question = "What number is missing in the progression?";
    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
    public static void startGame() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int indexCount;
        int start;
        int step;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            indexCount = random.nextInt(5, 11);
            start = random.nextInt(1, 101);
            step = random.nextInt(1, 11);
            String[] progression = generateProgression(start, step, indexCount);
            int correctIndex = random.nextInt(progression.length);
            rounds[j][1] = progression[correctIndex];
            progression[correctIndex] = "..";
            rounds[j][0] = String.join(" ", progression);
        }
        Engine.runGame(question, rounds);
    }
}
