package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    private static StringBuilder stringBuilder = new StringBuilder();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCompute;

    @FXML
    private Button btnQuit;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextField txtInput;

    static void printDistinctPermutations(String str, String ans) {
        if (str.length() == 0) {
            stringBuilder.append(ans).append("\n");
        }


        //boolean array which stores false by default
        //makes a position true if the letter at that position is used
        boolean[] usedLetter = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //rest of the string without ch
            String ros = str.substring(0, i) + str.substring(i + 1);

            if (ch >= 'a' && ch <= 'z') {
                if (!usedLetter[ch - 'a'])
                    printDistinctPermutations(ros, ans + ch);
                usedLetter[ch - 'a'] = true;
            } else {
                if (!usedLetter[ch - 'A'])
                    printDistinctPermutations(ros, ans + ch);
                usedLetter[ch - 'A'] = true;
            }
        }
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }


    @FXML
    void btnComputeOnAction(ActionEvent event) {
        txtResult.clear();
        printDistinctPermutations(txtInput.getText(), "");
        txtResult.setText(stringBuilder.toString());
    }

    @FXML
    void initialize() {
        assert btnCompute != null : "fx:id=\"btnComputePermutations\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtInput != null : "fx:id=\"txtUserInput\" was not injected: check your FXML file 'sample.fxml'.";

    }



}
