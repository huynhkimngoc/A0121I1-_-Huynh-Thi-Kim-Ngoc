package Bai_5_access_modifier.Bai_tap;

public class Circle {
    private double radius =1.0;
    private String color = "red";
    Circle(){

    }
    Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.14;
    }
}
