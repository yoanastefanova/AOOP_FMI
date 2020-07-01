package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;


public class Controller {

    private Alert alert;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDec;

    @FXML
    private Button btnHex;

    @FXML
    private Button btnBin;

    @FXML
    private TextField txtDec;

    @FXML
    private TextField txtHex;

    @FXML
    private TextField txtBin;

    @FXML
    private MenuItem btnQuit;


    @FXML
    void txtDecOnAction(KeyEvent e) {
        if (txtDec != null) {
            if (e.getCode().equals(KeyCode.ENTER)) {
                int helper = Integer.parseInt(txtDec.getText(), 10);
                txtHex.setText(Integer.toHexString(helper));
                txtBin.setText(Integer.toBinaryString(helper));
            }
        } else {
            Platform.exit();
        }
    }


    @FXML
    void txtHexOnAction(KeyEvent e) {
        if (txtHex != null) {
            if (e.getCode().equals(KeyCode.ENTER)) {
                int helper = Integer.parseInt(txtHex.getText(), 16);
                txtDec.setText(String.valueOf(helper));
                txtBin.setText(Integer.toBinaryString(helper));
            }
        } else {
            Platform.exit();
        }
    }


    @FXML
    void txtBinOnAction(KeyEvent e) {
        if (txtBin != null) {
            if (e.getCode().equals(KeyCode.ENTER)) {
                int helper = Integer.parseInt(txtBin.getText(), 2);
                txtDec.setText(String.valueOf(helper));
                txtHex.setText(Integer.toHexString(helper));
            }
        } else {
            Platform.exit();
        }
    }


}
