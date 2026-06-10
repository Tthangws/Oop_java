package lamdeoopjavacuoiky;

import Trenlop.Tong2so;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/10/2026
 * TIME: 4:15 AM
 */
public class sanphamm {
    public static void main(String[] args) {
        String maSanPham;
        String tenSanPham;
        double donGia;
        int soLuong;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        maSanPham = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();

        double tongtien = donGia*soLuong;
        System.out.print("tong tien = "+ tongtien);
        if(tongtien > 1000000){
            System.out.println("Do hóa đơn lớn hơn 1tr VND nên sẽ đc giảm giá 10% !");
            System.out.println("Tổng tiền phải trả = "+(tongtien*0.10));
        }
    }
}
