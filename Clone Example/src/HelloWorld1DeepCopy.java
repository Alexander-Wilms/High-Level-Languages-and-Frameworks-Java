import java.util.Date;

public class HelloWorld1DeepCopy implements Cloneable {
    Date dateOfCall;

    HelloWorld1DeepCopy() {
        dateOfCall = new Date();
    }

    private void printOut() {
        System.out.println("Hello World"+dateOfCall+", date id="+System.identityHashCode(dateOfCall));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        HelloWorld1DeepCopy myNewClass = new HelloWorld1DeepCopy();
        myNewClass.printOut();
        // clone isn't being overriden yet -> shallow copy
        HelloWorld1DeepCopy myNewerClass = (HelloWorld1DeepCopy) myNewClass.clone();
        myNewerClass.printOut();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        HelloWorld1DeepCopy hw1 = (HelloWorld1DeepCopy) super.clone();
        hw1.dateOfCall = (Date) dateOfCall.clone();
        return hw1;
    }
}
