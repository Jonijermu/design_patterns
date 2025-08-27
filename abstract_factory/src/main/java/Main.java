import Factory.FactoryA;
import Factory.FactoryB;
import Factory.UiAbstractFactory;
import Ui.Button;
import Ui.CheckBox;
import Ui.TextField;

public class Main {
    public static void main(String[] args) {

        UiAbstractFactory factory = new FactoryB();
        Button button = factory.createButton("Click Me!");
        TextField textField = factory.createTextField("Enter Name");
        CheckBox checkBox = factory.createCheckBox("Click here");

        button.display();
        textField.display();
        checkBox.display();

        button.setText("prööt");
        button.display();

        textField.setText("moi");
        textField.display();

        checkBox.setText("hello");
        checkBox.display();


    }
}