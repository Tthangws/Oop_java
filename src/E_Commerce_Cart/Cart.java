package E_Commerce_Cart;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 1:03 PM
 */
public class Cart {
    // chua danh sach cac san pham
    //tao 1 mang dong de chua san pham
   ArrayList<Product>productList;

   //constructer
    public Cart(){
        this.productList = new ArrayList<>();
    }

    //ham them san pham vao mang
    public void addProduct(Product product){
        this.productList.add(product);
        System.out.println(">> Da them '" + product.name + "' vao gio hang.");
    }
    //ham tinh tong
    public double calculateTotal(){
        double total = 0;
        for(Product item : productList){
            total = total + item.price;
        }
        return total;
    }

    //ham interface
    public interface PaymentStrategy{
        void pay(double amount);
    }
    public void checkout(PaymentStrategy paymentMethod){
        paymentMethod.pay(calculateTotal());
    }
}
