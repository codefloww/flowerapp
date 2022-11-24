package ua.edu.ucu.apps.flowerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
@Service
public class FlowerappApplication {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerappApplication(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowerappApplication.class, args);
    }

    public List<Flower> getFlowersFromDB() {
        return flowerRepository.findAll();
    }
    public void addFlowerToDB(Flower flower) {
        flowerRepository.save(flower);
    }


}
