package HeThongThanhToan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 2:38 PM
 */
public class NoiDung {
    public static void main(String[] args) {
        DonHang don1 = new DonHang("M98", 1000000); // 1 triệu

        IThanhToan cach1 = new ThanhToanTienMat();
        IThanhToan cach2 = new ThanhToanOnline();

        System.out.println("Mã đơn: " + don1.maDon);

        // Gọi hàm và HỨNG lấy giá trị trả về (nếu muốn dùng sau này)
        double ketQua1 = cach1.thanhToan(don1.soTienCanThanhToan);

        // Hoặc gọi trực tiếp như bạn cũng được (vì bên trong hàm đã có lệnh in rồi)
        cach2.thanhToan(don1.soTienCanThanhToan);
    }
}
