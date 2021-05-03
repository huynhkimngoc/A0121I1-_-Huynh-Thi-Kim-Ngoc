package Bai_4_Class_OOP.Thuc_hanh;

public class ClassMain {
    public static void main(String[] args) {
        LopHinhchunhat hinhchunhat = new LopHinhchunhat();
        hinhchunhat.setchieuDai(10);
        hinhchunhat.setchieuRong(20);
        System.out.println("Dien tich la:" + hinhchunhat.dienTich());
        System.out.println("Chu vi la:" + hinhchunhat.chuVi());
    }
}
