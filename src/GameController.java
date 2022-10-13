// The key action for the game.
// We start to write the welcome message
// Another message that save the option that made by the user is not return anything because we used to
// Write another massage that make the machine to run randomly.
// Write the other message that said who win
// Write the last massage that return the scores.

import java.util.Random;

public class GameController {
    private GameOption userChoice=GameOption.EMPTY;
    private GameOption machineChoice=GameOption.EMPTY;
    private Score totalScore= new Score();
    String welcomMessage(){
        return  "      Welcome to                 \n" +
                "   Rock Paper Scissor Game      \n" +
                "                                 \n";}
    String pleasEnterOptionMessage(){
        return "   Pleas enter       \n" +
                "   1-Rock            \n" +
                "   2-Paper           \n" +
                "   3-Scissor         \n" +
                "                     \n";
    }
    void selectUserChoice(GameOption option){
        this.userChoice=option;
    }
    GameOption  pickRandomlyMachineChoice(){
        int randomNumberBetween1and3 =new Random().nextInt(3)+1;
        GameOption machineOption=GameOption.valueof(randomNumberBetween1and3);
        this.machineChoice=machineOption;
        return machineOption;
    }
    Player calculateResults(){
        totalScore.incrementTotal();
        if(machineChoice==userChoice) {

            return Player.TIE;
        }
        if(machineChoice.winBy==userChoice.winBy){
            return Player.USER;
        }
        return Player.MACHINE;
    }
    Score getResults(){
        return totalScore;
    }
}
