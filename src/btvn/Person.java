package btvn;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 12:42 PM
 */
public class Person {
    private String ten;
    private int tuoi;
    private String gioiTinh;

    //constructer
    protected Person(String ten, int tuoi, String gioiTinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
}
