package model.tiles;

import model.TileGraphicFactory;
import model.TileImage;

public class SwampTile implements Tile {

    TileImage image;

    public SwampTile(TileGraphicFactory factory) {
        this.image = factory.getTileImage("swamp", "img/lilypad.png");
    }

    @Override
    public void action() {
        System.out.println("You entered a Swamp.");
    }

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDescription() {
        return "Swamp Tile";
    }

    @Override
    public TileImage getGraphics() {
        return image;
    }



}
