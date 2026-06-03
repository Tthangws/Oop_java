package CayATM;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:38 PM
 */
public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        try {
            System.out.println("=== Cay ATM ===");
            ba.withdraw(-60000);
            System.out.println("Moi thu da hoan thanh !");
        }
        catch (NegativeAmountException N ){
            System.out.println("Oops ! Co van de dang xay ra... "+N.getMessage());
            System.out.println("Xin vui long thao tac lai mot lan nua !");
        }
        catch (InsufficientFunsException I ){
            System.out.println("Oops ! Co van de dang xay ra... "+I.getMessage());
            System.out.println("Xin vui long thao tac lai mot lan nua !");
        }
    }
}
