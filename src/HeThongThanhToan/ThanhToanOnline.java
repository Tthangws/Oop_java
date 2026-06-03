package HeThongThanhToan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 2:36 PM
 */
public class ThanhToanOnline implements IThanhToan{
    @Override
    public double thanhToan(double soTien){
        System.out.println("Thanh toan online, da giam gia 5% = "+(soTien*0.95)+" VND");
        return soTien*0.95;
    }
}
