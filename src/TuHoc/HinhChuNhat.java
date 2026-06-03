package TuHoc;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class HinhChuNhat {
    Scanner sc=new Scanner(System.in);
    /*Bài 1: Hình Chữ Nhật (Làm quen với tính toán trong Class)
    Mục tiêu: Hiểu cách tạo class và viết hàm trả về kết quả (return).
    Đề bài: Tạo một class tên là TuHoc.HinhChuNhat.
    Thuộc tính: chieuDai (double), chieuRong (double).
    Phương thức (Hành động):

    tinhChuVi(): Trả về chu vi = (dài + rộng) * 2.
    tinhDienTich(): Trả về diện tích = dài * rộng.
    hienThi(): In ra màn hình kích thước và diện tích của nó.

    Main:
    Tạo 1 hình chữ nhật có kích thước tùy ý (ví dụ 4.5 và 8.2).
    Gọi hàm hienThi() để xem kết quả.
     */
    double chieuDai;
    double chieuRong;

    public double tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }

    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }

    public void hienThi() {
        System.out.println(tinhChuVi());
        System.out.println(tinhDienTich());
    }
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat();
        hcn.chieuDai=4.5; hcn.chieuRong=8.2;
        hcn.hienThi();


    }
}
