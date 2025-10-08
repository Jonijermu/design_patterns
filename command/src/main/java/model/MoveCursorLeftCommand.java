package model;


import javafx.scene.layout.Pane;

public class MoveCursorLeftCommand implements Command{
    @Override
    public void execute(Pane[][] cells, CursorPosition cursor) {
        Pane oldCell = cells[cursor.row][cursor.col];
        oldCell.getStyleClass().remove("highlightedCell");
        cursor.col = Math.max(0, cursor.col - 1);
        Pane newCell = cells[cursor.row][cursor.col];
        newCell.getStyleClass().add("highlightedCell");
        System.out.println("MOVING LEFT");
    }
}
