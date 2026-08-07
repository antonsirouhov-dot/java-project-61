package hexlet.code;

public class Engine {
    public static void runGame(String name, Game game) {
        int count = 0;
        while (count < 3) {
            boolean result = game.playRound();
            if (!result) {
                System.out.println("Let's try again, " + name + "!"); //NO SONAR
                return;
            }
            count++;
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!"); //NO SONAR
    }
}
