public class Score {
    private int totalNumberGames;

    public void incrementTotal() {
        ++totalNumberGames;
    }

    // Computer / Machine
    private int machineTotalNumberGames;

    private int gamesWonByMachine;

    public void machineIncrementTotal() {
        ++machineTotalNumberGames;
    }

    // Player / User
    private int gamesWonByUser;

    public void incrementGameWonByUser() {

        gamesWonByUser++;
    }

    public int gameWonByUser() {
        return gamesWonByUser;
    }

    public int getTotalNumberGames() {
        return totalNumberGames;
    }

    public int getGamesWonByUser() {
        return gamesWonByUser;
    }

    // Computer / Machine
    public void incrementGameWonByMachine() {

        gamesWonByMachine++;
    }

    public int gameWonByMachine() {
        return gamesWonByMachine;
    }

    public int getGamesWonByMachine() {
        return gamesWonByMachine;
    }
}
