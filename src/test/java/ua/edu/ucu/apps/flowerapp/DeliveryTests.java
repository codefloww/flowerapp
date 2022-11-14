package ua.edu.ucu.apps.flowerapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerapp.*;

import java.util.LinkedList;
import java.util.List;

public class DeliveryTests {
    private DeliveryByDHL DHLDelivery;
    private DeliveryByPost postDelivery;
    private List<Item> deliveryItems;

    @BeforeEach
    public void init() {
        DHLDelivery = new DeliveryByDHL();
        postDelivery = new DeliveryByPost();

        deliveryItems = new LinkedList<>();
        deliveryItems.add(new Tulip());
        deliveryItems.add(new Chamomile());
        deliveryItems.add(new FlowerPack(new Rose(),
                3));
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack pack = new FlowerPack(new Tulip(), 5);

        bucket.add(pack);
        deliveryItems.add(bucket);
    }

    @Test
    public void testDHLDelivery() {
        boolean delivered = DHLDelivery.deliver(deliveryItems);
        assert (delivered);
    }

    @Test
    public void testPostDelivery() {
        boolean delivered = postDelivery.deliver(deliveryItems);
        assert (delivered);
    }
}
