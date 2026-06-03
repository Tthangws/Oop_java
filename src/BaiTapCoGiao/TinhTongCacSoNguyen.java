package BaiTapCoGiao;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class TinhTongCacSoNguyen {
    /*Viết chương trình nhập vào các số
    nguyên và tính tổng các số đó, nếu
    tổng lớn hơn > 100 thì kết thúc
    vòng lặp và hiển thị thông báo tổng
    của các số đã nhập
     */
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
