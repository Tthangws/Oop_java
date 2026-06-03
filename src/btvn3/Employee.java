package btvn3;

import btvn.Person;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 12:45 PM
 */
public class Employee extends Person {
    private double luongCoBan;
    private double hesoCoBan;
    public Employee(String ten, int tuoi, String gioiTinh, double luongCoBan, double heSoCoBan) {
        super(ten, tuoi, gioiTinh);
        this.hesoCoBan = heSoCoBan;
        this.luongCoBan = luongCoBan;
    }
    //tinh nang tinh luong
    public double TinhLuong(){
        return hesoCoBan*luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHesoCoBan() {
        return hesoCoBan;
    }


    //ham in tt
    public void inTT() {
        System.out.println("Tên: " +getTen()+" || Lương: "+TinhLuong() );
        System.out.println("Tuổi: "+getTuoi()+" || Giới tính: "+getGioiTinh());
        System.out.println("Lương cơ bản: "+getLuongCoBan()+" || Hệ số cơ bản: "+getHesoCoBan());
        System.out.println(" ");
    }
}
