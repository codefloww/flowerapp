package ua.edu.ucu.apps.flowerapp;

import java.util.List;

public class DeliveryByPost implements Delivery{
    public boolean deliver(List<Item> items){
        System.out.println("I have delivered via Post: "+items.toString());
        return true;
    }
}
