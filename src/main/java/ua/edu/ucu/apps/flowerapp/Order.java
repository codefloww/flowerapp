package ua.edu.ucu.apps.flowerapp;

import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
public class Order {
    public List<Item> items;
    public Payment payment;
    public Delivery delivery;

    public void setPayment(Payment payment){
        payment = payment;
    }

    public void setDelivery(Delivery delivery){
        delivery = delivery;
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (Item item :items){
            price += item.getPrice();
        }
        return price;
    }

}
