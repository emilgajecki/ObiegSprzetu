package controllers;

import javafx.fxml.FXML;

public class AppController {

    private MainControllers mainControllers;

    @FXML
    public void backButton(){
        mainControllers.loadMenuScreen();
    }

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }
}
