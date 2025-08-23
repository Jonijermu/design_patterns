package view;

import tiles.*;

public class WildernessMap extends Map {

    @Override
    public Tile createTile(int randomNum) {
        return switch (randomNum) {
            case 1 -> new ForestTile();
            case 2 -> new SwampTile();
            case 3 -> new WaterTile();
            default -> new SwampTile();
        };
    }

}

