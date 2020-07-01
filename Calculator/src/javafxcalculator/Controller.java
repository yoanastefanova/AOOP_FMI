package javafxcalculator;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.security.jgss.GSSUtil;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import java.lang.Math;


public class Controller {


    private double firstNum = 0d;
    private int operation = -1;
    private Alert alert;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnOff;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn0;

    @FXML
    private Button btn00;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnDec;

    @FXML
    private Button btnEq;

    @FXML
    private Button btnC;

    @FXML
    private Button btnCA;

    @FXML
    void btn1OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn1.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn2OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn2.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn3OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn3.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn4OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn4.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn5OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn5.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn6OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn6.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn7OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn7.getText());
        txtInput.setText(String.format("%d", newNum));
        ;
    }

    @FXML
    void btn8OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn8.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn9OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10 + Integer.parseInt(btn9.getText());
        txtInput.setText(String.format("%d", newNum));
    }

    @FXML
    void btn0OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        int newNum = curNum * 10;
        txtInput.setText(String.format("%d", newNum));

    }

    @FXML
    void btn00OnAction() {
        int curNum = Integer.parseInt(txtInput.getText());
        txtInput.setText(String.format("%d", curNum * 100));
    }

    @FXML
    void btnPlusOnAction() {
        firstNum = Double.parseDouble(txtInput.getText());
        operation = 1;
        txtInput.setText("0");

        //txtInput.setText(String.format("%d", res));
    }

    @FXML
    void btnMinusOnAction() {
        firstNum = Double.parseDouble(txtInput.getText());
        operation = 2;
        txtInput.setText("0");
    }

    @FXML
    void btnMultOnAction() {
        firstNum = Double.parseDouble(txtInput.getText());
        operation = 3;
        txtInput.setText("0");
    }

    @FXML
    void btnDivOnAction() {
        firstNum = Double.parseDouble(txtInput.getText());
        operation = 4;
        txtInput.setText("0");
    }

    @FXML
    void btnDecOnAction() {
        firstNum = Double.parseDouble(txtInput.getText());
        operation = 5;
        txtInput.setText("0");
    }

    @FXML
    void btn1xOnAction(){
        firstNum = Double.parseDouble(txtInput.getText());
        txtInput.setText(String.valueOf(1/firstNum));
    }

    @FXML
    void btnSquaredOnAction(){
        firstNum = Double.parseDouble(txtInput.getText());
        txtInput.setText(String.valueOf(firstNum*firstNum));
    }

    @FXML
    void btnSquareRootAction(){
        firstNum = Double.parseDouble(txtInput.getText());
        txtInput.setText(String.valueOf(Math.sqrt(firstNum)));
    }

    @FXML
    void btnLogOnAction(){
        firstNum = Double.parseDouble(txtInput.getText());
        txtInput.setText(String.valueOf(Math.log10(firstNum)));
    }


    @FXML
    void btnEqOnAction() {
        double secNum = Double.parseDouble(txtInput.getText());
        switch (operation) {
            case 1:
                double res = firstNum + secNum;
                txtInput.setText(String.valueOf(res));
                break;
            case 2:
                res = firstNum - secNum;
                txtInput.setText(String.valueOf(res));
                break;
            case 3:
                res = firstNum * secNum;
                txtInput.setText(String.valueOf(res));
                break;
            case 4:
                res = 0d;
                try {
                    res = firstNum / secNum;
                } catch (Exception e) {
                    txtInput.setText("Error");
                }
                txtInput.setText(String.valueOf(res));
                break;
        }
    }

    @FXML
    void btnDecOnAction(ActionEvent event){
        txtInput.setText(txtInput.getText() + ".");
    }

    @FXML
    void btnCOnAction() {
        txtInput.setText("0");
    }

    @FXML
    void btnCAOnAction() {
        txtInput.setText("0");
        operation = -1;
    }

    @FXML
    void btnOffOnAction() {
        if ( ButtonType.OK == alert.showAndWait().get()) {
            Platform.exit();
        }

    }

    @FXML
    void initialize() {
        operation = -1;
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText(null);
        alert.setContentText("Do you want to exit?");

    }

}
