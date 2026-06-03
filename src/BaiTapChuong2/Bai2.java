package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 4:49 PM
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ky : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" la so chan !");
        }
        else {
            System.out.println(a+" la so le !");
        }
    }
}
