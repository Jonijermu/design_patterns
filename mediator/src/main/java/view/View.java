package view;

import controller.ChatController;
import controller.UserCreationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ChatBroadcaster;
import model.ChatLog;
import model.User;

public class View extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        ChatLog chatLog = new ChatLog();
        ChatBroadcaster mediator = new ChatBroadcaster();
        for (int i = 0; i < 3; i++) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/usernameView.fxml"));
            Parent parent = fxmlLoader.load();
            UserCreationController controller = fxmlLoader.getController();
            controller.setController(chatLog);
            Stage userStage = new Stage();
            userStage.setScene(new Scene(parent));
            userStage.showAndWait();
        }

        for (User u : chatLog.getUsers()) {
            mediator.addUser(u);
        }

        for (User u: chatLog.getUsers()) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/chatApplicationView.fxml"));
            Parent parent = fxmlLoader.load();
            ChatController controller = fxmlLoader.getController();
            controller.setController(u, chatLog.getUsers());
            Stage chatStage = new Stage();
            chatStage.setScene(new Scene(parent));
            chatStage.setTitle(u.getName() +"'s window");
            chatStage.show();


        }
    }
}
