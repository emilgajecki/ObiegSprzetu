package controllers;


import javafx.fxml.FXML;

import java.awt.*;

public class NewDeviceController {

    private MainControllers mainControllers;
    private TextField deviceName;
    private TextField deviceModel;

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }
    @FXML
    public TextField getDeviceName() {
        return deviceName;
    }

    @FXML
    public TextField getDeviceModel() {
        return deviceModel;
    }

    @FXML
    public void backMenu(){
        mainControllers.loadMenuScreen();
    }

    @FXML
    public void addDeviceToDatabase(){

    }




}
