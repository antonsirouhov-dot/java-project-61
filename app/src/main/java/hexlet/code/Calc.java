package hexlet.code;

import java.util.Scanner;

import java.util.Random;

public class Calc {
    static Random random = new Random();
    public static void runGameCalc() {
        System.out.println("welcome to the Brain Games!\nMay i have your name?"); //NOSONAR
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!\nWhat is the result of the expression?"); //NOSONAR
        char[] operators = {'+', '-', '*'};
        int count = 0;
        boolean isWin = true;
        while (count < 3) {
            int number1 = random.nextInt(1, 101);
            int nubmer2 = random.nextInt(1, 101);
            char operator = operators[random.nextInt(operators.length)];
            System.out.println("Question: " + number1 + " " + operator + " " + nubmer2); //NOSONAR
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
            if (answer.equals(String.valueOf(result))) {
                System.out.println("Correct!"); //NOSONAR
                count++;
            } else {
                isWin = false;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + name); //NOSONAR
                break;
            }
        }
        if (isWin) {
            System.out.println("Congratulations, " + name + "!"); //NOSONAR
        }
    }
}
