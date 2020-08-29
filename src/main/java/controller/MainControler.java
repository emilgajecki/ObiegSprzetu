package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainControler {
    //controller dla StackPane - dopisany w fxml

    //wstrzykiwanie elementow do controllera
    @FXML
    private Pane main;

    @FXML
    // zaraz po konstruktorze
    void initialize(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/LoginPage.fxml"));
        // deklarujemy wuzej, aby był widoczny po za try/catch
        Pane pain = null;
        try {
            pain = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        main.getChildren().add(pain);

    }

}
