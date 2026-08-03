package hexlet.code;

import  java.util.Random;

import  java.util.Scanner;

public class Even {
    @SuppressWarnings("java:s106")
    static Random random = new Random();
    public static void checkingParity() {
        System.out.println("Welcome to the Brain Games!\nMay i have your name?");
        Scanner enterName = new Scanner(System.in);
        String name = enterName.nextLine();
        System.out.println("Hello, " + name + "!\nAnswer 'yes' if the number is even, otherwise answer 'no'");
        Scanner scanner = new Scanner(System.in);
        boolean isWin = true;
        int count = 0;
        while (count < 3) {
            int number = random.nextInt(1, 101);
            System.out.println("Question: " + number);
            String answer = scanner.nextLine().trim().toLowerCase();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                count++;
            } else if (number % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'\nLet's try again, " + name);
                isWin = false;
                break;
            } else if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer wan 'no'\nLet's try again, " + name);
                isWin = false;
                break;
            } else if (number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answer + " is wrong answer, try again");
                isWin = false;
                break;
            }
        }
        if (isWin) {
            System.out.println("Congratulations, " + name);
        }
    }
}
