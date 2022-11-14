package ua.edu.ucu.apps.flowerapp;

public class PaymentByPaypal implements Payment {
    public double pay(double price){
        System.out.println("I have paid using PayPal: "+Double.toString(price));
        return price;
    }
}
