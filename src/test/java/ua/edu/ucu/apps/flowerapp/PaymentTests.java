package ua.edu.ucu.apps.flowerapp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerapp.PaymentByCard;
import ua.edu.ucu.apps.flowerapp.PaymentByPaypal;
import ua.edu.ucu.apps.flowerapp.Payment;


public class PaymentTests {
    private Payment creditCardPayment;
    private Payment paypalPayment;
    private double price;

    @BeforeEach
    public void init() {
        creditCardPayment = new PaymentByCard();
        paypalPayment = new PaymentByPaypal();
        price = 120.4;
    }

    @Test
    public void testCreditCardPayment() {
        double paidByCard = creditCardPayment.pay(price);
        assert (paidByCard==120.4);
    }

    @Test
    public void testPayPalPayment() {
        double paidByPaypal = paypalPayment.pay(price);
        assert (paidByPaypal==120.4);
    }
}
