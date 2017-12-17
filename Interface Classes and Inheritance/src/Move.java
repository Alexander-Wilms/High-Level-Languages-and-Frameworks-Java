public class Move {
    static void moveToSameX(Movable obj1, Movable obj2) {
        obj1.moveTo(new Coordinate(
                obj2.whereIs().posX, // move obj1's X to obj2's X
                obj1.whereIs().posY) // keep obj1's Y
        );
    }

    static void moveToSameY(Movable obj1, Movable obj2) {
        obj1.moveTo(new Coordinate(
                obj1.whereIs().posX, // keep obj1's X
                obj2.whereIs().posY) // move obj1's Y to obj2's Y
        );
    }
}
