package model.tiles;

import model.TileGraphicFactory;
import model.TileImage;

public class ForestTile implements Tile {

    TileImage image;

    public ForestTile(TileGraphicFactory factory) {
        this.image = factory.getTileImage("forest", "img/taiga.png");
    }

    TileImage images;

    @Override
    public void action() {
        System.out.println("You entered a Road.");
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDescription() {
        return "Forest Tile";
    }

    @Override
    public TileImage getGraphics() {
        return image;
    }

}

