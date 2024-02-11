package com.example.framegenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppFrame extends Application {

    static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppFrame.class.getResource("frame_generator.fxml"));
        scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setTitle("Generator ramki");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}