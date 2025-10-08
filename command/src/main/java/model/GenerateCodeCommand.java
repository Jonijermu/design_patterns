package model;

import javafx.scene.layout.Pane;

public class GenerateCodeCommand implements Command {
    @Override
    public void execute(Pane[][] cells, CursorPosition cursor) {
        int gridSize = cells.length;
        System.out.println("           pixelArt");
        for (int row = 0; row < gridSize; row++) {
            System.out.print("    {");
            for (int col = 0; col < gridSize; col++) {
                Pane cell = cells[row][col];
                int value = cell.getStyleClass().contains("toggle") ? 1 : 0;
                System.out.print(value);
                if (col < gridSize - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (row < gridSize - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }


}
}



