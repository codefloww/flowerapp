package ua.edu.ucu.apps.flowerapp;

import java.util.ArrayList;
import java.util.Objects;

public class FlowerBucket extends Item{
    private final ArrayList<FlowerPack> bucket = new ArrayList<>();

    public void add(final FlowerPack pack) {
        bucket.add(pack);
    }

    public double getPrice() {
        double generalPrice = 0;
        for (FlowerPack pack : bucket) {
            generalPrice += pack.getPrice();
        }
        return generalPrice;
    }

    public boolean inBucket(final FlowerPack pack) {
        for (FlowerPack bucketPack : bucket) {
            if (bucketPack.equals(pack)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlowerBucket that)) {
            return false;
        }
        for (FlowerPack pack : bucket) {
            if (!that.inBucket(pack)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket);
    }
}
