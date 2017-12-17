import java.util.Date;

public class HelloWorld1ShallowCopy implements Cloneable {
    Date dateOfCall;

    HelloWorld1ShallowCopy() {
        dateOfCall = new Date();
    }

    private void printOut() {
        System.out.println("Hello World"+dateOfCall+", date id="+System.identityHashCode(dateOfCall));
    }

    public static void main(String[] args)
        throws CloneNotSupportedException {
        HelloWorld1ShallowCopy myNewClass = new HelloWorld1ShallowCopy();
        myNewClass.printOut();
        // clone isn't being overriden yet -> shallow copy
        HelloWorld1ShallowCopy myNewerClass = (HelloWorld1ShallowCopy) myNewClass.clone();
        myNewerClass.printOut();
    }
}