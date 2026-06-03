package SmartHome;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:53 PM
 */
public class LightBulb implements SwitchAble{

    @Override
    public void turnON() {
        System.out.println("Đèn đang sáng lên !");
    }

    @Override
    public void turnOff() {
        System.out.println("Đèn đang tắt !");
    }
}
