package E_Commerce_Cart;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 1:41 PM
 */
public class CODPayment implements Cart.PaymentStrategy {
    @Override
    public void pay(double amount) {
        //thanh toan khi nhan hang
        System.out.println("Thanh toan khi nhan hang !");
    }
}
