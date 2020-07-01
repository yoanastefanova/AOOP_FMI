package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.BLACK;

public class Line{
    private Point sPoint;//start
    private Point ePoint;//end


    public Line() {
        setsPoint(new Point());
        setePoint(new Point(new double[]{10, 10}));
    }

    public Line(Point newsPoint, Point newePoint) {
        setsPoint(newsPoint);
        setePoint(newePoint);
    }

    public Line(Line other) {
        setePoint(other.ePoint);
        setsPoint(other.sPoint);
    }

    public void setsPoint(Point newsPoint) {
        sPoint = new Point(newsPoint);
    }

    public void setePoint(Point newePoint) {
        ePoint = new Point(newePoint);
    }

    @Override
    public String toString() {
        return String.format("Starting point: %s, Ending point: %s", sPoint.toString(), ePoint.toString());
    }


    public void draw(Group pane) {
        javafx.scene.shape.Line l = new javafx.scene.shape.Line(sPoint.getCoordinates()[0], sPoint.getCoordinates()[1],
                ePoint.getCoordinates()[0], ePoint.getCoordinates()[1]);

        l.setStroke(Color.BLACK);
        l.setStrokeWidth(3);
        pane.getChildren().add(l);
    }

}
