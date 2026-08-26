package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?"); //NO SONAR
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!"); //NO SONAR
    }
}
