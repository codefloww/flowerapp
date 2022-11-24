package ua.edu.ucu.apps.flowerapp;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Getter
@Setter
@Entity
@Table(name = "flowers")
public class Flower extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    private double sepalLength;

    @Enumerated(EnumType.STRING)
    private FlowerColor color;

    @Enumerated(EnumType.STRING)
    private FlowerType type;

    public Flower() {

    }

    public Flower(final FlowerType newType) {
        this.type = newType;
    }

    public Flower(final FlowerType newType, final double newPrice, final double newSepalLength, final FlowerColor flowerColor) {
        this.type = newType;
        this.price = newPrice;
        this.sepalLength = newSepalLength;
        this.color = flowerColor;
    }

    public final String getColor() {
        return color.getColor();
    }

    public final String toString() {
        return "Flower: " + type + ", price: " + price + ", sepal length: " + sepalLength + ", color: " + color;
    }
}