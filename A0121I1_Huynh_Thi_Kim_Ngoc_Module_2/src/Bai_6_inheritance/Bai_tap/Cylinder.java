package Bai_6_inheritance.Bai_tap;

public class Cylinder extends CircleClass {
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getVolume() {
        return Math.PI * this.hight * super.getRadius() * super.getRadius();
    }

    @Override
    public String toString() {
        return "Chieu cao"
                + getHight() + "The tich" + getVolume() +super.toString();
    }
}