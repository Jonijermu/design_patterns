package model.map;

import model.TileGraphicFactory;
import model.tiles.BuildingTile;
import model.tiles.ForestTile;
import model.tiles.RoadTile;
import model.tiles.Tile;

public class CityMap extends Map {

    public CityMap(TileGraphicFactory factory) {
        super(factory);

    }

    @Override
    public Tile createTile(int randomNum) {
        return switch (randomNum) {
            case 1 -> new BuildingTile(factory);
            case 2 -> new RoadTile(factory);
            case 3 -> new ForestTile(factory);
            default -> new RoadTile(factory);
        };
    }
}
