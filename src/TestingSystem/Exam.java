package TestingSystem;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/17/2026
 * TIME: 1:59 PM
 */
public class Exam {

        // 1. Danh sách chứa tất cả các câu hỏi (Cả Trắc nghiệm và Điền khuyết)
        private ArrayList<Question> questions;

        // Constructor
        public Exam() {
            this.questions = new ArrayList<>();
        }

        // Hàm thêm câu hỏi vào đề thi
        public void addQuestion(Question q) {
            this.questions.add(q);
        }

        // 2. Trái tim của hệ thống: Hàm bắt đầu thi
        public void takeExam() {
            Scanner sc = new Scanner(System.in);
            int score = 0; // Biến lưu điểm số

            System.out.println("=== BẮT ĐẦU BÀI THI ===");

            // Duyệt qua từng câu hỏi trong danh sách
            for (int i = 0; i < questions.size(); i++) {
                Question currentQ = questions.get(i);

                // Vòng lặp vô tận: Chỉ cho phép thoát (break) nếu nhập đúng định dạng
                while (true) {
                    try {
                        // In câu hỏi ra màn hình (Giả sử class Question có hàm getContent)
                        System.out.println("\nCâu " + (i + 1) + ": " + currentQ.getContent());
                        System.out.print("-> Đáp án của bạn: ");
                        String answer = sc.nextLine();

                        // Gọi hàm checkAnswer. Nếu answer linh tinh, nó sẽ NÉM LỖI ngay tại dòng này!
                        boolean isCorrect = currentQ.checkAnswer(answer);

                        // Nếu không có lỗi gì xảy ra, code sẽ chạy tiếp xuống đây để chấm điểm
                        if (isCorrect) {
                            score++;
                            System.out.println("[ Hệ thống: Chính xác! ]");
                        } else {
                            System.out.println("[ Hệ thống: Sai rồi! ]");
                        }

                        // Thoát khỏi vòng lặp while để đi tiếp sang câu hỏi tiếp theo (i++)
                        break;

                    } catch (InvalidAnswerException e) {
                        // Nếu dính lỗi, code sẽ nhảy thẳng vào đây, bỏ qua lệnh chấm điểm và lệnh break
                        System.out.println("!!! CẢNH BÁO: " + e.getMessage());
                        System.out.println("=> Vui lòng đọc kỹ yêu cầu và nhập lại.");
                        // Chạy hết khối catch, vòng lặp while lại quay lên đầu để hỏi lại đúng câu đó
                    }
                }
            }

            // 3. Kết thúc bài thi, in tổng điểm
            System.out.println("\n=======================");
            System.out.println("BÀI THI KẾT THÚC!");
            System.out.println("Tổng điểm của bạn: " + score + " / " + questions.size());
        }
    }
