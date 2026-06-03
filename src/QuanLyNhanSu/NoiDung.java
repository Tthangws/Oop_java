package QuanLyNhanSu;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 3:48 PM
 */
public class NoiDung {
    public static void main(String[] args) {
        NhanVien NV=new NhanVien("nguyen trong thang",30);
        TruongPhong TP=new TruongPhong("nguyen trong duc",50);


        System.out.println("luong cua nhan vien : "+NV.tinhLuong()+"tr");
        System.out.println("luong cua truong phong : "+TP.tinhLuong()+"tr");
    }
}
