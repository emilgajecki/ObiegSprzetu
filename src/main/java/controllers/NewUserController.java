package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;

public class NewUserController {

    private MainControllers mainControllers;

    private TextField name;
    private TextField lastName;

    @FXML
    public  void backMenu(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainControllers.setScreen(pane);
    }


    @FXML
    public void closeApp() {
        Platform.exit();
    }

    @FXML
    public void newUser() {
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

    @FXML
    public void addLastName() {

    }

    @FXML
    public void addName() {

    }

    public TextField getName() {
        return name;
    }

    public TextField getLastName() {
        return lastName;
    }
}

