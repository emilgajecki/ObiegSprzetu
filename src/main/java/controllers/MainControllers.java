package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class MainControllers {

    //dodajemy nasze główne okno - to ono będzie sie zmieniało
    @FXML
    private Pane mainStackPane;

    @FXML
        //wywolywana zaraz po konstruktorze
    void initialize() {
        loadMenuScreen();
    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
        //definicja pane.
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuScreenController menuScreenController = loader.getController();
        menuScreenController.setMainControllers(this);
        //Pane do ekranu głównego
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        //czyscimy ekrany przed zmiana
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }
}
