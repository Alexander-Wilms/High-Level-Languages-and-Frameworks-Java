//The factory for V15 Button
class FactoryV15 implements GUIFactorylike {
    public Buttonlike createButton() {
        return new V15Button();
    }
}
