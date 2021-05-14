package Bai_5_access_modifier.Thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap n:");
            n = scanner.nextInt();
        }while (n<1);
        for(int i =1; i<=n; i++){
            sum += (float)(1/i);
        }
        System.out.println("Tong la:" + sum);

    }
}
