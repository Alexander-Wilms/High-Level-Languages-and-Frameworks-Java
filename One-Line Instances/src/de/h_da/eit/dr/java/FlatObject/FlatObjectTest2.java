package de.h_da.eit.dr.java.FlatObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FlatObjectTest2 {
    public static void main(String[] args) {
        System.out.println("FlatObjectTest 2!");
        System.out.println(
                "Now it's "+ new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(new Date())
        );
        System.out.println("Call returns '"+new RectFlatObject(11,12));
    }
}
