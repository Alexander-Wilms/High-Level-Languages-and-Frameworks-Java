public class Coordinate {
    private double posX, posY;

    @Override
    public String toString() {
        return "("+posX+", "+posY+")";
    }

    Coordinate() {
        posX = 0;
        posY = 0;
    }

    Coordinate(double X, double Y) {
        posX = X;
        posY = Y;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
