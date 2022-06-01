package com.example.ricochetrobot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainController {
    @FXML
    public GridPane gridPane;

    @FXML
    public Button jouerBtn;

    @FXML
    public void onJouerClicked(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("player-view.fxml"));
    }


}