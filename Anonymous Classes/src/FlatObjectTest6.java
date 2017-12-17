public class FlatObjectTest6 {
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

    FlatObjectTest6() {
        final double radius = 1.0;
        System.out.println("FlatObjectTest 6!");
        System.out.println("Call returns '"+
            new FlatObject() {
                { /* initializer block */ }
                public double calculateArea() {
                    return radius * radius * Math.PI;
                }
            }+"'"
        );
    }

    public static void main(String[] args) {
        new FlatObjectTest6();
    }
}
