package model.tiles;

import model.TileGraphicFactory;
import model.TileImage;

public class RoadTile implements Tile {

    TileImage image;

    public RoadTile(TileGraphicFactory factory) {
        this.image = factory.getTileImage("road" ,"img/ground_asphalt_synth_11.png");
    }

    @Override
    public void action() {
        System.out.println("You entered a building.");
    }

    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDescription() {
        return "Road Tile";
    }

    @Override
    public TileImage getGraphics() {
        return image;
    }




}
