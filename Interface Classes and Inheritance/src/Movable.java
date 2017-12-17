public interface Movable {
    // all interface variables are FINAL
    Coordinate origin = new Coordinate(0,0);
    public Coordinate moveTo(Coordinate pos);
    public Coordinate whereIs();
    public void toOrigin();
}
