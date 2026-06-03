package He_Thong_Tinh_Sat_Thuong;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 7:19 PM
 */
public class TrueDamage extends Damage{

    public TrueDamage(double amount) {
        super(amount);
    }

    @Override
    public double caculateDamage(double targetArmor) {
        return getAmount();
    }
}
