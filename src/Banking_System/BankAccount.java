package Banking_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/7/2026
 * TIME: 10:04 PM
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance; // so du

    //ham constructer
    BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
    }
    //phuong thuc


    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // gui tien
    protected void deposit(double money){
        if(money > 0) {
            this.balance = balance + money;
            System.out.println("Nap thanh cong: " + money + ". So du moi: " + this.balance);
        }
    }
    //rut tien
    protected void withdraw(double money){
        if(money<=balance){
             this.balance=balance-money;
            System.out.println("Nap thanh cong: " + money + ". So du moi: " + this.balance);
        }
        else {
            System.out.println("Giao dich that bai: So du khong du.");
        }
    }
    // Thêm hàm hiển thị thông tin
    public void displayInfo() {
        System.out.println("Acc: " + accountNumber + " | Owner: " + ownerName + " | Balance: " + balance);
    }

}
