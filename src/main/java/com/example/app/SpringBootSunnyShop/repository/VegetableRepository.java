package com.example.app.SpringBootSunnyShop.repository;

import com.example.app.SpringBootSunnyShop.entity.Vegetable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Long> {
    List<Vegetable> findAll();
}