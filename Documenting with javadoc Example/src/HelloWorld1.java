import java.util.Date;

/**
 * @author Rueckle
 */
public class HelloWorld1 {
    /**
     * Stores creation date
     */
    Date dateOfCall;

    /**
     * Constructor builds a new date object with ...
     */
    HelloWorld1() {
        dateOfCall = new Date();
    }

    /**
     * Prints out on the <u>console</u>
     */
    private void printOut() {
        System.out.print("Hello World:"+dateOfCall);
    }

    /**
     * main entry point of our test. Just creates ...
     *
     * @param args not used here
     */
    public static void main(String[] args) {
        HelloWorld1 myNewClass = new HelloWorld1();
        myNewClass.printOut();
    }
}
