package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.*;

public class CommandController {
    Command moveCursorDown = new MoveCursorDownCommand();
    Command moveCursorUp = new MoveCursorUpCommand();
    Command moveCursorLeft = new MoveCursorLeftCommand();
    Command moveCursorRight = new MoveCursorRightCommand();
    Command generateCode = new GenerateCodeCommand();
    Command togglePixel = new TogglePixelCommand();
    private Pane highlightedCell;
    final int GRID_SIZE = 8;
    private final int CELL_SIZE = 37;
    Pane[][] cells = new Pane[GRID_SIZE][GRID_SIZE];
    CursorPosition cursor = new CursorPosition(0,0);

    public CommandController() {}

    public void setController() {
        fillPaneWithCells();
        highlightCell(cursor);
        pane.setFocusTraversable(true);
        pane.requestFocus();
    }

    @FXML
    private Pane pane;

    @FXML
    private Button createCodeButton;

    @FXML
    void createCode() {
        generateCode.execute(cells, cursor);
        pane.requestFocus();
    }

    public void fillPaneWithCells() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                Pane cell = new Pane();
                cell.setPrefSize(CELL_SIZE, CELL_SIZE);
                cell.setLayoutX(col * CELL_SIZE);
                cell.setLayoutY(row * CELL_SIZE);
                cell.getStyleClass().add("cell");
                pane.getChildren().add(cell);
                cells[row][col] = cell;
            }
        }
    }

    private void highlightCell(CursorPosition cursor) {
        if (highlightedCell != null) {
            highlightedCell.getStyleClass().remove("highlightedCell");
        }

        highlightedCell = cells[cursor.row][cursor.col];
        highlightedCell.getStyleClass().add("highlightedCell");
    }


    public void handleMovement(KeyEvent e) {
        KeyCode key = e.getCode();
        switch (key) {
            case W:
                moveCursorUp.execute(cells, cursor);
                break;
            case S:
                moveCursorDown.execute(cells, cursor);
                break;
            case A:
                moveCursorLeft.execute(cells, cursor);
                break;
            case D:
                moveCursorRight.execute(cells,cursor);
                break;
            case SPACE:
                togglePixel.execute(cells,cursor);
            default:
                break;
        }
    }



}

