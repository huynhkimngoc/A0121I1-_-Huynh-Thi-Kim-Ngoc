package Bai_3_Mang.Thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        //khai bao bien, nhap va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("Size should not exceed 20");
        } while (size > 5);
        //nhap gia tri cho cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        //in ra danh sach tai san da nhap
        System.out.print("Property list:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //duyet cac phan tu trong mang de tim GTLN va vi tri
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
