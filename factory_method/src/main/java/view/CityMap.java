package view;

import tiles.*;

public class CityMap extends Map {

    @Override
    public Tile createTile(int randomNum) {
        return switch (randomNum) {
            case 1 -> new BuildingTile();
            case 2 -> new RoadTile();
            case 3 -> new ForestTile();
            default -> new RoadTile();
        };
    }


}
