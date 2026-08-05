package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter"); //NO SONAR
        System.out.println("5 - Progression\n4 - GCD\n3 - Calc\n2 - Even\n1 - Greet\n0 - Exit"); //NO SONAR
        Scanner chooseGame = new Scanner(System.in);
        int game = chooseGame.nextInt();
        System.out.println("Your choice " + game); //NO SONAR
        Game games;
        switch (game) {
            case 0:
                System.out.println("Exit"); //NO SONAR
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
            case 4:
                String name4 = Cli.greetUser();
                games = new GCD();
                Engine.runGame(name4, new GCD());
                break;
            case 5:
                String name5 = Cli.greetUser();
                games = new Progression();
                Engine.runGame(name5, new Progression());
                break;
            default:
                System.out.println("Unknown game"); //NO SONAR
        }

    }

}
