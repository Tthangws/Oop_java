package TuHoc;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 2:53 PM
 */
public class SinhVien {
    /*Mục tiêu: Hiểu cách tạo ra một bản thiết kế (Class) và tạo ra các thực thể cụ thể (Object) từ bản thiết kế đó.
    Bài tập: Quản lý Sinh viên đơn giản
    Tạo một class tên là SinhVien.
    Khai báo các thuộc tính (biến) bên trong class:
    ten (String): Tên sinh viên.
    tuoi (int): Tuổi.
    diemTrungBinh (double): Điểm số.
    Viết một phương thức (method) tên là hienThiThongTin() để in ra dòng chữ: "Sinh viên [Tên], [Tuổi] tuổi, đạt [Điểm] điểm."
    Trong hàm main:
    Tạo ra 2 đối tượng sinh viên khác nhau (ví dụ: An và Bình).
    Gán giá trị trực tiếp cho các thuộc tính của họ.
    Gọi hàm hienThiThongTin() cho từng người.
    Gợi ý của giảng viên: Ở mức này, bạn chưa cần quan tâm đến private hay public vội,
    cứ để default hoặc public để dễ gán dữ liệu sv1.ten = "An"; là được.

     */
    String ten;
    int tuoi;
    double diemTrungBinh;

    public void hienThiThongtin(){
        System.out.println("sinh vien: "+ten+", tuoi: "+tuoi+", dat: "+diemTrungBinh+" diem !");
    }

    public static void main(String[] args) {
        SinhVien Sv1=new SinhVien();
        SinhVien Sv2=new SinhVien();
        Sv1.ten="An";
        Sv1.tuoi=19;
        Sv1.diemTrungBinh=8.5;
        Sv1.hienThiThongtin();

        Sv2.ten="Binh";
        Sv2.tuoi=20;
        Sv2.diemTrungBinh=9.36;
        Sv2.hienThiThongtin();
    }

}
