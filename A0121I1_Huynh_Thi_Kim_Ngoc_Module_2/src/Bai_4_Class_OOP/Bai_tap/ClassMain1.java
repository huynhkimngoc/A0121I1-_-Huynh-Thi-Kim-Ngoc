package Bai_4_Class_OOP.Bai_tap;

import java.util.Scanner;

public class ClassMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        double a = scanner.nextDouble();

        System.out.println("Input :b");
        double b = scanner.nextDouble();

        System.out.println("Input c:");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() > 0) {
            System.out.println("phuong trinh co 2 nghiem" + equation.getRoot1() + "va" + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("phuong trinh co 1 nghiem" + equation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
