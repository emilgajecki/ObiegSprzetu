package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;

public class NewUserController {

    private MainControllers mainControllers;
    @FXML
    private TextField getName;
    @FXML
    private TextField getLastName;


    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }


    @FXML
    public void addUserToDatabase(){
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
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/seeDevice.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SeeDeviceConroller seeDeviceConroller = loader.getController();
        seeDeviceConroller.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void checkUser() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/CheckUser.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CheckUserController checkUserController = loader.getController();
        checkUserController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void checkDevice() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/CheckDevice.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CheckDeviceController checkDeviceController= loader.getController();
        checkDeviceController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void hardwareRelease(){

    }

    @FXML
    public void blockUser(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BlockUserController.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BlockUserController blockUserController = loader.getController();
        blockUserController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }

    @FXML
    public void blockDevice(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BlockDeviceController.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BlockDeviceController blockDeviceController = loader.getController();
        blockDeviceController.setMainControllers(mainControllers);
        mainControllers.setScreen(pane);
    }
}

