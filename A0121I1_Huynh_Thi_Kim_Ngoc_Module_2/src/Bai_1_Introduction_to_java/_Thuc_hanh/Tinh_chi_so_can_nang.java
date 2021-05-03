package Bai_1_Introduction_to_java._Thuc_hanh;


import java.util.Scanner;

public class Tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.println("bmi");
        if(bmi<18)
            System.out.print(bmi+"Underweight");
        else if(bmi<25.0)
            System.out.print(bmi+"Normal");
        else if(bmi<30.0)
            System.out.print(bmi+ "Overweight");
        else
            System.out.print(bmi+ "Obese");
    }
}