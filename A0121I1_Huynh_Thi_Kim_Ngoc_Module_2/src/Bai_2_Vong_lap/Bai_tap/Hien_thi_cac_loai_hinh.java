package Bai_2_Vong_lap.Bai_tap;
import java.util.Scanner;
public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);

        while(choice!= 0) {

            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle"); //The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for(int i=1; i<=3; i++){
                        for(int j=1; j<=7; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println();

                    for(int i=5; i>=1; i--){
                        for(int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");

                    for(int i=1; i<=5; i++){
                        for(int j=1; j<= 5-i; j++){
                            System.out.print(" ");
                        }
                        for(int k=1; k<=(i*2-1); k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
