package Trenlop;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 10:08 AM
 */
public class GiaiPTBacNhat {
    public static double giaiPT(double A,double B,double X){
        X = -B/A;
        return X;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== GIAI PHUONG TRINH AX + B = 0 =====");
        System.out.println("Nhap A : ");
        double A = sc.nextDouble();
        System.out.println("Nhap B : ");
        double B = sc.nextDouble();
        double X = 0;
        System.out.println("X = "+giaiPT(A,B,X));
    }
}
