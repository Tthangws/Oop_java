package Thong_Bao_Day_Chuyen;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 6:36 PM
 */
public class FireSensor {
    //cảm biến nhiệt
    private final ArrayList<SmartDevice>connectedDevices;
    //khởi taạo mảng bằng constructer
    public FireSensor(){
        this.connectedDevices = new ArrayList<>();
    }

    //hàm cắm các thiết bị vào cảm biến
    public void connectDevice(SmartDevice d){
        connectedDevices.add(d);
        System.out.println("Đã cắm thiết bị vào cảm biến thành công!");
    }

    //hàm cảm biến nhiệt
    public void detectTemperature(int temp){
        if(temp > 70){
            System.out.println("=========== CHÁY !!! CHÁY !!! CHÁY ============");
            for(SmartDevice d : connectedDevices){
                d.triggerAction();
            }
        }
    }
}
