package ProductsB;

import Ui.CheckBox;

public class CheckBoxB extends CheckBox {
    public CheckBoxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        int width = text.length() + 4;

        for (int i = 0; i < width; i++) {
            System.out.print("+");
        }
        System.out.println();
        System.out.println("| " + text + " |");

        for (int i = 0; i < width; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}
