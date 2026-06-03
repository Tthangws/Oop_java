package Banking_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/7/2026
 * TIME: 10:17 PM
 */
public class SavingAccount extends BankAccount{
    private double interestRate;
    SavingAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate=interestRate;
        // class nay khe thua cua Bankaccount nhuwng them 1 thuoc tinh la lai xuat
    }

    //phuong thuc de cong tien lai vao so du
    public void applyInterest(){
        double interest = getBalance() * this.interestRate;
        // Gọi hàm nạp tiền của cha để cộng vào
        deposit(interest);
        System.out.println("Da cong lai suat " + interest + " vao tai khoan.");
    }
}
