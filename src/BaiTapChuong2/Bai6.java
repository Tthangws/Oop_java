package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 5:08 PM
 */
public class Bai6 {
    public static int GiaiThua(int n){
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * GiaiThua(n - 1);
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen bat ky : ");
            int a = sc.nextInt();
                System.out.println("Giai thua cua " + a + " = " + GiaiThua(a));
            }
}
