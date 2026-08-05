package hexlet.code.games;

import hexlet.code.Game;

import java.util.Scanner;

import java.util.Random;

public class Calc implements Game {
    static Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public boolean playRound() {
        System.out.println("What the result of the expression?"); //NO SONAR
        char[] operators = {'+', '-', '*'};
        int number1 = random.nextInt(1, 101);
        int nubmer2 = random.nextInt(1, 101);
        char operator = operators[random.nextInt(operators.length)];
        System.out.println("Question: " + number1 + " " + operator + " " + nubmer2); //NO SONAR
        int result;
        switch (operator) {
            case '+':
                result = number1 + nubmer2;
                break;
            case '-':
                result = number1 - nubmer2;
                break;
            case '*':
                result = number1 * nubmer2;
                break;
            default:
                throw new RuntimeException();
        }
        String answer = scanner.nextLine();
        System.out.println("Your answer: " + answer); //NOSONAR
        if (!answer.equals(String.valueOf(result))) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'"); //NO SONAR
            return false;
        } else {
            return true;
        }
    }
}

