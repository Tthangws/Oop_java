package BaiTapVeNha;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 9:39 PM
 */
public class HoaDon {
    static Scanner sc = new Scanner(System.in);//khai bao o day de tat ca cac ham tỏng class deu dung duoc

    private int soHoaDon;
    private int ngayBan;
    private String tenHang;
    private int soLuong;
    private double giaBan;

    // phương thức
    public void nhap(){
        System.out.print("\nSố hóa đơn : ");
        soHoaDon = sc.nextInt();
        if(soHoaDon < 0){
            System.out.println("So hóa đơn không hợp lệ !, yêu cầu từ 0 -> 1000...");
            return;
        }
        sc.nextLine();

        System.out.print("Ngày bán : ");
        ngayBan = sc.nextInt();
        if( ngayBan < 1 || ngayBan >= 32 ){
            System.out.println("Ngày bán không hợp lệ !, vui lòng nhập lại...");
            return;
        }
        sc.nextLine();

        System.out.print("Tên hãng : ");
        tenHang = sc.nextLine();

        System.out.print("Số lượng: ");
        soLuong = sc.nextInt();

        System.out.print("Giá bán : ");
        giaBan = sc.nextInt();
        if(giaBan <= 0){
            System.out.println("Giá bán không hợp lệ !, vui lòng nhập lại...");
            return;
        }
        sc.nextLine();
    }

    public double tinhSoTien(){
        return soLuong*giaBan;
    }

    public void inThongTin(){
        System.out.println("Số hóa đơn: "+soHoaDon+" || Ngày bán: "+ngayBan);
        System.out.println("Tên hãng  : "+tenHang+" || So luợng: "+soLuong+"  || Giá bán:  "+giaBan);
    }

    public static void main(String[] args) {
        HoaDon hd = new HoaDon();
        int n;
        System.out.print("Nhập số hóa đơn cần lập : ");
        n = sc.nextInt();
        HoaDon[] arr = new HoaDon[n];

        System.out.println("Nhập thong tin cho các hóa đơn : ");
        for(int i = 0; i < n; i++){
            System.out.print("\nHóa đơn thứ "+(i+1));
            //khai báo để tạo ra đối tượng nếu không sẽ bị lỗi null
            arr[i] = new HoaDon();
            arr[i].nhap();
        }

        //in thông tin hóa đơn ra màn hình
        System.out.println("======== THÔNG TIN HÓA ĐƠN ========");
            for (int j = 0; j < n; j++) {
                arr[j].inThongTin();
                System.out.println(" ");
            }

        // tổng tiền của tất cả hóa đơn
        double tong = 0 ;
        for (int k = 0; k < n; k++) {
            tong = tong + (arr[k].soLuong * arr[k].giaBan);
        }
        System.out.println("Tổng tiền của tất cả các hóa đơn là :  "+tong+"VND");
    }
}
