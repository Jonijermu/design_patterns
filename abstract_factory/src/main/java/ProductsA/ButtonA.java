package ProductsA;

import Ui.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
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
