package ProductsB;

import Ui.TextField;

public class TextFieldB extends TextField {

    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("Text field B");
    }
}
