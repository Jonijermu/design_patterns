package model;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {

    Map<String, TileImage> images = new HashMap<>();

    public TileGraphicFactory() {}

    public TileImage getTileImage(String type, String imagePath) {
        if (!images.containsKey(type)) {
            images.put(type, new TileImage(imagePath));
        }
        return images.get(type);
    }
}
