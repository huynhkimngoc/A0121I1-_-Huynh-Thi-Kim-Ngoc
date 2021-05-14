package Bai_6_inheritance.Bai_tap;

public class Point3DTest {
    public static void main(String[] args) {
//        Point3DTest p3D = new Point3DTest(11.2f, 1.3f,0.4f);
//        System.out.println(p3D.toString());
        Point3D p = new Point3D(4.5f, 6, 3.2f);
        System.out.println(p.toString());
        p.setXY(5,6.2f);
        System.out.println(p.getXY());
        System.out.println(p.toString());
        p.setXYZ(9.8f, 4, 2.1f);
        System.out.println(p.getXYZ());
        System.out.println(p.toString());
    }
}
