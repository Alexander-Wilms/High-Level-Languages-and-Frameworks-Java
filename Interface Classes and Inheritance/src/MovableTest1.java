public class MovableTest1 {
    public class FlatObject {
        private double area;

        void setArea(double area) {
            this.area = area;
        }

        public double getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "Area="+area;
        }
    }

    /**
     * Class 'RectFlatObject' must either be declared abstract or
     * implement abstract method 'moveTo(Coordinate)' in 'Movable'
     *
     * Class 'RectFlatObject' must either be declared abstract or
     * implement abstract method 'toOrigin()' in 'Movable'
     *
     * Class 'RectFlatObject' must either be declared abstract or
     * implement abstract method 'whereIs()' in 'Movable'
     */
    public class RectFlatObject extends FlatObject implements Movable {
        double sizex, sizey;
        Coordinate position;

        RectFlatObject(double sx, double sy) {
            resize(sx, sy);
            /**
             * without creating this instance:
             *
             * Exception in thread "main" java.lang.NullPointerException
             *	at Move.moveToSameX(Move.java:4)
             *	at MovableTest1.<init>(MovableTest1.java:68)
             *	at MovableTest1.main(MovableTest1.java:76)
             */
            position = new Coordinate();
        }

        public void resize(double sx, double sy) {
            sizex = sx;
            sizey = sy;
            setArea(sx*sy); // area is private!
        }

        @Override
        public Coordinate moveTo(Coordinate pos) {
            position = pos;
            return position;
        }

        @Override
        public void toOrigin() {
            position = origin;
        }

        @Override
        public Coordinate whereIs() {
            return position;
        }
    }

    MovableTest1() {
        RectFlatObject rect1 = new RectFlatObject(2,3);
        RectFlatObject rect2 = new RectFlatObject(4,5);
        rect1.moveTo(new Coordinate(6,8));
        System.out.println(
            " rect1 is at "+rect1.whereIs()+
            " rect2 is at "+rect2.whereIs()
        );
        Move.moveToSameX(rect1, rect2);
        System.out.println(
            " rect1 now at "+rect1.whereIs()+
            " rect2 now at "+rect2.whereIs()
        );
    }

    public static void main(String[] args) {
        new MovableTest1();
    }
}
