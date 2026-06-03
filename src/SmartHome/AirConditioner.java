package SmartHome;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:55 PM
 */
public class AirConditioner implements SwitchAble{
    @Override
    public void turnON() {
        System.out.println("Điều hòa đang chạy !");
    }

    @Override
    public void turnOff() {
        System.out.println("Điều hòa tắt !");
    }
}
