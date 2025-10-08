package model;


import javafx.scene.layout.Pane;

public class MoveCursorRightCommand implements Command{
    @Override
    public void execute(Pane[][] cells, CursorPosition cursor) {
        int GRID_SIZE = cells.length;
        Pane oldCell = cells[cursor.row][cursor.col];
        oldCell.getStyleClass().remove("highlightedCell");
        cursor.col = Math.min(GRID_SIZE - 1, cursor.col + 1);
        Pane newCell = cells[cursor.row][cursor.col];
        newCell.getStyleClass().add("highlightedCell");
        System.out.println("Moving Right");

    }
}
