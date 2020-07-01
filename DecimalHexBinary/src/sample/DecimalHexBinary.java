package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class DecimalHexBinary extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("DecimalHexBinary.fxml"));
        primaryStage.setTitle("Numeric Converter");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();




        txtDec.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    doSomething();
                }
            }
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}



