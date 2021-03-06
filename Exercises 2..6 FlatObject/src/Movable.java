public interface Movable {
    // final fields need to be initialized
    final Coordinate origin = new Coordinate(0,0);
    public Coordinate moveTo(Coordinate pos);
    public Coordinate shiftTo(Coordinate pos);
    public Coordinate whereIs();
    public void toOrigin();
}
