public class FlatObjectTest5 {
    public abstract class FlatObject {
        protected double area;

        // Don't do it THIS WAY!!!
        FlatObject() {
            area = calculateArea();
        }

        double getArea() {
            return area;
        }

        @Override
        public String toString() {
            return new Double(area).toString();
        }

        public abstract double calculateArea();
    }

    /**
     * Class 'RectFlatObject' must either be declared abstract or implement
     * abstract method 'calculateArea()' in 'FlatObject'
     */
    public class RectFlatObject extends FlatObject {
        double sizex, sizey;

        RectFlatObject(double sx, double sy) {
            resize(sx, sy);
        }

        public void resize(double sx, double sy) {
            sizex = sx;
            sizey = sy;
            area = calculateArea();
        }

        @Override
        public double calculateArea() {
            return sizex*sizey;
        }
    }

    FlatObjectTest5() {
        FlatObject myFlat = new RectFlatObject(3, 4);
        System.out.println(myFlat.calculateArea());
    }

    public static void main(String[] args) {
        new FlatObjectTest5();
    }
}
