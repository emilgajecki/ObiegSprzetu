package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {
    //controller dla StackPane - dopisany w fxml

    //wstrzykiwanie przyciusku button - zaloguj
    @FXML
    private Button button;


    public StackPaneController(){
        System.out.println("jestem z klasy kontrolera");
    }

    @FXML
    // zaraz po konstruktorze
    void initialize(){
    }

    @FXML
    // metoda on action Button
    public void onActionButton(){
        System.out.println("Klikam");
    }
}
