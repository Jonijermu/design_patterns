package Factory;

import ProductsA.ButtonA;
import ProductsA.CheckBoxA;
import ProductsA.TextFieldA;
import Ui.Button;
import Ui.CheckBox;
import Ui.TextField;

public class FactoryA extends UiAbstractFactory {


    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckBoxA(text);
    }
}
