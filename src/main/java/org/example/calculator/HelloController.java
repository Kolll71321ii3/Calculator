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

    @FXML
    public void onDeleteSymbol() {
        welcomeText.setText("");
    }

    @FXML
    public void onPlusClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "+");
    }

    @FXML
    public void onZeroClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "0");
    }

    @FXML
    public void onOneClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "1");
    }

    @FXML
    public void onTwoClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "2");
    }

    @FXML
    public void onThreeClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "3");
    }

    @FXML
    public void onFourClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "4");
    }

    @FXML
    public void onFiveClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "5");
    }

    @FXML
    public void onSixClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "6");
    }

    @FXML
    public void onSevenClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "7");
    }

    @FXML
    public void onEightClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "8");
    }

    @FXML
    public void onNineClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "9");
    }

    @FXML
    public void onDivideClick() {
        String str = welcomeText.getText();
        if(!str.endsWith("/")){
            welcomeText.setText(str + "/");
        }
    }

    @FXML
    public void onSqrtClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + (char)8730);
    }

    @FXML
    public void onModClick() {
        String str = welcomeText.getText();
        if(!str.endsWith("mod")){
            welcomeText.setText(str + "mod");
        }
    }

    @FXML
    public void onPiClick() {
        String str = welcomeText.getText();
        if(!str.endsWith("3,14")){
            welcomeText.setText(str + "3,14");
        }
    }

    @FXML
    public void onPointClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + ",");
    }

    @FXML
    public void onPercentClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "%");
    }

    @FXML
    public void onMinusClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "-");
    }

    @FXML
    public void onMultiplicationClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "*");
    }

    @FXML
    public void onExponentiationClick() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "^");
    }

    @FXML
    public void onClosingPar() {
        String str = welcomeText.getText();
        welcomeText.setText(str + ")");
    }

    @FXML
    public void onOpeningPar() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "(");
    }

    @FXML
    public void onMod() {
        String str = welcomeText.getText();
        welcomeText.setText(str + "(");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcomeText.setText("");
    }
}