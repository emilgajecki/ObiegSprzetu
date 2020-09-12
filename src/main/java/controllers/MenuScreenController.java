package controllers;

import javafx.application.Platform;
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
        NewUserController newUserController = loader.getController();
        newUserController.setMainControllers(mainControllers);
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
        NewDeviceController newDeviceController = loader.getController();
        newDeviceController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void seeUser() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/SeeUser.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SeeUserController seeUserController= loader.getController();
        seeUserController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);

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

}
