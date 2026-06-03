package CayATM;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:24 PM
 */
public class NegativeAmountException extends Exception{
    //loi nhap tien am
    //constructer
    public NegativeAmountException(String message){
        super(message);
    }
}
