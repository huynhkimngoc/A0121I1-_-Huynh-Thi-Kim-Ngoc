package Bai_3_Mang.Thuc_hanh;

import java.util.Scanner;
//Ứng dụng cho phép nhập vào lần lượt các phần tử của một mảng
// (tối đa là 20 phần tử) và sau đó đảo ngược thứ tự của các phần tử.
public class Dao_nguoc_phan_tu {
    public static void main(String[] args) {
        System.out.println("The application reverse the element of the array");
        //khai bao bien, nhap va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        //nhap gia tri cho cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        //in ra mang da nhap
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        //dao nguoc phan tu trong mang
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //in ra mang sau khi dao nguoc phan tu
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
