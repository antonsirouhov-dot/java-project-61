package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    static Random random = new Random();
    public static String question = "What is the result of the expression?";
    public static void startGame() {
        char[] operators = {'+', '-', '*'};
        String[][] rounds = new String[Engine.ROUNDS][2];
        int number1;
        int number2;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            number1 = random.nextInt(1, 101);
            number2 = random.nextInt(1, 101);
            char operator = operators[random.nextInt(operators.length)];
            rounds[i][0] = number1 + " " + operator + " " + number2; //NO SONAR
            switch (operator) {
                case '+':
                    rounds[i][1] = String.valueOf(number1 + number2);
                    break;
                case '-':
                    rounds[i][1] = String.valueOf(number1 - number2);
                    break;
                case '*':
                    rounds[i][1] = String.valueOf(number1 * number2);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
        Engine.runGame(question, rounds);
    }
}

