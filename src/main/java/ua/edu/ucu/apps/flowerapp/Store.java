package ua.edu.ucu.apps.flowerapp;

import org.springframework.beans.factory.annotation.Autowired;
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
    public final String greeting(){
        return "Our initial page is working.";
    }
    @GetMapping("/all")
    public List<Item> getAssortement() {
        return assortement;
    }

    @GetMapping("/search")
    public boolean search(final Item searchedItem) {
        for (Item item : assortement) {
            if (item.equals(searchedItem)) {
                return true;
            }
        }
        return false;
    }
    @GetMapping("/add")
    public void addItem(final Item newItem) {
        assortement.add(newItem);
    }
}
