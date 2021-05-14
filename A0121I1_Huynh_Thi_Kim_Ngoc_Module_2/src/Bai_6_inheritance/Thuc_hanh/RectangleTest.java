package Bai_6_inheritance.Thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle("blue",false, 2.3, 4.5);
        System.out.println(rectangle);
    }
}
