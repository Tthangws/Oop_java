package TestingSystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 1:20 PM
 */
public abstract class Question {
    private String id;
    private String content;
    private String correctAnswer;
    //ham constructer
    Question(String id,String content,String correctAnswer){
        this.id = id;
        this.content = content;
        this.correctAnswer = correctAnswer;
    }

    //ham getter dap an dung
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public String getContent(){
        return content;
    }
    //ham abstract kiem tra cau tra loi
    public abstract boolean checkAnswer(String answer) throws InvalidAnswerException;


}
