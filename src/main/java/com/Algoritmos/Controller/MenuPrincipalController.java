package com.Algoritmos.Controller;

import com.Algoritmos.Model.Algorithm;
import com.Algoritmos.Model.FileProcessor;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

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
        int x = Integer.parseInt(textFieldX.getText());
        int y = Integer.parseInt(textFieldY.getText());
        int queens = Integer.parseInt(textFieldReinas.getText());

        if(x != y) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Tamaño del tablero inválido");
            alert.setContentText("El tablero debe de ser cuadrado. Por favor, intentelo de nuevo");
            alert.showAndWait();
        } else {
            int table[][] = new int[x][y];
            Algorithm.backtracking(table, queens);
            List<int[][]> solutions = Algorithm.getSolutions();
            FileProcessor.createSolutionFile(solutions, x, y, queens);
        }

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
