package Trenlop;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 9:49 AM
 */
public class INNgayCuaThang {
    //thuoc tinh
    private int n;
    //constructer
    INNgayCuaThang(int n){
        this.n = n;
    }
    //phuong thuc
    public  void inSoNgay(){
        switch (this.n){
            case 1:
                System.out.println("Thang 1 co 31 ngay !");
                break;
            case 2:
                System.out.println("Thang 2 co 28 ngay !");
                break;
            case 3:
                System.out.println("Thang 3 co 31 ngay !");
                break;
            case 4:
                System.out.println("Thang 4 co 30 ngay !");
                break;
            case 5:
                System.out.println("Thang 5 co 31 ngay !");
                break;
            case 6:
                System.out.println("Thang 6 co 30 ngay !");
                break;
            case 7:
                System.out.println("Thang 7 co 31 ngay !");
                break;
            case 8:
                System.out.println("Thang 8 co 31 ngay !");
                break;
            case 9:
                System.out.println("Thang 9 co 30 ngay !");
                break;
            case 10:
                System.out.println("Thang 10 co 31 ngay !");
                break;
            case 11:
                System.out.println("Thang 11 co 30 ngay !");
                break;
            case 12:
                System.out.println("Thang 12 co 31 ngay !");
                break;
            default:
                System.out.println("Oops...! Da co loi xay ra vui long nhap lai !");
        }
    }

    public static void main(String[] args) {
        //khoi tao
        INNgayCuaThang in = new INNgayCuaThang(11);
        in.inSoNgay();

    }
}
