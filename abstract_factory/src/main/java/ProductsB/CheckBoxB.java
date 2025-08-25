package ProductsB;

import Ui.CheckBox;

public class CheckBoxB extends CheckBox {
    public CheckBoxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("Checkbox B");
    }
}
