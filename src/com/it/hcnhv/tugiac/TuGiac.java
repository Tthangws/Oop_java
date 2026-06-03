package com.it.hcnhv.tugiac;

import com.it.hcnhv.dinh.Dinh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/8/2026
 * TIME: 3:29 PM
 */
public abstract class TuGiac {
    Dinh dinhA, dinhB, dinhC, dinhD;

    public TuGiac(Dinh dinhA, Dinh dinhB, Dinh dinhC, Dinh dinhD){
        this.dinhA = dinhA;
        this.dinhB = dinhB;
        this.dinhC = dinhC;
        this.dinhD = dinhD;
    }
    abstract double tinhChuVi();
    abstract double tinhDienTich();

    void inTT(){
    }
}
