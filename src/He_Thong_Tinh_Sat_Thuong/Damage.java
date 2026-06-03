package He_Thong_Tinh_Sat_Thuong;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 7:14 PM
 */
public abstract class Damage {
    private double amount; // luong sat thuong

    //constructer
    public Damage(double amount){
        this.amount = amount;
    }
    public abstract double caculateDamage(double targetArmor);

    public double getAmount() {
        return amount;
    }
}
