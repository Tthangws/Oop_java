package com.it.hcnhv.tugiac;

import com.it.hcnhv.dinh.Dinh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/8/2026
 * TIME: 3:29 PM
 */
public class HinhVuong extends TuGiac {

    public HinhVuong(Dinh dinhA, Dinh dinhB, Dinh dinhC, Dinh dinhD) {
        super(dinhA, dinhB, dinhC, dinhD);
    }

    double tinhDoDaiCanh(){
        // Giả sử các đỉnh được nhập theo thứ tự vòng tròn
        return dinhA.tinhKhoangCach(dinhB);
    }

    @Override
    double tinhChuVi() {
       return 4*tinhDoDaiCanh();
    }

    @Override
    double tinhDienTich() {
        return tinhDoDaiCanh()*tinhDoDaiCanh();
    }

    @Override
    public void inTT(){
        System.out.println("=== HÌNH VUÔNG ===");
        System.out.println("Độ dài cạnh: " + tinhDoDaiCanh());
        System.out.println("Chiều dài: " + tinhDoDaiCanh());
        System.out.println("Chiều rộng: " + tinhDoDaiCanh());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }
}
