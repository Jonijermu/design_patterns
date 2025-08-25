package ProductsA;

import Ui.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        int width = text.length() + 4;

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("| " + text + " |");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
