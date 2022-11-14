package ua.edu.ucu.apps.flowerapp;

import java.util.Objects;

public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public FlowerPack() {
    }

    public FlowerPack(final Flower newFlower, final int newAmount) {
        this.flower = newFlower;
        this.amount = newAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int newAmount) {
        this.amount = newAmount;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(final Flower newFlower) {
        this.flower = newFlower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlowerPack pack)) {
            return false;
        }
        return amount == pack.amount && Objects.equals(flower, pack.flower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flower, amount);
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }

}
