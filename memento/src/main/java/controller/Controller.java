package controller;

import model.IMemento;
import model.Model;
import view.Gui;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Model model;
    private Gui gui;
    private List<IMemento> history;


    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();

    }

    public void setOptions(int optionNumber, int choice) {
        saveToHistory();
        model.setOptions(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            history.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
            System.out.println(history.size());
        }
    }

    public void redo() {
        if (!history.isEmpty()) {
            System.out.println(history.size());
            IMemento previousState = history.get(history.size()+1);
            System.out.println(history.size());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

}
