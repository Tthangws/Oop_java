package QuanLyNhanSu;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 3:43 PM
 */
public class TruongPhong extends NhanVien{
    private double phuCapTrachNhiem=7;

    TruongPhong(String ten, double luongCoBan) {
        super(ten, luongCoBan);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan+phuCapTrachNhiem;
    }
}
