package controllers;

import javafx.fxml.FXML;

import java.awt.*;


public class NewUserController {
    private MainControllers mainControllers;
    private TextField name;
    private TextField lastName;


    @FXML
    public void backButton() {
        mainControllers.loadMenuScreen();
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

