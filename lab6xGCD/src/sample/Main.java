package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    private TextField txtFirstNumber;
    private TextField txtSecondNumber;
    private TextField txtResult;

    private void readInputAndCompute(ActionEvent event) {//
        String firstNumberText = txtFirstNumber.getText();
        String secondNumberText = txtSecondNumber.getText();
        int a;
        if (firstNumberText.matches("\\d+")) {//1 или повече числови символи
            a = Integer.parseInt(firstNumberText);
        } else {
            a = 0;
        }
        int b;
        if (secondNumberText.matches("\\d+")) {
            b = Integer.parseInt(secondNumberText);
        } else {
            b = 0;
        }

        txtResult.setText("" + Controller.gcd(a,b));
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        GridPane pane = new GridPane();
        root.getChildren().add(pane);

        txtFirstNumber = new TextField();
        txtFirstNumber.setPrefColumnCount(10);

        txtSecondNumber = new TextField();
        txtSecondNumber.setPrefColumnCount(10);

        txtResult = new TextField();
        txtResult.setPrefColumnCount(10);
        txtResult.setEditable(false);

        Label lblFirstNumber = new Label("A: ");
        Label lbSecondNumber = new Label("B: ");
        Label lblResult = new Label("GCD: ");


        Button btnCompute = new Button("Compute GDC");
        btnCompute.setOnAction((event) -> readInputAndCompute(event));

        Button btnQuit = new Button("Quit");
        btnQuit.setOnAction((event) -> Platform.exit());


        pane.add(lblFirstNumber, 0, 0);
        pane.add(txtFirstNumber, 1, 0);
        pane.add(lbSecondNumber, 0, 1);
        pane.add(txtSecondNumber, 1, 1);
        pane.add(lblResult, 0, 2);
        pane.add(txtResult, 1, 2);
        pane.add(btnCompute, 0, 3);
        pane.add(btnQuit, 1, 3);

        AnchorPane.setTopAnchor(pane, 8.0);
        AnchorPane.setBottomAnchor(pane, 8.0);
        AnchorPane.setLeftAnchor(pane, 8.0);
        AnchorPane.setRightAnchor(pane, 8.0);

        pane.setVgap(8.0);
        pane.setHgap(8.0);

        primaryStage.setTitle("GCD");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
