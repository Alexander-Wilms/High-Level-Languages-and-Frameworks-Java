import java.util.Date;

public class HelloWorld1 {
    Date dateOfCall;
    HelloWorld1() {
        dateOfCall = new Date();
    }

    private void printOut() {
        System.out.print("Hello World:"+dateOfCall);
    }

    public static void main(String[] args) {
        HelloWorld1 myNewClass = new HelloWorld1();
        myNewClass.printOut();
    }

}