package btvn;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 2:08 PM
 */
public class MONHOC {
    private String maMonHoc;
    private String tenMonHoc;
    private double diemMonHoc;

    static Scanner sc = new Scanner(System.in);
    //phuong thuc
    public void nhapTT(){
        System.out.print("Nhập tên môn học: ");
        tenMonHoc = sc.nextLine();
        System.out.print("Mã môn học: ");
        maMonHoc = sc.nextLine();
        System.out.print("Điểm môn học: ");
        diemMonHoc = sc.nextDouble();
        sc.nextLine();
    }

    public double getDiemMonHoc() {
        return diemMonHoc;
    }
}
