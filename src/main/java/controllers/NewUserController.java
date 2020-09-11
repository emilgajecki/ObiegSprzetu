package controllers;

import javafx.fxml.FXML;
import java.awt.*;

public class NewUserController {

    private MainControllers mainControllers;
    private TextField name;
    private TextField lastName;

    @FXML
    public void backMenu(){
        mainControllers.loadMenuScreen();
    }

    @FXML
    public void addUsertoDatabase(){

    }

    public TextField getName() {
        return name;
    }

    public TextField getLastName() {
        return lastName;
    }
}

