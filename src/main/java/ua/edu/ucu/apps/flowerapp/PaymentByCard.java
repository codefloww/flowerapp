package ua.edu.ucu.apps.flowerapp;

public class PaymentByCard implements Payment{
    public double pay(double price){
        System.out.println("I have paid using Card: "+Double.toString(price));
        return price;
    }
}
