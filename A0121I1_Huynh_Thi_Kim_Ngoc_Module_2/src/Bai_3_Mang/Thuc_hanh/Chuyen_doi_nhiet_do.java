package Bai_3_Mang.Thuc_hanh;

import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    //xay dung phuong thuc chuyen doi nhiet do C sang do F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    //xay dung phuong thuc chuyen doi tu do F sang do C
    public static double farenheitToCelsius(double fahrenheit){
    double celsius = (9.0 / 5) * fahrenheit + 32;
     return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + farenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}

