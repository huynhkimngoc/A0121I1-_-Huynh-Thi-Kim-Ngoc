package Bai_3_Mang.Bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = {3,24,3,1,3,54,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" "+arr[i]);
        }
        int dem=0;
        System.out.println("Nhap gia tri muon xoa : ");
        int value=scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                dem++;
            }
        }
        int[] arrNew=new int[arr.length-dem];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                continue;
            }
            arrNew[k]=arr[i];
            k++;
        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf(" "+arrNew[i]);
        }
    }
}
