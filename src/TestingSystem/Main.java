package TestingSystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/17/2026
 * TIME: 2:55 PM
 */
public class Main {
    public static void main(String[] args) {
                // 1. Giám thị khởi tạo một kỳ thi mới
                Exam toeicTest = new Exam();

                // 2. Soạn thảo các câu hỏi
                // Câu 1: Trắc nghiệm ngữ pháp TOEIC
                Question q1 = new MutipleChoiceQuestion(
                        "T01",
                        "The company ___ a new product next month.\n A) launch\n B) will launch\n C) launched\n D) launches",
                        "B"
                );

                // Câu 2: Trắc nghiệm từ vựng TOEIC
                Question q2 = new MutipleChoiceQuestion(
                        "T02",
                        "All employees must wear their identification ___ at all times.\n A) badges\n B) notes\n C) funds\n D) delays",
                        "A"
                );

                // 3. Thêm câu hỏi vào đề thi
                toeicTest.addQuestion(q1);
                toeicTest.addQuestion(q2);

                // 4. Phát đề và bắt đầu làm bài!
                toeicTest.takeExam();
            }
        }
