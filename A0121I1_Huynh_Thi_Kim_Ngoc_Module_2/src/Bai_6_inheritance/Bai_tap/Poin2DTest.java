package Bai_6_inheritance.Bai_tap;

public class Poin2DTest {
    public static void main(String[] args) {
        Point2D p = new Point2D(3.5f,4);
        System.out.println(p.toString());
        p.setXY(5,6.2f);
        System.out.println(p.getXY());
        System.out.println(p.toString());
    }
}
