package sample;

public class Point {
    private double[] coordinates;

    public Point() {
        setCoordinates(new double[2]);
    }

    public Point(double[] coords) {
        setCoordinates(coords);
    }

    public Point(Point other) {
        setCoordinates(other.coordinates);
    }

    public double[] getCoordinates() {
        double[] temp = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            temp[i] = coordinates[i];
        }
        return temp;
    }

    public void setCoordinates(double[] coords) {
        if (coords != null && coords.length == 2) {
            coordinates = new double[2];

            for (int i = 0; i < coords.length; i++) {
                coordinates[i] = coords[i];
            }
        } else {
            coordinates = new double[]{0, 0};
        }
    }


    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", coordinates[0], coordinates[1]);
    }
}
