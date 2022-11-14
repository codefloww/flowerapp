package ua.edu.ucu.apps.flowerapp;

import java.util.List;

public class DeliveryByDHL implements Delivery {
    public boolean deliver(List<Item> items){
        System.out.println("I have delivered via DHL: "+items.toString());
        return true;
    }
}
