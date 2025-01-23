package com.Algoritmos.Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController extends Application {

    @FXML
    private Button buttonCalcular;

    @FXML
    private TextField textFieldReinas;

    @FXML
    private TextField textFieldX;

    @FXML
    private TextField textFieldY;

    @FXML
    public void calc() {
        // tenemos que abrir una nueva ventana con los resultados
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/Algoritmos/View/MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("N-REINAS");
        primaryStage.setScene(scene);
        Image icon = new Image(getClass().getResourceAsStream("/com/Algoritmos/Image/table.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }
}
