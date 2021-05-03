package Bai_1_Introduction_to_java.bai_tap;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền:");
        usd = scanner.nextDouble();
        double quydoi = usd*23000;
        System.out.println("Giá trị VND:" + quydoi);
    }
}
