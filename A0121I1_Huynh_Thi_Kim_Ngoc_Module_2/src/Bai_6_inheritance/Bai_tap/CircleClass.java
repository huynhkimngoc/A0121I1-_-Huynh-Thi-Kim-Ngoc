package Bai_6_inheritance.Bai_tap;

public class CircleClass {
    private double radius;
    private String color;

    public CircleClass() {
    }

    public CircleClass(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Mau sac"
                + "" + getColor()
                + "Ban kinh"
                + "" + getRadius()
                + "Dien tich"
                + "" + getArea();
    }
}
