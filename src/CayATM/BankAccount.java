package CayATM;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:27 PM
 */
public class BankAccount {
    double balance = 50000;

    //ham
    public void withdraw(double amount) throws NegativeAmountException,InsufficientFunsException{
        if(amount < 0){
            throw new NegativeAmountException("Khong the thuc hien giao dich vi so tien khong hop le !");
        }
        if(amount > balance){
            throw new InsufficientFunsException("\nLoi ! So du tai khoan khong du de thuc hien giao dich nay...");
        }
        else {
            System.out.println("Giao dich dang duoc xu ly...");
            balance = balance - amount;
            System.out.println("Giao dich thanh cong ! so du con lai : "+balance);
        }
    }
}
