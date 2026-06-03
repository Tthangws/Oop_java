package He_Thong_Tinh_Sat_Thuong;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 7:14 PM
 */
public class PhysicalDamage extends Damage{
    public PhysicalDamage(double amount) {
        super(amount);
    }

    @Override
    public double caculateDamage(double targetArmor) {
        double realDamage = getAmount() - targetArmor;
        return realDamage > 0 ? realDamage : 0;
    }


}
