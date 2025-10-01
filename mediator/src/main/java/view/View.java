package view;

import controller.UserCreationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ChatLog;
import model.User;

public class View extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        ChatLog chatLog = new ChatLog();
        for (int i = 0; i < 3; i++) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/usernameView.fxml"));
            Parent parent = fxmlLoader.load();
            UserCreationController controller = fxmlLoader.getController();
            controller.setController(chatLog);
            Stage userStage = new Stage();
            userStage.setScene(new Scene(parent));
            userStage.showAndWait();
        }
        for (User u: chatLog.getUsers()) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/chatApplicationView.fxml"));
            Parent parent = fxmlLoader.load();
            Stage chatStage = new Stage();
            chatStage.setScene(new Scene(parent));
            chatStage.setTitle(u.getName() +"'s window");
            chatStage.show();


        }
    }
}
