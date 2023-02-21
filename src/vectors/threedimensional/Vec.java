package vectors.threedimensional;



public class Vec {
    private Coordinate startCoord, endCoord;

    public Vec(Coordinate start, Coordinate end) {
        startCoord = start; endCoord = end;
    }
    public Vec() {
        startCoord = new Coordinate(0, 0, 0);
        endCoord = new Coordinate(1, 1, 1);
    }

    //nonstatic
    public Coordinate getStart() {return startCoord;}
    public Coordinate getEnd() {return endCoord;}
    public void setStart(Coordinate i) {startCoord = i;}
    public void setEnd(Coordinate i) {endCoord = i;}
    public double getDX() {return (endCoord.getX() - startCoord.getX());}
    public double getDY() {return (endCoord.getY() - startCoord.getY());}
    public double getDZ() {return (endCoord.getZ() - startCoord.getZ());}
    public double getMagnitude() {return Coordinate.distanceBetween(startCoord, endCoord);}
    public Vec getUnitVec() {
        return Vec.div(this, this.getMagnitude());
    }

    //static
    public static Vec add(Vec i, Vec i1) {
        return new Vec(
                i.getStart(), new Coordinate(
                        i.getStart().getX() + i.getDX() + i1.getDX(),
                        i.getStart().getY() + i.getDY() + i1.getDY(),
                        i.getStart().getZ() + i.getDZ() + i1.getDZ()
        ));
    }
    public static Vec sub(Vec i, Vec i1) {
        return new Vec(
                i.getStart(), new Coordinate(
                i.getStart().getX() + i.getDX() - i1.getDX(),
                i.getStart().getY() + i.getDY() - i1.getDY(),
                i.getStart().getZ() + i.getDZ() - i1.getDZ()
        ));
    }
    public static Vec mult(Vec v, double s) {
        return new Vec(
                v.getStart(), new Coordinate(
                v.getEnd().getX() * s,
                v.getEnd().getY() * s,
                v.getEnd().getZ() * s
        ));
    }
    public static Vec div(Vec v, double s) {
        return new Vec(
                v.getStart(), new Coordinate(
                v.getEnd().getX() / s,
                v.getEnd().getY() / s,
                v.getEnd().getZ() / s
        ));
    }
    public static double dotProduct(Vec i, Vec i1) {
        return (i.getDX() * i1.getDX() + i.getDY() * i1.getDY() + i.getDZ() + i1.getDZ());
    }
    public static Vec crossProduct(Vec i, Vec i1) {
        return new Vec(i.getStart(), new Coordinate(
                i.getStart().getX() + i.getDX() * i1.getDZ() - i.getDZ() * i1.getDY(),
                i.getStart().getY() + i.getDZ() * i1.getDX() - i.getDX() * i1.getDZ(),
                i.getStart().getZ() + i.getDX() * i.getDY() - i.getDY() * i1.getDX()
        ));
    }

}
