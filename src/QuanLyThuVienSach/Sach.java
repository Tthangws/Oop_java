package QuanLyThuVienSach;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 4:43 PM
 */
public class Sach extends TaiLieu {
    protected String tenTacGia;
    int soTrang;

    Sach(String maTaiLieu, String tenNhaXuatban, int soBanPhatHanh,String tenTacGia,int soTrang) {
        super(maTaiLieu, tenNhaXuatban, soBanPhatHanh);
        this.tenTacGia=tenTacGia;
        this.soTrang=soTrang;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Ten tac gia: "+tenTacGia+" | So trang: "+soTrang+"page");
    }


}
