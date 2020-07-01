package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Rectangle {
    private Point uPoint;//coordinates of the upper left corner of the rectangle
    private double width;
    private double height;

    public Rectangle() {
        this(new Point(), 10, 10);
    }

    public Rectangle(Point uPoint, double width, double height) {
        setuPoint(uPoint);
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(Rectangle other) {
        setuPoint(other.uPoint);
        setHeight(other.height);
        setWidth(other.width);
    }

    public void setuPoint(Point newPoint) {
        uPoint = new Point(newPoint);
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }


    public Point getuPoint() {
        return new Point(uPoint);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Upper left point: %s, " +
                        "width: %.2f, height: %.2f\n",
                uPoint.toString(), width, height);
    }


    public void draw(Group pane){
        javafx.scene.shape.Rectangle rectangle =
                new javafx.scene.shape.Rectangle(
                        uPoint.getCoordinates()[0], uPoint.getCoordinates()[1],
                        width, height
                );

        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);
        pane.getChildren().add(rectangle);
    }


}
