package ua.edu.ucu.apps.flowerapp;

import org.springframework.data.jpa.repository.JpaRepository;
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}