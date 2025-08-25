package ProductsA;

import Ui.CheckBox;

public class CheckBoxA extends CheckBox {

    public CheckBoxA(String text) {
        super(text);
    }
    @Override
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println(text);
    }
}
