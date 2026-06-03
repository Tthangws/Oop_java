package Banking_System;

public class Banking {
    public static void main(String[] args) {
        System.out.println("--- TEST SAVING ACCOUNT ---");
        SavingAccount sa = new SavingAccount("SAV001", "Thang Nguyen", 1000000, 0.05); // Lãi 5%
        sa.applyInterest(); // Lãi 50k -> Số dư phải là 1.050.000

        System.out.println("\n--- TEST CHECKING ACCOUNT ---");
        // Có 1 triệu, hạn mức thấu chi 500k -> Max rút được 1.5 triệu
        CheckingAccount ca = new CheckingAccount("CHK001", "Thang Nguyen", 1000000, 500000);

        // Test 1: Rút bình thường (800k)
        System.out.println("Lenh 1: Rut 800.000");
        ca.withdraw(800000); // Còn 200k

        // Test 2: Rút thấu chi (Rút tiếp 400k -> Trong túi còn 200k, thiếu 200k -> nợ 200k)
        System.out.println("\nLenh 2: Rut tiep 400.000");
        ca.withdraw(400000); // Số dư sẽ là -200.000

        // Test 3: Rút quá hạn mức (Đang âm 200k, hạn mức 500k -> Còn được nợ 300k nữa. Rút 400k sẽ tạch)
        System.out.println("\nLenh 3: Rut tiep 400.000");
        ca.withdraw(400000); // Fail
    }
}