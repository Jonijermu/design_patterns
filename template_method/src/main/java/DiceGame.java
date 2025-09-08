import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DiceGame extends Game {
    Scanner scanner = new Scanner(System.in);
    int[] playerScores;
    int numberOfPlayers;
    Random random = new Random();
    int winningScore = 20;
    int winner = -1;

    public DiceGame() {

    }

    @Override
    public void initializeGame(int numberOfPlayers) {
        if (numberOfPlayers < 1 || numberOfPlayers > 4) {
            System.out.println("Number of players must be between 1 and 4. Setting to 2 by default.");
            numberOfPlayers = 2;
        }
        this.numberOfPlayers = numberOfPlayers;
        playerScores = new int[numberOfPlayers];
        System.out.println("Dice Game started with " + numberOfPlayers + " players!");


    }

    @Override
    public boolean endOfGame() {
        for (int i = 0; i < numberOfPlayers; i++) {
            if (playerScores[i] >= winningScore) {
                winner = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + (player + 1) + "'s turn. Press Enter to roll the dice...");
        scanner.nextLine();
        int diceRoll = random.nextInt(6) + 1; // 1-6
        playerScores[player] += diceRoll;
        System.out.println("Player " + (player + 1) + " rolls a " + diceRoll +
                ". Total score: " + playerScores[player]);


    }

    @Override
    public void displayWinner() {
        System.out.println("Player " + (winner + 1) + " wins with " + playerScores[winner] + " points!");

    }

}
