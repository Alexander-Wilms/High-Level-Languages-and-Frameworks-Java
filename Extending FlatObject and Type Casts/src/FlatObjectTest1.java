public class FlatObjectTest1 {
    public static void main(String[] args) {
        FlatObject myFlat;
        System.out.println("FlatObjectTest 1!");
        // instance of derived class in variable of type base class
        myFlat = new RectFlatObject(3,4);
        System.out.println("Call returns '"+myFlat+"'");

        // Cannor resolve method 'resize(int, int)'
        //myFlat.resize(5,7); // FAILS
        // variable of type base class needs to be cast to the derived class before
        // methods of the derived class can be used
        ((RectFlatObject)myFlat).resize(5,7);
        System.out.println("Call returns '"+myFlat+"'");
    }
}
