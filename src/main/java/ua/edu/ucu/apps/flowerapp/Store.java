package ua.edu.ucu.apps.flowerapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/store")
@RestController
public class Store {
    private final FlowerappApplication flowerappApplication;
    // For simple url work demonstration
    private final ArrayList<Item> assortement = new ArrayList<>();

    @Autowired
    public Store(FlowerappApplication flowerappApplication) {
        this.flowerappApplication = flowerappApplication;
    }

    @GetMapping
    public final String greeting() {
        return "Our initial page is working.";
    }

    @GetMapping("/allitems")
    public List<Item> getAssortement() {
        assortement.add(new Tulip());
        return assortement;
    }

    @GetMapping("/searchitem")
    public boolean search(final Item searchedItem) {
        for (Item item : assortement) {
            if (item.equals(searchedItem)) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/additem")
    public void addItem(final Item newItem) {
        assortement.add(newItem);
    }

    @GetMapping("database/get")
    public List<Flower> getFlowers() {
        return flowerappApplication.getFlowersFromDB();
    }

    @PostMapping("/database/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerappApplication.addFlowerToDB(flower);
    }
}
