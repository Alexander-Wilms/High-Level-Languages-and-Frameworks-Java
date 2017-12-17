public class Coordinate {
    public double posX, posY;

    Coordinate() {
        posX = 0;
        posY = 0;
    }

    Coordinate(double x, double y) {
        posX = x;
        posY = y;
    }

    @Override
    public String toString() {
        return "("+posX+","+posY+")";
    }
}
