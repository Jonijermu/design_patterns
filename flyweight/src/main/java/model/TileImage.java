package model;

import javafx.scene.image.Image;

public class TileImage implements Flyweight {
    Image image;

    public TileImage(String imagePath) {
        this.image = new Image(imagePath);
    }

    @Override
    public Image getImage() {
        return image;
    }
}
