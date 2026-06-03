package btvn3;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 2:08 PM
 */
public class NGUOI {
    private String ten;
    private int namsinh;

    static Scanner sc = new Scanner(System.in);
    //phuong thuc
    public void nhapTT(){
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Năm sinh: ");
        namsinh = sc.nextInt();
        sc.nextLine();
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }
}
