package E_Commerce_Cart;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 1:34 PM
 */
public class CreditCardPayment implements Cart.PaymentStrategy {
    String cardNumber;
    CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Da thanh toan bang the !");
    }
}
