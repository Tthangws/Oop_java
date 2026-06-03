package QuanLyThuVienSach;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 4:15 PM
 */
public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNhaXuatBan;
    int soBanPhatHanh;
    //ham constructer
    TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh){
        this.maTaiLieu=maTaiLieu;
        this.tenNhaXuatBan=tenNhaXuatBan;
        this.soBanPhatHanh=soBanPhatHanh;
    }
    //ham
    public void hienThiThongTin(){
        System.out.println("Ma tai lieu: "+maTaiLieu+" | So ban phat hanh: "+soBanPhatHanh+" | Ten nha xuat ban: "+tenNhaXuatBan);
    }
    //ham lay ma tai lieu

    public String getMaTaiLieu() {
        return maTaiLieu;
    }
}
