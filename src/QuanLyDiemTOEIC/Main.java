package QuanLyDiemTOEIC;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/17/2026
 * TIME: 3:51 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ToeicScore> toeicScores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("======= NHAP DIEM HOC VIEN =======");
        while (true) {
            try {
                System.out.print("\nHoc vien: ");
                // Không cần dùng ts.studentName, dùng biến tạm String name cho gọn
                String name = sc.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Nhap diem: ");
                int score = sc.nextInt();
                sc.nextLine(); // Dọn rác phím Enter

                // BƯỚC KIỂM TRA LỖI LOGIC
                if (score < 0 || score > 990) {
                    System.out.println("Điểm không hợp lệ, vui lòng nhập lại!");
                    continue; // Quay xe, bắt nhập lại từ đầu
                }

                // Nếu vượt qua được cái if ở trên, chứng tỏ điểm chuẩn xác 100%.
                // Lúc này mới bắt đầu TẠO ĐỐI TƯỢNG VÀ LƯU VÀO MẢNG
                ToeicScore newStudent = new ToeicScore(name, score);
                toeicScores.add(newStudent);
                System.out.println("-> Da luu thanh cong !");

            } catch (InputMismatchException e) {
                System.out.println("-> Cảnh báo: Bạn phải nhập SỐ nguyên, không được nhập chữ!");
                sc.nextLine();
            }
        } // KẾT THÚC VÒNG LẶP WHILE Ở ĐÂY

        // Đoạn tổng kết phải nằm NGOÀI vòng lặp, chỉ chạy 1 lần khi đã gõ "exit"
        System.out.println("\n--- TONG KET DANH SACH ---");
        System.out.println("So luong hoc vien: " + toeicScores.size());
    }
}