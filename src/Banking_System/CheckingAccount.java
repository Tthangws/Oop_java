package Banking_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/7/2026
 * TIME: 10:33 PM
 */
public class CheckingAccount extends BankAccount{
    // them 1 thuoc tinh overdraftLimit goi la han muc thau chi, cho pheps rut tien am trong han muc
    private double overdraftLimit;
    CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit){
        super(accountNumber,ownerName,balance);
        this.overdraftLimit=overdraftLimit;
    }

    //phuong thuc ke thua
    //phuong thuc withdraw cho phep rut tien ngay ca khi het tien, mien la khong vuot qua han muc
    @Override
    protected void withdraw(double money) {
        // 1. Tính tổng tiền khả dụng (Túi mình + Ngân hàng cho nợ)
        double availableAmount = getBalance() + overdraftLimit;
        // 2. Kiểm tra điều kiện
        if (money <= getBalance()) {
            // Trường hợp 1: Rút trong số dư bình thường -> Gọi cha xử lý cho nhanh
            super.withdraw(money);
        }
        else if (money <= availableAmount) {
            // Trường hợp 2: Rút lạm vào thấu chi (Số dư < Amount <= Tổng khả dụng)

            // Tính số dư mới sẽ bị âm. Ví dụ: Có 1tr, Rút 1.2tr -> Mới là -200k
            double newBalance = getBalance() - money;

            setBalance(newBalance); // Cập nhật số dư âm
            System.out.println("Rut thau chi thanh cong: " + money + ". So du hien tai: " + getBalance());
        }
        else {
            // Trường hợp 3: Rút quá cả hạn mức thấu chi
            System.out.println("Giao dich that bai: Vuot qua han muc thau chi!");
        }
    }
}
