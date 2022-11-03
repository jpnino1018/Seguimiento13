package com.example.safeproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class
SafeApplication extends Application {
    @Override
    public void start(Stage stage){
        showWindow("Start.fxml");
    }

    public static void showWindow(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    SafeApplication.class.getResource(fxml));
            Parent node = fxmlLoader.load();
            Scene scene = new Scene(node);
            Stage window = new Stage();
            window.setScene(scene);
            window.show();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}