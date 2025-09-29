package model.tiles;


import model.TileImage;

public interface Tile {

    void action();
    char getCharacter();
    String getDescription();
    TileImage getGraphics();

}
