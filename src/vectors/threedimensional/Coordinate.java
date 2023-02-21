package vectors.threedimensional;


public class Coordinate {

    double x, y, z;
    public Coordinate(double i, double i1, double i2) {
        x = i; y = i1; z = i2;
    }
    public Coordinate() {
        x = 1; y = 1; z = 1;
    }

    //nonstatic
    public double getX() {return x;}
    public double getY() {return y;}
    public double getZ() {return z;}
    public void setX(double i) {x=i;}
    public void setY(double i) {y=i;}
    public void setZ(double i) {z=i;}

    //static

    public static double distanceBetween(Coordinate a, Coordinate b) {
        double dx, dy, dz;

        dy = Math.abs(a.getY() - b.getY());
        dx = Math.abs(a.getX() - b.getX());
        dz = Math.abs(a.getZ() - b.getZ());

        return Math.sqrt(dy*dy + dx*dx + dz*dz);

    }

}
