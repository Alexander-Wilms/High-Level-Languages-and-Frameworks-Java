import java.util.Date;

public class HelloWorld2 {
    static int count;
    Date dateOfCall;

    public static void main(String[] args) {
        // no argument -> current date
        HelloWorld2 myNewClass = new HelloWorld2();
        myNewClass.printOut();
        // 0 ms since 1970
        HelloWorld2 myNewerClass = new HelloWorld2(new Date(0));
        myNewerClass.printOut();
    }

    private void init(Date dateOfCall) {
        count++;
        if(dateOfCall == null) {
            this.dateOfCall = new Date();
        } else {
            this.dateOfCall = dateOfCall;
        }
    }

    HelloWorld2() {
        init(null);
    }

    HelloWorld2(Date dateOfCall) {
        init(dateOfCall);
    }

    private void printOut() {
        System.out.println("Hello World:"+dateOfCall);
    }

    public String toString() {
        return dateOfCall.toString();
    }
}
