package GiaDinhSieuNhan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 * TIME: 6:39 PM
 */
public class Nguoicon extends Nguoicha{

    Nguoicon(String biMatGiaDinh, double quyden) {
        super(biMatGiaDinh, quyden);
    }
    public void tietLoBiMat(){
        System.out.println("bi mat cua gia dinh ma nguoi con da tiet lo la : "+biMatGiaDinh);

    }
//    public void tieuTienCuaBo(){
//        System.out.println(quyden);
//    }
    // bij loi vi quy den la private
}
