package model.map;


import model.TileGraphicFactory;
import model.tiles.Tile;

public abstract class Map {

    private final int width = 10;
    private final int height = 10;
    private Tile[][] tiles = new Tile[height][width];
    TileGraphicFactory factory;

    public Map(TileGraphicFactory factory) {
        this.factory = factory;
        generateMap();
    }

    public abstract Tile createTile(int randomNum);


    public void generateMap() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int randomNum = 1 + (int) (Math.random() * 5);
                tiles[row][col] = createTile(randomNum);
            }
        }
    }

    public Tile getTile(int row, int col) {
        return tiles[row][col];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
