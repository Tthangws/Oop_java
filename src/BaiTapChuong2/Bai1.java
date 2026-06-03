package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 4:23 PM
 */
public class Bai1 {
    /*
    Viết chương trình nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:
    1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
    2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //y 1
        System.out.println("Nhap 2 so bat ky : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double tong=a+b, hieu=a-b, tich=a*b, thuong=a/b, chiaLayDu=a%b;
        System.out.println("Tong : "+tong+" | Hieu : "+hieu+" | Tich : "+tich+" |\n Thuong : "+thuong+" | Chia lay du : "+chiaLayDu);

        //y 2
        if(a>b){
            System.out.println(a+" lon hon "+b);
        }
        else if(a<b){
            System.out.println(a+" be hon "+b);
        }
        else {
            System.out.println(a+" bang "+b);
        }
    }
}
