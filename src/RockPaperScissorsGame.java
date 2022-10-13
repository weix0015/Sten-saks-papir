import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        String userWantToExit;
        System.out.println(gameController.welcomMessage());

        // The while loop will continue until user choose to stop the game.
        do {
            System.out.println(gameController.pleasEnterOptionMessage());
            int userOptionRaw = scanner.nextInt();
            GameOption userOption = GameOption.valueof(userOptionRaw);
            gameController.selectUserChoice(userOption);
            GameOption machineOption = gameController.pickRandomlyMachineChoice();
            Player winner = gameController.calculateResults();
            Score score = gameController.getResults();

            System.out.printf("You played : %s and the machine played %s \n", userOption.name(), machineOption.name());

            //if(Player.USER==winner) {System.out.println("You wine");}
            if (Player.TIE == winner) {
                System.out.println("Tie");
            }
            if (userOption.equals(GameOption.ROCK) && machineOption.equals(GameOption.PAPER)) {
                System.out.println("Computer vinder");
                score.incrementGameWonByMachine();
            } else if (userOption.equals(GameOption.PAPER) && machineOption.equals(GameOption.ROCK)) {
                System.out.println("Du vinder");
                score.incrementGameWonByUser();
            } else if (userOption.equals(GameOption.SICSSORS) && machineOption.equals(GameOption.ROCK)) {
                System.out.println("Computer vinder");
                score.incrementGameWonByMachine();
            } else if (userOption.equals(GameOption.ROCK) && machineOption.equals(GameOption.SICSSORS)) {
                System.out.println("Du vinder");
                score.incrementGameWonByUser();
            } else if (userOption.equals(GameOption.SICSSORS) && machineOption.equals(GameOption.PAPER)) {
                System.out.println("Du vinder");
                score.incrementGameWonByUser();
            } else if (userOption.equals(GameOption.PAPER) && machineOption.equals(GameOption.SICSSORS)) {
                System.out.println("Computer vinder");
                score.incrementGameWonByMachine();
            }

            System.out.printf("You won %d games out of %d \n", score.getGamesWonByUser(),
                    score.getTotalNumberGames());
            System.out.printf("Computer won %d games out of %d \n", score.getGamesWonByMachine(),
                    score.getTotalNumberGames());
            System.out.println("Continue playing (Y=Test, N=No)? ");
            userWantToExit = scanner.next();

        } while (userWantToExit.toUpperCase().equals("Y")); {
        }
    }
}
