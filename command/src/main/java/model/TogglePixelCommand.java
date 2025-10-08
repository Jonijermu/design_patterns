package model;

import javafx.scene.layout.Pane;

public class TogglePixelCommand implements Command{
    @Override
    public void execute(Pane[][] cells, CursorPosition cursor) {
        Pane cell = cells[cursor.row][cursor.col];
        if (cell.getStyleClass().contains("toggle")) {
            cell.getStyleClass().remove("toggle");
        } else {
            cell.getStyleClass().add("toggle");
        }
        System.out.println("Toggled cell at: " + cursor.row + ", " + cursor.col);
    }
}
