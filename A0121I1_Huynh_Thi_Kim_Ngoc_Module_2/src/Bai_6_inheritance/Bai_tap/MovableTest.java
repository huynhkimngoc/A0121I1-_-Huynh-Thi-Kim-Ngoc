package Bai_6_inheritance.Bai_tap;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint m = new MovablePoint(2.3f, 4.5f, 6.7f,5);
        System.out.println(m.toSting());
        Point t;
        t = m.move();
        System.out.println(m.toString());
        System.out.println(t.toString());
    }
}
