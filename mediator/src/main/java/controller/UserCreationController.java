package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ChatLog;
import model.User;

public class UserCreationController {

    ChatLog chatLog;

    public void setController(ChatLog chatLog) {
        this.chatLog = chatLog;
    }

    @FXML
    private Button createButton;

    @FXML
    private TextField usernameTextField;

    @FXML
    void createUser(ActionEvent event) {
    User user = new User(usernameTextField.getText());
        chatLog.addUser(user);
        Stage stage = (Stage) createButton.getScene().getWindow();
        stage.close();

    }
}
