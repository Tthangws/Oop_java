package Trenlop;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:43 PM
 */
public class Tong2so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int soA = sc.nextInt();
        System.out.print("Nhap b : ");
        int soB = sc.nextInt();
        System.out.println("Tong 2 so vua nhap la : "+(soA + soB));
    }
}
