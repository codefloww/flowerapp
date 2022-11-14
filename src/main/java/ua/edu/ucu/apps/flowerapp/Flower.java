package ua.edu.ucu.apps.flowerapp;

import java.util.Objects;

public class Flower extends Item{

    private double sepalLength;
    private FlowerColor color;
    private double price;

    public Flower() {
    }

    public Flower(final double newSepalLength, final FlowerColor newColor, final double newPrice) {
        this.sepalLength = newSepalLength;
        this.color = newColor;
        this.price = newPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Flower flower)) {
            return false;
        }
        return Double.compare(flower.sepalLength, sepalLength) == 0
                && Double.compare(flower.price, price) == 0 && color == flower.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sepalLength, color, price);
    }

    //    sepalLength, color, and price.
    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double newSepalLength) {
        this.sepalLength = newSepalLength;
    }

    public String getColor() {
        return color.getColor();
    }

    public void setColor(FlowerColor newColor) {
        this.color = newColor;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

}
