package QuanLyNhanSu;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 3:37 PM
 */
public class NhanVien {
    /*Bài tập: Quản lý Nhân sự

    Tạo class cha NhanVien:

    Thuộc tính: ten, luongCoBan.

    Method: tinhLuong() trả về luongCoBan.

    Tạo class con TruongPhong kế thừa từ NhanVien:

    Có thêm thuộc tính: phuCapTrachNhiem.

    Override (Ghi đè) method tinhLuong(): Trả về luongCoBan + phuCapTrachNhiem.

    Trong hàm main:

    Tạo một nhân viên thường và một trưởng phòng.

    In ra lương thực nhận của cả hai để thấy sự khác biệt dù gọi cùng một tên hàm tinhLuong().

     */

    protected String ten;
    protected double luongCoBan;
    NhanVien(String ten,double luongCoBan){
        this.ten=ten;
        this.luongCoBan=luongCoBan;
    }
    //method
    public double tinhLuong(){
        return luongCoBan;
    }
}
