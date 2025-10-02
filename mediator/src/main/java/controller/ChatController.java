package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.User;

import java.util.List;

public class ChatController {

    private User user;
    private List<User> users;

    public void setController() {

    }

    @FXML
    private TextArea chatlogTextArea;

    @FXML
    private TextField messageTextField;

    @FXML
    private Button sendMessageButton;

    @FXML
    private ComboBox<User> recipientComboBox;

    public void setController(User user, List<User> users) {
        this.user = user;
        this.users = users;
        this.user.setChatController(this);
        addRecipients();
    }

    @FXML
    void sendMessage(ActionEvent event) {
        User recipient = recipientComboBox.getValue();
        String message = messageTextField.getText();
        if (!message.isEmpty()) {
            user.send(message, recipient);
            displayMessage("Me: " + message);
            messageTextField.clear();
        }
    }

    public void addRecipients() {
        for (User u : users) {
            if (!u.equals(user)) {
                recipientComboBox.getItems().add(u);
            }
        }
    }

    public void displayMessage(String message) {
        chatlogTextArea.appendText(message + "\n");
    }

}
