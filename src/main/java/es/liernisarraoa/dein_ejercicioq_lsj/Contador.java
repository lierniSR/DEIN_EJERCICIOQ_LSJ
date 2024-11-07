package es.liernisarraoa.dein_ejercicioq_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Contador extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Contador.class.getResource("cronometro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 419, 106);
        stage.setTitle("Cronometro!");
        stage.setResizable(false);
        stage.setScene(scene);git
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}