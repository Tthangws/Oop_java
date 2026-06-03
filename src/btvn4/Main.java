package btvn4;
import java.util.Scanner;
/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 4:39 PM
 */
public class Main {
    public static void main(String[] args) {
        thaotac tt = new thaotac();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUẢN LÝ DANH BẠ ---");
            System.out.println("1. Thêm mới | 2. Cập nhật | 3. Xóa | 4. Tìm kiếm | 5. inTT | 6.Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tên: "); String n = sc.nextLine();
                    System.out.print("SĐT: "); String p = sc.nextLine();
                    tt.themmoi(n, p);
                    break;
                case 2:
                    System.out.print("Tên cần sửa: "); String un = sc.nextLine();
                    System.out.print("SĐT mới: "); String up = sc.nextLine();
                    tt.capnhat(un, up);
                    break;
                case 3:
                    System.out.print("Tên cần xóa: "); String rn = sc.nextLine();
                    tt.xoa(rn);
                    break;
                case 4:
                    System.out.print("Tên cần tìm: "); String sn = sc.nextLine();
                    tt.timkiem(sn);
                    break;
                case 5:
                    tt.in();
                    break;

                case 6: return;
            }
        }
    }
}
