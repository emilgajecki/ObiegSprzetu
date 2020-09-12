package controllers;

import javafx.fxml.FXML;

import java.awt.*;

public class SeeUserController {
    private MainControllers mainControllers;
    private TextField name;
    private TextField lastName;


    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }

    @FXML
    public void backMenu(){
        mainControllers.loadMenuScreen();
    }

    @FXML
    public void checkUserInDatabase(){
    }

    public TextField getName() {
        return name;
    }

    public TextField getLastName() {
        return lastName;
    }
}
