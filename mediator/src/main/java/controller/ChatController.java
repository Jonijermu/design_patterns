package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    public void setController() {

    }

    @FXML
    private TextArea chatlogTextArea;

    @FXML
    private TextField messageTextField;

    @FXML
    private Button sendMessageButton;

    @FXML
    void sendMessage(ActionEvent event) {
        String message = messageTextField.getText();
    }

}
