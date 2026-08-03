package hexlet.code;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter"); //NOSONAR
        System.out.println("3 - Calc\n2 - Even\n1 - Greet\n0 - Exit"); //NOSONAR
        Scanner chooseGame = new Scanner(System.in);
        int game = chooseGame.nextInt();
        System.out.println("Your choice " + game); //NOSONAR
        switch (game) {
            case 0:
                System.out.println("Exit"); //NOSONAR
                break;
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.checkingParity();
                break;
            case 3:
                Calc.runGameCalc();
                break;
            default:
                System.out.println("Unknown game"); //NOSONAR
        }

    }

}
