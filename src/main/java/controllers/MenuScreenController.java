package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {

    private MainControllers mainControllers;

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }

    @FXML
    public void openApplication(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/App.fxml"));
        Pane pane =null ;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

}
