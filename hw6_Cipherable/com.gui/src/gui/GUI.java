package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import providers.Result;
import providers.Wrapper;
import providers.CipherGenerator;
import services.Cipherable;

import java.util.Arrays;

public class GUI extends Application {

    TextField txtSeed;
    TextField txtSize;
    Alert al;


    @Override
    public void start(Stage primaryStage){
        AnchorPane root = new AnchorPane();
        GridPane gridPane = new GridPane();
        root.getChildren().add(gridPane);

        txtSeed = new TextField("Enter the seed");
        txtSize = new TextField("Enter the size");

        Button btnGenerateRandom = new Button("Generate random A-Z");
        btnGenerateRandom.setOnAction(event -> btnGenerateRandomOnAction());

        Button btnRandomSubset = new Button("Random subset of A-Z");
        btnRandomSubset.setOnAction(event -> btnRandomSubsetOnAction());

        Button btnQuit = new Button("Quit");
        btnQuit.setAlignment(Pos.CENTER);
        btnQuit.setOnAction(event -> btnQuitOnAction());


        HBox hBox = new HBox(4);
        hBox.getChildren().addAll(btnGenerateRandom, btnRandomSubset);

        GridPane.setHalignment(btnQuit, HPos.CENTER);
        btnQuit.setPadding(new Insets(10, 50, 10, 50));
        btnRandomSubset.setPadding(new Insets(10, 10, 10, 10));
        btnGenerateRandom.setPadding(new Insets(10, 10, 10, 10));

        gridPane.add(txtSeed, 1, 0);
        gridPane.add(txtSize, 1, 1);
        gridPane.add(hBox, 1, 2);
        gridPane.add(btnQuit, 1, 3);


        gridPane.setVgap(8.0);
        gridPane.setHgap(8.0);

        AnchorPane.setTopAnchor(gridPane, 8.0);
        AnchorPane.setBottomAnchor(gridPane, 8.0);
        AnchorPane.setRightAnchor(gridPane, 8.0);
        AnchorPane.setLeftAnchor(gridPane, 8.0);



        primaryStage.setTitle("Generate Random Sequence");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void btnQuitOnAction() {
        Platform.exit();
    }

    private void btnRandomSubsetOnAction() {
        Wrapper wrap = new Wrapper(Integer.parseInt(txtSize.getText()));

        Result res = CipherGenerator.countDistinct(wrap.makeFixedSelection(), 0);

        al = new Alert(Alert.AlertType.INFORMATION);
        al.setTitle("Random subsequence of letter A-Z");
        al.setHeaderText("Count distinct characters out of " + txtSize.getText());
        al.setContentText("Chars: " + Arrays.toString(res.getChars()) + "\n" + "Result: " + res.getData());
        al.showAndWait();
    }

    private void btnGenerateRandomOnAction() {

        String sd = txtSeed.getText();

        Wrapper wrap = new Wrapper(Integer.parseInt(txtSize.getText()));


        Result res = CipherGenerator.countDistinct(wrap.makeFixedRandom(), Integer.parseInt(sd));


        al = new Alert(Alert.AlertType.INFORMATION);
        al.setTitle("Generate random sequence");
        al.setHeaderText("Count distinct characters out of " + txtSize.getText());
        al.setContentText("Chars: " + Arrays.toString(res.getChars()) + "\n" + "Result: " + res.getData());
        al.showAndWait();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

