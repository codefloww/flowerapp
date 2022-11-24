package ua.edu.ucu.apps.flowerapp;

public class Rose extends Flower {
    public Rose() {
        super(FlowerType.ROSE);
    }
    public Rose(final double price, final double sepalLength, final FlowerColor color) {
        super(FlowerType.ROSE, price, sepalLength, color);
    }
}
