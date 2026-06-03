package CayATM;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:24 PM
 */
public class InsufficientFunsException extends Exception{
    //loi so du khong du
    //constructer
    public InsufficientFunsException(String message){
        super(message);
    }
}
