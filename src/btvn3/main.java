package btvn3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 2:27 PM
 */
public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên: ");
        int a = sc.nextInt();
        ArrayList<SINHVIEN> dssv = new ArrayList<>();
        System.out.println("==== Nhập thông tin sinh viên ====");
        for (int i = 0; i < a; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " :");
            SINHVIEN sv = new SINHVIEN();
            sv.nhapTT();
            dssv.add(sv);
        }

        SINHVIEN sv = new SINHVIEN();
        //tim sv co ddiem cao nhat

        double caoNhat = 0;
        for (SINHVIEN i : dssv) {
            if (i.diemTBMonHoc() > caoNhat) {
                caoNhat = i.diemTBMonHoc();
            }
        }

        //sap xep sv theo diem tb giam dan
        for(int i = 0 ; i < dssv.size() - 1 ; i++){
            for(int j = 0 ; j < dssv.size() - i - 1 ; j++){
                double diemTB1 = dssv.get(j).diemTBMonHoc();
                double diemTB2 = dssv.get(j+1).diemTBMonHoc();

                if(diemTB1 < diemTB2 ){
                    SINHVIEN temp = dssv.get(j);
                    dssv.set(j,dssv.get(j+1));
                    dssv.set(j+1,temp);
                }
            }
        }

        //in TT
        System.out.println("===== THÔNG TIN SINH VIÊN =====");
            for(SINHVIEN i: dssv) {
                System.out.println("Họ tên: " + i.getTen() + " || mã sinh viên: " + i.getMsv());
                System.out.println("Năm sinh: " + i.getNamsinh() + " || Điểm TB: " + i.diemTBMonHoc());
            }
        System.out.println("Sinh viên có điểm TB cao nhất: "+caoNhat);
    }
}