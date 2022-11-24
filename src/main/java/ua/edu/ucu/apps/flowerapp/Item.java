package ua.edu.ucu.apps.flowerapp;

import lombok.Setter;
@Setter
public abstract class Item {
    public String descrtiption;
    public int quantity;
    public double price;

    public int id;

    public Item(){

    }
    public Item(String newDescription, int newQuantity, double newPrice) {
        this.descrtiption = newDescription;
        this.quantity = newQuantity;
        this.price = newPrice;
    }

    public String getDescrtiption() {
        return descrtiption;
    }
    abstract double getPrice();
}
