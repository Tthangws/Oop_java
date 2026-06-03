package SmartHome;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:54 PM
 */
public class Fan implements SwitchAble{
    @Override
    public void turnON() {
        System.out.println("Quạt quay vù vù !");
    }

    @Override
    public void turnOff() {
        System.out.println("Quạt đang tắt !");
    }
}
