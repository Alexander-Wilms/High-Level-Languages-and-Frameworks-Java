public class FlatObjectTest3 {
    // inner class
    public class FlatObject {
        protected double area;

        public double getArea() {
            return area;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public class RectFlatObject extends FlatObject {
        double sizex, sizey;

        RectFlatObject(double sx, double sy) {
            resize(sx, sy);
        }

        public void resize(double sx, double sy) {
            area = (sizex = sx) * (sizey = sy);
        }
    }

    FlatObjectTest3() {
        RectFlatObject myFlat;
        System.out.println("FlatObjectTest !");
        myFlat = new RectFlatObject(3,4);
        System.out.println("Call returns '"+myFlat+"'");
        myFlat.resize(5,7);
        System.out.println("Call returns '"+myFlat+"'");
    }

    public static void main(String[] args) {
        new FlatObjectTest3();
    }
}
