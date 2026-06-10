package lamdeoopjavacuoiky;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 3:11 PM
 */
public class sanpham {
    Scanner sc = new Scanner(System.in);
    private String maSanPham;
    private String tenSanPham;
    private double donGia;
    private int soLuong;

    public void nhapTT(){
        System.out.print("Nhap ma sp: ");
        maSanPham = sc.nextLine();
        System.out.print("ten sp: ");
        tenSanPham = sc.nextLine();
        System.out.print("don gia: ");
        donGia = sc.nextDouble();
        System.out.print("so luong: ");
        soLuong = sc.nextInt();
    }

    public double tongHoaDon(){
        return donGia * soLuong;
    }

    public static void main(String[] args) {
        sanpham sp = new sanpham();
        sp.nhapTT();
        System.out.println("tong tien: "+sp.tongHoaDon());
    }
}
