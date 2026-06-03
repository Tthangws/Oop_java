package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 5:07 PM
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,sum=0;
        do {
            System.out.println("nhap 1 so nguyen bat ky : ");
            number = sc.nextInt();
            sum += number;
        } while(sum<100);
        System.out.println("tong cac so nguyen vua nhap = "+sum);
    }
}
