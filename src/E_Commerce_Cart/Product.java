package E_Commerce_Cart;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 12:46 PM
 */
public class Product {
   /* Bài 3: Ứng dụng Giỏ hàng Thương mại điện tử (E-Commerce Cart)
    Mục tiêu: Hiểu về Interface để giảm sự phụ thuộc (Loose Coupling) và tư duy Composition (Mối quan hệ "Has-a").

    Yêu cầu nghiệp vụ:
    Tạo class Product (id, name, price).
    Tạo class Cart chứa danh sách các Product. Có hàm calculateTotal() để tính tổng tiền.

    Điểm nhấn (Interface): Thay vì viết cứng logic thanh toán trong Cart, hãy tạo interface PaymentStrategy có hàm pay(double amount).

    Implement CreditCardPayment (nhập thẻ, in ra "Thanh toán bằng thẻ...").
    Implement CODPayment (in ra "Thanh toán khi nhận hàng...").

    Trong class Cart, thêm hàm checkout(PaymentStrategy paymentMethod). Khi gọi hàm này, nó sẽ tính tổng tiền và gọi paymentMethod.pay(total)
    */

    String id;
    String name;
    Double price;

    //ham constructer
    Product(String id, String name, Double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
