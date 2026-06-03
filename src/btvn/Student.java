package btvn;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 12:44 PM
 */
public class Student extends Person{
    private String msv;
    Student(String ten, int tuoi, String gioiTinh,String msv) {
        super(ten, tuoi, gioiTinh);
        this.msv = msv;
    }
}
