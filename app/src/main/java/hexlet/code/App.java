package hexlet.code;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("2 - Even\n1 - Greet\n0 - Exit");
        Scanner chooseGame = new Scanner(System.in);
        int game = chooseGame.nextInt();
        System.out.println("Your choice " + game);
        switch (game) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.checkingParity();
                break;
            default:
                System.out.println("Unknown game");
        }

    }

}
