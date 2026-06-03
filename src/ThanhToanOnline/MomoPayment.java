package ThanhToanOnline;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 3:39 PM
 */
public class MomoPayment implements PaymentGateway{

    @Override
    public void pay(double amount) throws PaymentFailedException {
        if(amount == 404){
            throw new PaymentFailedException("Lỗi kết nối đến Momo !");
        }
        System.out.println("Thanh toán qua Momo thành công: "+amount);
    }
}
