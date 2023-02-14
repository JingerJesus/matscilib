package vectors.twodimensional;

public class Coordinate {
    private double x, y;

    public Coordinate(double i, double i1) {
        x = i; y = i1;
    }

    public Coordinate() {
        x = 1; y = 1;
    }

    //nonstatic
    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double i) {x=i;}
    public void setY(double i) {y=i;}


    //static
    public static double distanceBetween(Coordinate a, Coordinate b) {
        double dy, dx;

        dy = Math.abs(a.getY() - b.getY());
        dx = Math.abs(a.getX() - b.getX());

        return Math.sqrt(dy*dy + dx*dx);

    }


}
