package HeThongThanhToan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 1:32 PM
 */
public interface IThanhToan {
    /*
    Mục tiêu: Thiết kế hệ thống lỏng lẻo (loose coupling), chuẩn hóa hành vi.
    Đây là cách các kiến trúc sư phần mềm làm việc.

    Bài tập: Hệ thống thanh toán
    Tạo Interface IThanhToan:
    Khai báo một phương thức trừu tượng: double thanhToan(double soTien);
    (Không có phần thân code {}).
    Tạo Abstract Class DonHang:
    Thuộc tính: maDon, soTienCanThanhToan.
    Constructor.
    Tạo 2 Class thực thi Interface IThanhToan:
    Class ThanhToanTienMat: Hàm thanhToan sẽ trả về nguyên soTien (Không giảm giá).
    In ra: "Thanh toán bằng tiền mặt".
    Class ThanhToanOnline: Hàm thanhToan sẽ trả về soTien * 0.95 (Giảm giá 5% khuyến khích dùng thẻ).
    In ra: "Thanh toán Online, được giảm 5%".
    Kết hợp trong main:
    Tạo một biến soTienHang = 100000.
    Tạo một đối tượng IThanhToan cach1 = new ThanhToanTienMat();
    Tạo một đối tượng IThanhToan cach2 = new ThanhToanOnline();
    thử in ra số tiền thực tế phải trả khi dùng cach1.
    thanhToan(soTienHang) và cach2.thanhToan(soTienHang)
     */


    // ham abstract , tra chat de hieu them
    double thanhToan(double soTien);

    }
