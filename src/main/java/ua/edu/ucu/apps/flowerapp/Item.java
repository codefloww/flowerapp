package ua.edu.ucu.apps.flowerapp;

import lombok.Setter;
@Setter
public abstract class Item {
    public String descrtiption;

    public String getDescrtiption() {
        return descrtiption;
    }
    abstract double getPrice();
}
