package BaiTapCoGiao;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class TongSonguyen {
    /*Viết chương trình nhập vào 1 số
    nguyên n bất kỳ (n > 0) và tính
    tổng các chữ số của số đó.

     */
    public static void main(String[] args) {
        int n,sodu,tong=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen duong bat ky : ");
        n=sc.nextInt();
        while(n>0){
            sodu=n%10;
            tong=tong+sodu;
            n=n/10;
        }
        System.out.println("tong cac chu so = "+tong);

    }

}
