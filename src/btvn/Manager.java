package btvn;

import btvn3.Employee;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 12:44 PM
 */
public class Manager extends Employee {
    private double luongTrachNhiem;
    Manager(String ten, int tuoi, String gioiTinh, double luongCoBan, double heSoCoBan, double luongTrachNhiem) {
        super(ten, tuoi, gioiTinh, luongCoBan, heSoCoBan);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    //tinh luong

    @Override
    public double TinhLuong() {
        return super.TinhLuong()+luongTrachNhiem;
    }
}
