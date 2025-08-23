package view;

import game.Game;
import tiles.Tile;

public abstract class Map extends Game {


    public Map() {

    }

    public abstract Tile createTile(int randomNum);


    public void display() {
        int row = 0;
        while (row < 10) {
            for (int i = 0; i < 11; i++) {
                int randomNum = 1 + (int) (Math.random() * 3);
                Tile tile = createTile(randomNum);
                System.out.print(" " + tile.getCharacter() + " ");
            }
            row += 1;
            System.out.println();

        }

    }
}

