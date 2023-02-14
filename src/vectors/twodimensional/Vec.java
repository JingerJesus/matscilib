package vectors.twodimensional;

public class Vec {
    private Coordinate startCoord, endCoord;

    public Vec(Coordinate start, Coordinate end) {
        startCoord = start; endCoord = end;
    }
    public Vec() {
        startCoord = new Coordinate(0, 0);
        endCoord = new Coordinate(1, 1);
    }

    //nonstatic
    public Coordinate getStart() {return startCoord;}
    public Coordinate getEnd() {return endCoord;}
    public void setStart(Coordinate i) {startCoord = i;}
    public void setEnd(Coordinate i) {endCoord = i;}
    public double getDX() {return (endCoord.getX() - startCoord.getX());}
    public double getDY() {return (endCoord.getY() - startCoord.getY());}
    public double getMagnitude() {return Coordinate.distanceBetween(startCoord, endCoord);}
    public Vec getUnitVec() {
        return Vec.div(this, getMagnitude());
    }


    //static
    public static Vec add(Vec i, Vec i1) {

        return new Vec( i.getStart(),
                new Coordinate(i.getDX() + i1.getDX() + i.getStart().getX(),
                        i.getDY() + i1.getDY() + i.getStart().getY()));
    }

    public static Vec sub(Vec i, Vec i1) {
        return new Vec(
                i.getStart(),
                new Coordinate(i.getDX() - i1.getDX() + i.getStart().getX(),
                        i.getDY() - i1.getDY() + i.getStart().getY()));
    }

    public static Vec mult(Vec v, double s) {
        Coordinate a;
        a = new Coordinate(v.getEnd().getX() * s, v.getEnd().getY() * s);
        return new Vec(v.getStart(), a);
    }

    public static Vec div(Vec v, double s) {
        Coordinate a;
        a = new Coordinate(v.getEnd().getX() / s, v.getEnd().getY() / s);
        return new Vec(v.getStart(), a);
    }
    public static double dotProduct(Vec i, Vec i1) {
        return (i.getDX() * i1.getDX() + i.getDY() * i1.getDY());
    }

}
