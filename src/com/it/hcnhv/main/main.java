package com.it.hcnhv.main;
import com.it.hcnhv.dinh.Dinh;
import com.it.hcnhv.tugiac.HinhChuNhat;
import com.it.hcnhv.tugiac.HinhVuong;
/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/8/2026
 * TIME: 3:28 PM
 */
public class main {
    public static void main(String[] args) {
        Dinh v1 = new Dinh(0, 0);
        Dinh v2 = new Dinh(0, 2);
        Dinh v3 = new Dinh(2, 2);
        Dinh v4 = new Dinh(2, 0);
        HinhVuong hv = new HinhVuong(v1, v2, v3, v4);
        hv.inTT();

        System.out.println();

        Dinh c1 = new Dinh(0, 0);
        Dinh c2 = new Dinh(0, 3);
        Dinh c3 = new Dinh(5, 3);
        Dinh c4 = new Dinh(5, 0);
        HinhChuNhat hcn = new HinhChuNhat(c1, c2, c3, c4);
        hcn.inTT();
    }
}
