public class FlatObjectTest {
    static FlatObject myFlat;

    public static void main(String[] args) {
        System.out.println("FlatObjectTest!");
        // if we don't actually create the object, we get NullPointerExceptions later on
        myFlat = new FlatObject();
        myFlat.setArea(3.5);
        System.out.println("Call returns '"+myFlat+"'");
    }
}
