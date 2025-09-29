package model.tiles;

import model.TileGraphicFactory;
import model.TileImage;

public class BuildingTile implements Tile {

    TileImage image;

    public BuildingTile(TileGraphicFactory factory) {
        this.image = factory.getTileImage("building" , "img/map_tile_city.png");
    }

    @Override
    public void action() {
        System.out.println("You entered a building.");
    }

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDescription() {
        return "Building Tile";
    }

    @Override
    public TileImage getGraphics() {
        return image;
    }
}
