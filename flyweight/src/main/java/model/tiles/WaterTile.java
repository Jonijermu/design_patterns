package model.tiles;

import model.TileGraphicFactory;
import model.TileImage;

public class WaterTile implements Tile {

    TileImage image;

    public WaterTile(TileGraphicFactory factory) {
        this.image = factory.getTileImage("water", "img/water.png");
    }

    @Override
    public void action() {
        System.out.println("You entered a Water.");
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDescription() {
        return "Water Tile";
    }

    @Override
    public TileImage getGraphics() {
        return image;
    }


}
