import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Character character= new Character("John");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Character Stats ---");
            System.out.println(character.showStats());
            System.out.print("Choose an action: ");

            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "train":
                    character.state.train(character);
                    break;
                case "meditate":
                    character.state.meditate(character);
                    break;
                case "fight":
                    character.state.fight(character);
                    break;
                case "exit":
                    System.out.println("Exiting game...");
                    return;
                default:
                    System.out.println("Invalid action!");
            }

            if (character.state instanceof MasterState) {
                System.out.println("Congratulations! You have reached the Master level. Game Over!");
                System.out.println("\n--- Final Character Stats ---");
                System.out.println(character.showStats());
                break;
            }
        }
    }
}
