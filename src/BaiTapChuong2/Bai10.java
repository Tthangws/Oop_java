package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/5/2026
 * TIME: 3:13 PM
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi <= 80 ky tu : ");
        String ch = sc.nextLine();
        ch=ch.toLowerCase();

        if(ch.length()>80){
            System.out.println("CHuoi vuot qua 80 ky tu !");
        }
        else {
            System.out.println("Nhap 1 ky tu bat ky : ");
            String kyTu = sc.nextLine();
            int countXuatHien = 0;
            for(int i = 0;i < ch.length();i++){
                if(kyTu.charAt(0)==ch.charAt(i)){
                    countXuatHien++;
                }
            }
            System.out.println("So lan xuat hien ky tu ' "+kyTu+" ' trong chuoi ' "+ch+" '\n la : "+countXuatHien+" lan !");

        }
    }
}
