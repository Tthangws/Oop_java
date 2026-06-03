package com.it.hcnhv.tugiac;

import com.it.hcnhv.dinh.Dinh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/8/2026
 * TIME: 3:29 PM
 */
public class HinhChuNhat extends TuGiac {

    public HinhChuNhat(Dinh dinhA, Dinh dinhB, Dinh dinhC, Dinh dinhD) {
        super(dinhA, dinhB, dinhC, dinhD);
    }

    double tinhchieudai(){
        double canh1 = dinhA.tinhKhoangCach(dinhB);
        double canh2 = dinhB.tinhKhoangCach(dinhC);
        return Math.max(canh1, canh2);
    }
    double tinhchieurong(){
        double canh1 = dinhA.tinhKhoangCach(dinhB);
        double canh2 = dinhB.tinhKhoangCach(dinhC);
        return Math.min(canh1, canh2);
    }

    @Override
    double tinhChuVi() {
        return 2 * (tinhchieudai() + tinhchieurong());
    }

    @Override
    double tinhDienTich() {
        return tinhchieudai()*tinhchieurong();
    }

    @Override
    public void inTT(){
        System.out.println("=== HÌNH CHỮ NHẬT ===");
        System.out.println("Chiều dài: " + tinhchieudai());
        System.out.println("Chiều rộng: " + tinhchieurong());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }
}
