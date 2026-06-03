package E_Commerce_Cart;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:03 PM
 */
    public class main {
        public static void main(String[] args) {
            // 1. Tạo giỏ hàng
            Cart myCart = new Cart();

            // 2. Tạo vài sản phẩm và thêm vào giỏ
            Product p1 = new Product("P01", "Laptop Dell", 15000000.0);
            Product p2 = new Product("P02", "Chuot Logitech", 500000.0);

            myCart.addProduct(p1);
            myCart.addProduct(p2);

            // 3. Khách hàng 1: Chọn thanh toán khi nhận hàng (COD)
            System.out.println("\n--- KHACH HANG 1 THANH TOAN ---");
            Cart.PaymentStrategy cod = new CODPayment();
            myCart.checkout(cod); // Truyền interface vào đây!

            // 4. Khách hàng 2: Chọn thanh toán bằng thẻ
            System.out.println("\n--- KHACH HANG 2 THANH TOAN ---");
            Cart.PaymentStrategy card = new CreditCardPayment("9999-8888-7777");
            myCart.checkout(card); // Truyền interface vào đây!
        }
    }
