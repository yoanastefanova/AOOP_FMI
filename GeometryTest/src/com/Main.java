package com;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import sample.*;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group pane = new Group();
        Scene scene = new Scene(pane, 500, 300);
        Random rand = new Random();

        double randX = rand.nextInt(50001)/100;//[0,500]
        double randY = rand.nextInt(30001)/100;//[0,300]
        Point p1 = new Point(new double[]{randX, randY});

        randX = rand.nextInt(50001)/100;
        randY = rand.nextInt(30001)/100;
        Point p2 = new Point(new double[]{randX,randY});



        Rectangle r1 = new Rectangle(p1, 20, 50);
        Rectangle r2 = new Rectangle(p2, 70, 30);

        Line l1 = new Line(p1, new Point(new double[]{
                p1.getCoordinates()[0] + 50,
                p1.getCoordinates()[1] + 30}));


        r1.draw(pane);
        r2.draw(pane);
        l1.draw(pane);

        primaryStage.setTitle("Geometry");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
