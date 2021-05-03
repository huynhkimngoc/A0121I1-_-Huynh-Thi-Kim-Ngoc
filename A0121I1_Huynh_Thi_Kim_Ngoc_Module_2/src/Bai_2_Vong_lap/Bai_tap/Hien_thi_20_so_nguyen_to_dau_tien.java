package Bai_2_Vong_lap.Bai_tap;

import java.util.Scanner;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        System.out.println("20 prime numbers:");
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        int count;
        for (int x = 2; ; x++) {
            count = 0;
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    count++;
            if (count == 2) {
                if (temp == 20) break;
                System.out.print(x+ " ");
                temp++;
            }
        }
    }
}

