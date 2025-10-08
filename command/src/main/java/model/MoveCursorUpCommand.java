package model;


import javafx.scene.layout.Pane;

public class MoveCursorUpCommand implements Command{
    @Override
    public void execute(Pane[][] cells, CursorPosition cursor) {
        Pane oldCell = cells[cursor.row][cursor.col];
        oldCell.getStyleClass().remove("highlightedCell");
        cursor.row = Math.max(0, cursor.row - 1);
        Pane newCell = cells[cursor.row][cursor.col];
        newCell.getStyleClass().add("highlightedCell");
        System.out.println("MOVING UP");

    }
}
