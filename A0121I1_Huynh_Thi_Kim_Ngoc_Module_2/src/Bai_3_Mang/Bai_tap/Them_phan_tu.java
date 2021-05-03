package Bai_3_Mang.Bai_tap;

import java.util.Scanner;

public class Them_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i]);
        }
        System.out.println("Enter X:");
        int x = scanner.nextInt();
        System.out.println("Enter index:");
        int index = scanner.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Can't add element into array");
            System.exit(0);
        }
        for (int i = arr.length - 1; i >= index + 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        System.out.println("Array after adding" + x + "at index" + index + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i]);
        }
    }
}
