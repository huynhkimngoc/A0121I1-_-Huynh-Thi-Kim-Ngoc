package Bai_4_Class_OOP.Bai_tap;

public class ClassMain3 {
    public static void main(String[] args) {
        FanClass fanClass = new FanClass(3, true, 10, "yellow");
        System.out.println(fanClass.toString());
        FanClass fanClass1 = new FanClass(2, false, 5, "blue");
        System.out.println(fanClass1.toString());
    }
}
