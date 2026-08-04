package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter"); //NOSONAR
        System.out.println("3 - Calc\n2 - Even\n1 - Greet\n0 - Exit"); //NOSONAR
        Scanner chooseGame = new Scanner(System.in);
        int game = chooseGame.nextInt();
        System.out.println("Your choice " + game); //NOSONAR
        Game games;
        switch (game) {
            case 0:
                System.out.println("Exit"); //NOSONAR
                break;
            case 1:
                Cli.greetUser();
                break;
            case 2:
                String name2 = Cli.greetUser();
                games = new Even();
                Engine.runGame(name2, new Even());
                break;
            case 3:
                String name3 = Cli.greetUser();
                games = new Calc();
                Engine.runGame(name3, new Calc());
                break;
            default:
                System.out.println("Unknown game"); //NOSONAR
        }

    }

}
