package de.h_da.eit.dr.java.FlatObject;

public class FlatObject {
    private double area;

    void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Area="+area;
    }
}
