package btvn;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 12:44 PM
 */
public class Programmer extends Student{
    private int soNamKinhNghiem;
    Programmer(String ten, int tuoi, String gioiTinh, String msv, int soNamKinhNghiem) {
        super(ten, tuoi, gioiTinh, msv);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
}
