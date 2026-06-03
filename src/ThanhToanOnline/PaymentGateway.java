package ThanhToanOnline;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 3:36 PM
 */
public interface PaymentGateway {
    void pay(double amount) throws PaymentFailedException;
}
