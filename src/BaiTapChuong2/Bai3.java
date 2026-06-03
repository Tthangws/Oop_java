package BaiTapChuong2;

import java.time.Year;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 4:51 PM
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban : ");
        String ten=sc.nextLine();
        System.out.println("Nhap nam : ");
        int nam=sc.nextInt();
        int tuoi = 2026 - nam;

        if(tuoi<16){
            System.out.println("Ban "+ten+" o do tuoi vi thanh nien !");
        }
        else if(tuoi>=16&&tuoi<18){
            System.out.println("ban "+ten+" o do tuoi truong thanh !");
        }
        else {
            System.out.println("Ban "+ten+" da gia !");
        }
    }
}
