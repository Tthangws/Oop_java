package QuanLyThuVienSach;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/29/2026
 * TIME: 4:27 PM
 */
public class QuanLyThuVien {
    ArrayList<TaiLieu> danhSachTaiLieu=new ArrayList<>();
    public void themTaiLieu(TaiLieu taiLieu){
        //ta dung ham add trong mang dong de them
        danhSachTaiLieu.add(taiLieu);
        System.out.println("Da them thanh cong !");
    }
    //phuong thuc hien thi danh sach
    public void hienThiDanhSach(){
        System.out.println("---Danh sach tai lieu---");
        for(TaiLieu item : danhSachTaiLieu){
            item.hienThiThongTin();
            System.out.println("-----------------------");
        }
    }
    //ham tim kiem theo ma
    public void timKiemTheoMa(String maCanTim){
        boolean timThay=false;
        for(TaiLieu item : danhSachTaiLieu){
            if(item.getMaTaiLieu().equals(maCanTim)){
                System.out.println("Da tim thay !");
                item.hienThiThongTin();
                timThay=true;
                break;
            }else {
                System.out.println("Khong tin thay tai lieu nao co ma: "+maCanTim);
            }
        }
    }

    public static void main(String[] args) {
        QuanLyThuVien ql=new QuanLyThuVien();
        Sach s1=new Sach("M04","NXB VTV",100,"To HUU",300);
        Video v1=new Video("m98","Kim Dong",550,65.7);

        //them vao danh sach
        ql.themTaiLieu(s1);
        ql.themTaiLieu(v1);

        //hien thi xem no in ra gi
        ql.hienThiDanhSach();
        ql.timKiemTheoMa("m98");
    }
}
