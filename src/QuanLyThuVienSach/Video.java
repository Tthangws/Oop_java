package QuanLyThuVienSach;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 4:22 PM
 */
public class Video extends TaiLieu{


    protected double thoiLuong;
    Video(String maTaiLieu, String tenNhaXuatban, int soTrang,double thoiLuong) {
        super(maTaiLieu, tenNhaXuatban, soTrang);
        this.thoiLuong=thoiLuong;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin(); //dung supper de hien thi nhưng gi ben lop cha sau do moi them những gì muốn thêm bên dưới
        System.out.println("Thoi luong video: "+thoiLuong+"phut");
    }
}
