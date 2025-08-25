package Factory;

import Ui.Button;
import Ui.CheckBox;
import Ui.TextField;

import javax.swing.*;

public abstract class UiAbstractFactory {

    public abstract Button createButton(String text);

    public abstract TextField createTextField(String text);

    public abstract CheckBox createCheckBox(String text);
}
