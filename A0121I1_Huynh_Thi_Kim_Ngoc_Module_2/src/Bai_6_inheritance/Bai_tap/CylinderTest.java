package Bai_6_inheritance.Bai_tap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2.2);
        System.out.println(cylinder);
        cylinder = new Cylinder(2.2, "red",3.2);
        System.out.println(cylinder);
    }
}
