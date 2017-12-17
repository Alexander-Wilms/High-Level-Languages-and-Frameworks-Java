import org.w3c.dom.css.Rect;

public class FlatObjectTest4 {
    public class InvalidAreaException extends Exception {
        InvalidAreaException(String s) {
            super(s);
        }
    }

    public class FlatObject {
        protected double area;

        public double getArea() throws InvalidAreaException {
            if(area <= 0) {
                throw new InvalidAreaException("Area <= 0");
            }
            return area;
        }

        @Override
        public String toString() {
            try {
                return "Area="+getArea();
            } catch (InvalidAreaException iex) {
                return iex.toString();
            }
        }
    }

    public class RectFlatObject extends FlatObject {
        double sizex, sizey;

        RectFlatObject(double sx, double sy) {
            resize(sx, sy);
        }

        public void resize(double sx, double sy) {
            area = 0; // just for testing the exception
        }
    }

    FlatObjectTest4() {
        RectFlatObject myFlat;
        System.out.println("FlatObjectTest 4!");
        myFlat = new RectFlatObject(-3,4);
        System.out.println("Call returns '"+myFlat+"'");
        myFlat.resize(5,-7);
        System.out.println("Call returns '"+myFlat+"'");
    }

    public static void main(String[] args) {
        new FlatObjectTest4();
    }
}
