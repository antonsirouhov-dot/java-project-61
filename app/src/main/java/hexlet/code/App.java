package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter"); //NO SONAR
        System.out.println("6 - Prime\n5 - Progression\n4 - GCD\n3 - Calc\n2 - Even\n1 - Greet\n0 - Exit"); //NO SONAR
        System.out.println("Your choise:");
        Scanner chooseGame = new Scanner(System.in);
        int game = chooseGame.nextInt();
        switch (game) {
            case 0:
                System.out.println("Exit"); //NO SONAR
                break;
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                GCD.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.startGame();
                break;
            default:
                System.out.println("Unknown game"); //NO SONAR
        }

    }

}
