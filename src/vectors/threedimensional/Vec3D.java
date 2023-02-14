package vectors.threedimensional;



public class Vec3D {
    private Coordinate3D startCoord, endCoord;

    public Vec3D(Coordinate3D start, Coordinate3D end) {
        startCoord = start; endCoord = end;
    }
    public Vec3D() {
        startCoord = new Coordinate3D(0, 0, 0);
        endCoord = new Coordinate3D(1, 1, 1);
    }

    //nonstatic
    public Coordinate3D getStart() {return startCoord;}
    public Coordinate3D getEnd() {return endCoord;}
    public void setStart(Coordinate3D i) {startCoord = i;}
    public void setEnd(Coordinate3D i) {endCoord = i;}
    public double getDX() {return (endCoord.getX() - startCoord.getX());}
    public double getDY() {return (endCoord.getY() - startCoord.getY());}
    public double getDZ() {return (endCoord.getZ() - startCoord.getZ());}
    public double getMagnitude() {return Coordinate3D.distanceBetween(startCoord, endCoord);}
    public Vec3D getUnitVec() {
        return Vec3D.div(this, this.getMagnitude());
    }

    //static
    public static Vec3D add(Vec3D i, Vec3D i1) {
        return new Vec3D(
                i.getStart(), new Coordinate3D(
                        i.getStart().getX() + i.getDX() + i1.getDX(),
                        i.getStart().getY() + i.getDY() + i1.getDY(),
                        i.getStart().getZ() + i.getDZ() + i1.getDZ()
        ));
    }
    public static Vec3D sub(Vec3D i, Vec3D i1) {
        return new Vec3D(
                i.getStart(), new Coordinate3D(
                i.getStart().getX() + i.getDX() - i1.getDX(),
                i.getStart().getY() + i.getDY() - i1.getDY(),
                i.getStart().getZ() + i.getDZ() - i1.getDZ()
        ));
    }
    public static Vec3D mult(Vec3D v, double s) {
        return new Vec3D(
                v.getStart(), new Coordinate3D(
                v.getEnd().getX() * s,
                v.getEnd().getY() * s,
                v.getEnd().getZ() * s
        ));
    }
    public static Vec3D div(Vec3D v, double s) {
        return new Vec3D(
                v.getStart(), new Coordinate3D(
                v.getEnd().getX() / s,
                v.getEnd().getY() / s,
                v.getEnd().getZ() / s
        ));
    }
    public static double dotProduct(Vec3D i, Vec3D i1) {
        return (i.getDX() * i1.getDX() + i.getDY() * i1.getDY() + i.getDZ() + i1.getDZ());
    }
    public static Vec3D crossProduct(Vec3D i, Vec3D i1) {
        return new Vec3D(i.getStart(), new Coordinate3D(
                i.getStart().getX() + i.getDX() * i1.getDZ() - i.getDZ() * i1.getDY(),
                i.getStart().getY() + i.getDZ() * i1.getDX() - i.getDX() * i1.getDZ(),
                i.getStart().getZ() + i.getDX() * i.getDY() - i.getDY() * i1.getDX()
        ));
    }

}
