package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 5:27 PM
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so luong so nguyen ban muon nhap : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int trungBinhCong=0;
        for(int i=0;i<n;i++){
            System.out.print("So nguyen thu "+(i+1)+" : ");
            a[i]=sc.nextInt();
            trungBinhCong=trungBinhCong+a[i];
        }
        System.out.println("Trung binh cong cac so vua nhap la : "+trungBinhCong);

    }
}
