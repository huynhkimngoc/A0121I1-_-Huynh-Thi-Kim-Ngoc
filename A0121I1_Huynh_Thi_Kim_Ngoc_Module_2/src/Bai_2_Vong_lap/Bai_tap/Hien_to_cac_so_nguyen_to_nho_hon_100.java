package Bai_2_Vong_lap.Bai_tap;

public class Hien_to_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers < 100: ");
        int count;
        for (int x = 2; ; x++) {
            count = 0;
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    count++;
            if (count == 2) {
                if (x >=100) break;
                System.out.print(x+ " ");
            }
        }
    }
}
