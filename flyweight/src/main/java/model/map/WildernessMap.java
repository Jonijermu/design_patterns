package model.map;

import model.TileGraphicFactory;
import model.tiles.ForestTile;
import model.tiles.SwampTile;
import model.tiles.Tile;
import model.tiles.WaterTile;

public class WildernessMap extends Map {

    public WildernessMap(TileGraphicFactory factory) {
        super(factory);
    }
    @Override
    public Tile createTile(int randomNum) {
        return switch (randomNum) {
            case 1 -> new ForestTile(factory);
            case 2 -> new SwampTile(factory);
            case 3 -> new WaterTile(factory);
            default -> new SwampTile(factory);
        };
    }
}

