package TestingSystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 1:28 PM
 */
public class MutipleChoiceQuestion extends Question {
    MutipleChoiceQuestion(String id, String content, String correctAnswer) {
        super(id, content, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) throws InvalidAnswerException {
        String cleanAnswer = answer.trim(); // cắt chỗ trống 2 đầu

        if(!cleanAnswer.equals("A") && !cleanAnswer.equals("B") && !cleanAnswer.equals("C") && !cleanAnswer.equals("D")){
            throw new InvalidAnswerException("Đáp án không hợp lệ !, vui lòng nhập lại...");
        }
        return cleanAnswer.equalsIgnoreCase(this.getCorrectAnswer());
    }
}
