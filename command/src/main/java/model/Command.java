package model;

import javafx.scene.layout.Pane;

public interface Command {

    void execute(Pane[][] cells, CursorPosition cursor);
}
