import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players (1-4): ");
        int numPlayers = scanner.nextInt();
        DiceGame game = new DiceGame();
        game.play(numPlayers);
    }
}
