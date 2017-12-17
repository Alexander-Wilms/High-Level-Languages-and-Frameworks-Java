//The factory for other Button
class FactoryOther implements GUIFactorylike {
    public Buttonlike createButton() {
        return new OtherButton();
    }
}
