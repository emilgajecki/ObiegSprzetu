package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class AppController {

    private MainControllers mainControllers;

    @FXML
    public void closeApp() {
        Platform.exit();
    }

    @FXML
    public void newUser() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/NewUser.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // wszystkie okna do mainControllera
        mainControllers.setScreen(pane);
    }


    @FXML
    public void newDevice() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/NewDevice.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainControllers.setScreen(pane);
    }

    @FXML
    public void seeUser() {

    }

    @FXML
    public void seeDevice() {

    }

    @FXML
    public void checkUser() {

    }

    @FXML
    public void checkDevice() {

    }

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }

}
