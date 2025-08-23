package game;

import view.*;

import java.util.Scanner;

public abstract class Game {


    public void createMap() {
        Scanner scanner = new Scanner(System.in);
        Map map = null;

        System.out.println("Choose a map:");
        System.out.println("1. City Map");
        System.out.println("2. Wilderness Map");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                map = new CityMap();
                break;
            case 2:
                map = new WildernessMap();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to City Map.");
                map = new CityMap();
        }
        map.display();
    }
}
