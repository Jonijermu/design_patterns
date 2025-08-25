package Factory;

import ProductsB.ButtonB;
import ProductsB.CheckBoxB;
import ProductsB.TextFieldB;
import Ui.Button;
import Ui.CheckBox;
import Ui.TextField;

public class FactoryB extends UiAbstractFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckBoxB(text);
    }
}
