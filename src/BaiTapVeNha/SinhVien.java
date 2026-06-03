package BaiTapVeNha;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 11:02 PM
 */
public class SinhVien {
    static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private double diemTB;

    //phương thức
    public String xepLoai(){
        if(diemTB < 2.0)
            return "Học lực yếu";
        if(diemTB >= 2.0 && diemTB <3.0)
            return "Học lực khá";
        if(diemTB >= 3.0 && diemTB <3.6)
            return "Học lực giỏi";
        else
            return "Học lực xuất sắc";
    }

    public void nhap(){
        System.out.print("Tên SV: ");
        hoTen = sc.nextLine();
        System.out.print("Điểm TB(0 -> 4): ");
        diemTB =  sc.nextDouble();
        if(diemTB < 0 || diemTB >4){
            System.out.println("Điểm TB không hop lệ !...");
            return;
        }
        sc.nextLine();
    }

    public void xuat(){
        System.out.print("Tên SV: "+hoTen+" || Điểm TB: "+diemTB+" || Học lực: "+xepLoai());
        System.out.println(" ");
    }

    // hàm tạo để tạo đối tượng sinh viên
    SinhVien() {}
    SinhVien(String hoTen,double diemTB){
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public static void main(String[] args) {
        //tao ra 1 arraylist quản lý danh sách sinh viên
        ArrayList<SinhVien> sinhvien = new ArrayList<>();
        int soLuongSV;

        System.out.print("Nhập số lượng sinh viên bạn muốn thêm: ");
        soLuongSV = sc.nextInt();
        sc.nextLine();

        //bo tat ca sinh vien vao
        for(int i = 0; i<soLuongSV; i++){
            System.out.println("\nSinh viên "+(i+1)+" :");
            SinhVien sv = new SinhVien();
            sv.nhap();
            sinhvien.add(sv);
        }
        //or tự khởi tạo sinh viên và thêm vào
        SinhVien sv1 = new SinhVien("Đỗ Đăng Đại",3.9);
        sinhvien.add(sv1);
        //in tất ca thong tin sinh vien
        System.out.println("          ======= DANH SÁCH SINH VIÊN =======");
        for(SinhVien i : sinhvien){
            i.xuat();
        }


    }
}
