package TuHoc;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/3/2026
 * TIME: 5:19 PM
 */
public class LuyenTapXuLyChuoi {
    /*
    Mức độ 1: Chuẩn hóa văn bản (Làm sạch dữ liệu)
    Thay vì chỉ đếm, hãy sửa lại chuỗi cho đẹp.

    Đề bài: Viết chương trình nhập vào một chuỗi Họ tên bị lỗi
     (ví dụ: viết hoa lung tung, thừa khoảng trắng).
    Input: " nGUyEn tRoNg tHaNg "
    Output yêu cầu: Nguyen Trong Thang

    Yêu cầu kỹ thuật:
    Xóa hết khoảng trắng thừa ở đầu, cuối và giữa các từ.
    Chữ cái đầu mỗi từ phải viết Hoa, các chữ sau viết thường.
    In ra màn hình tên đã chuẩn hóa.

    Gợi ý: Bạn cần dùng .trim(), .
    split("\\s+") để tách từ, và dùng .
    substring() hoặc .toUpperCase()/.
    toLowerCase() để xử lý từng từ.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao 1 chuoio bat ky :");
        String str = sc.nextLine();

        //xu ly chuoi
        //B1 : xoa het khoang trang o 2 dau chuoi :
        str = str.trim(); // ham trim() de xoa khoang trang 2 dau

        //B2 : tach chuoi ra tung tu
        String[] danhSachTen = str.split("\\s+");// ten da duoc chia thanh tung tu mooi tu trong 1 mang

        //B3 : chuyen tat ca ky tu ve chu in thuong
        String ketQua="";
        for(int i=0;i<danhSachTen.length;i++){
         //B4 : cat phan dau va viet hoa
        String chuCaiDau = danhSachTen[i].substring(0,1).toUpperCase();//cat phan dau cua moi tu va viet hoa

         //B5 : cat lay phan duoi
        String phanConLai =  danhSachTen[i].substring(1).toLowerCase();//lay toan bo phan sau chu cai dau
         //B6 : ghep 2 tu lai
         String tuChuan = chuCaiDau+phanConLai;
         ketQua = ketQua + tuChuan+" ";

        }
        //xoa not dau cach thua o cuoi cung do vong lap cong du
        ketQua.trim();
        System.out.println(ketQua);
    }

}
