package TestingSystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 1:28 PM
 */
public class FillBlankQuestion extends Question{
    FillBlankQuestion(String id, String content, String correctAnswer) {
        super(id, content, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) throws InvalidAnswerException {
        String cleanAnswer = answer.trim();
        return cleanAnswer.equalsIgnoreCase(this.getCorrectAnswer());
    }
}
