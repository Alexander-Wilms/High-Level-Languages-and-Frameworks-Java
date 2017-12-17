public class RectFlatObject extends FlatObject {
    double sizex, sizey;

    RectFlatObject(double sx, double sy) {
        resize(sx, sy);
    }

    public void resize(double sx, double sy) {
        sizex = sx;
        sizey = sy;
        setArea(sx*sy); // area is private!
    }
}
