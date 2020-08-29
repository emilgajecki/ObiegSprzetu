package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainControllers {

    //dodajemy nasze główne okno - to ono będzie sie zmieniało
    @FXML
    private StackPane mainStackPane;

    @FXML void initialize(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/PierwszaStrona.fxml"));
        // aby Pane był widoczny wszedzie
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainStackPane.getChildren().add(pane);
    }
}
