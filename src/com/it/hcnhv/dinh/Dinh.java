package com.it.hcnhv.dinh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/8/2026
 * TIME: 3:28 PM
 */
public class Dinh {
    double x, y;

    public Dinh(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double tinhKhoangCach(Dinh d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
    }
}
