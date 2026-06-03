package btvn3;

import btvn.MONHOC;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 2:08 PM
 */
public class SINHVIEN extends NGUOI{
    private String msv;
    ArrayList<MONHOC>danhsach = new ArrayList<>();
    @Override
    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhập msv: ");
        msv = sc.nextLine();

        System.out.print("Nhập số lượng môn học:");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Môn thứ "+(i+1)+" :");
            MONHOC mh = new MONHOC();
            mh.nhapTT();
            sc.nextLine();
            danhsach.add(mh);
        }
    }
    //phuong thuc tinh diem trung binh cac mon hoc
    public double diemTBMonHoc(){
        if(danhsach==null){
            return 0;
        }
        double tong = 0;
        for(MONHOC i : danhsach)
            tong+= i.getDiemMonHoc();
        return tong/danhsach.size();
    }

    public String getMsv() {
        return msv;
    }
}
