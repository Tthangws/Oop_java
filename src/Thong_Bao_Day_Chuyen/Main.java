package Thong_Bao_Day_Chuyen;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 6:56 PM
 */
public class Main {
    public static void main(String[] args) {
        Sprinkler sp1 = new Sprinkler();
        FireAlarm fa1 = new FireAlarm();
        AutoDoor ad1 = new AutoDoor();
        FireSensor fs = new FireSensor();

        fs.connectDevice(sp1);
        fs.connectDevice(fa1);
        fs.connectDevice(ad1);

        fs.detectTemperature(80);
    }
}
