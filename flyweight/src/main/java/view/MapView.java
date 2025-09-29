package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.TileGraphicFactory;
import model.map.CityMap;
import model.map.Map;
import model.map.WildernessMap;
import model.tiles.Tile;


public class MapView extends Application {

    private final GridPane grid;
    TileGraphicFactory factory = new TileGraphicFactory();

    public MapView() {
        this.grid = new GridPane();
    }

    @Override
    public void start(Stage stage) {
        // Create models
        Map cityMap = new WildernessMap(factory);
        render(cityMap);

        Scene scene = new Scene(grid, 32 * cityMap.getWidth(), 32 * cityMap.getHeight());
        stage.setTitle("RPG Map Viewer");
        stage.setScene(scene);
        stage.show();
    }

    public void render(Map map) {
        grid.getChildren().clear();

        for (int row = 0; row < map.getHeight(); row++) {
            for (int col = 0; col < map.getWidth(); col++) {
                Tile tile = map.getTile(row, col);
                ImageView imageView = new ImageView(tile.getGraphics().getImage());
                System.out.println(tile.getGraphics().getImage());
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                grid.add(imageView, col, row);
            }
        }
    }
}
