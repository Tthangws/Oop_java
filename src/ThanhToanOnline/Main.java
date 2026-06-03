package ThanhToanOnline;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 3:45 PM
 */
public class Main {
    public static void main(String[] args) {
        //thay vì khai báo thằng con là MomoPayment thì dùng thằng cha sẽ tận dụng được tính đa hình
        PaymentGateway momopayment = new MomoPayment();
        try {
            System.out.println("Đang xử lý giao dịch...");
            momopayment.pay(404);
        }
        catch (PaymentFailedException e)//tiêu chuẩn cộng đồng thường dùng e or ex
        {
            System.out.println("Giao dịch không thành công..."+e.getMessage());
        }
    }
}
