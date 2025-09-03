import java.util.ArrayList;
import java.util.List;

public class DiceGame extends Game {


    List<Integer> playerList = new ArrayList<>();

    public DiceGame() {

    }



    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Starting Dice Game");
        playerList.add(numberOfPlayers);

    }

    @Override
    public boolean endOfGame() {
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        for (Integer p : playerList) {
            System.out.println(p);
        }

    }

    @Override
    public void displayWinner() {

    }
}
