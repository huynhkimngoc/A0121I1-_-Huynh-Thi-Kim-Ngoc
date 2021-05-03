package Bai_3_Mang.Thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        //khai bao mang chua danh sach ten sinh vien
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        //khai bao bien luu ten tim kiem va gan voi gia tri nhap vao
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String name = scanner.nextLine();
        //duyet mang sinh vien da khai bao o tren, tim phan tu co gia tri bang voi ten da nhap vao
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) { //equals so sanh bang bang trong chuoi
                System.out.println("Position of the students in the list" + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + name + " in the list.");
    }
}
