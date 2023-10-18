package com.example.app.SpringBootSunnyShop.repository;

import com.example.app.SpringBootSunnyShop.entity.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends CrudRepository<Fruit, Long> {

}