package org.example.calculator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    /*@FXML
    public void onPlusClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "+");
    }*/

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcomeText.setText("");
    }
}