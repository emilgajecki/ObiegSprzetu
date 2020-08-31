package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;


public class NewUserController {

    private MainControllers mainControllers;
    private AppController appController;
    private TextField name;
    private TextField lastName;


    @FXML
    public void backButtonUser() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/App.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void newUser() {
    }

    @FXML
    public void newDevice() {

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

