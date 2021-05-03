package Bai_3_Mang.Thuc_hanh;

public class Tim_gia_tri_nho_nhat {

    public static void main(String[] args) {
        int []arr = {4,12,7,8,1,6,9};
        int index = 0;
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
                if(min > arr[i]){
                    min = arr[i];
                    index=i;
                }
            }
            System.out.println(min+" vi tri "+index);
        }
    }

