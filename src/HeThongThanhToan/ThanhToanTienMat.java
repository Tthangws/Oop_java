package HeThongThanhToan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 2:35 PM
 */
public class ThanhToanTienMat implements IThanhToan {
    @Override
    public double thanhToan(double soTien) {
        System.out.println("Thanh toan tien mat khong giam gia = "+soTien+" VND");
        return soTien;
    }
}
