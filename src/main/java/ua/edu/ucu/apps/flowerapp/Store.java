package ua.edu.ucu.apps.flowerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/store")
@RestController
public class Store {
    private final ArrayList<Item> assortement = new ArrayList<>();

    @GetMapping
    public List<Item> getAssortement() {
        assortement.add(new Tulip());
        return assortement;
    }


    public boolean search(final Item searchedItem) {
        for (Item item : assortement) {
            if (item.equals(searchedItem)) {
                return true;
            }
        }
        return false;
    }

    public void addItem(final Item newItem) {
        assortement.add(newItem);
    }
}
