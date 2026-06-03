package TuHoc;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class Den {
    boolean trangThai;
    public void batDen(){
        trangThai=true;
        System.out.println("Da bat den sang trung !");
    }

    public void tatDen(){
        trangThai=false;
        System.out.println("TuHoc.Den da tat, toi thui !");
    }

    public void kiemTra(){
        if(trangThai){
            System.out.println("TuHoc.Den dang sang !");
        }
        else {
            System.out.println("TuHoc.Den dang tat !");
        }
    }

    public static void main(String[] args) {
        Den light=new Den();
        light.batDen();
        light.kiemTra();
        light.tatDen();
        light.kiemTra();
    }
}
