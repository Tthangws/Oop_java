package SmartHome;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 3:11 PM
 */
public class Main {
    public static void main(String[] args) {
        Smart_Home smh = new Smart_Home();

        SwitchAble bongDen1 = new LightBulb();
        SwitchAble quat1 = new Fan();
        SwitchAble dieuHoa1 = new AirConditioner();

        smh.addDevice(bongDen1);
        smh.addDevice(quat1);
        smh.addDevice(dieuHoa1);
        System.out.println(" ");
        smh.turnOnAll();
        System.out.println(" ");
        smh.turnOffAll();

        bongDen1.turnON();
        quat1.turnOff();
        dieuHoa1.turnON();

    }
}
