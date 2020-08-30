package controllers;

import javafx.fxml.FXML;

public class AppController {

    private MainControllers mainControllers;

    @FXML
    public void backButton(){
        mainControllers.loadMenuScreen();
    }

    @FXML
    public void newUser (){

    }

    @FXML
    public void newDevice(){

    }

    @FXML
    public void seeUser(){

    }

    @FXML
    public void seeDevice(){

    }

    @FXML
    public void checkUser(){

    }

    @FXML
    public void checkDevice(){

    }

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }
}
