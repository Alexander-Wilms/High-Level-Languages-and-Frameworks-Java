public class ApplicationRunner {
    public static void main(String[] args) {
        new Application(
                createButtonSpecificFactory());
    }
    public static GUIFactorylike
    createButtonSpecificFactory() {
        if (System.getProperty("java.version").
                startsWith("1.5."))
            return new FactoryV15();
        else
            return new FactoryOther();
    }
}
