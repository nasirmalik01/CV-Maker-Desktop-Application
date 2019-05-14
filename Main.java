package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        primaryStage.setTitle("CV Maker Desktop Application");
        primaryStage.setScene(new Scene(root, 733, 520));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
