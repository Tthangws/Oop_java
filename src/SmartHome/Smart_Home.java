package SmartHome;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:57 PM
 */
public class Smart_Home {
   private ArrayList<SwitchAble> device;
    //constructer
    Smart_Home(){
        this.device = new ArrayList<>();
    }
    //ham them thiet bi
    public void addDevice(SwitchAble device){
        this.device.add(device);
        System.out.println("Đã thêm thành công !");
    }

    // ham bat tat ca thiet bi
    public void turnOnAll(){
        for(SwitchAble i : device){
            i.turnON();
        }
    }

    //ham tat tat ca thiet bi
    public void turnOffAll(){
        for(SwitchAble i : device){
            i.turnOff();
        }
    }
}
