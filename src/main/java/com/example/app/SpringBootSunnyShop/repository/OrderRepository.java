package com.example.app.SpringBootSunnyShop.repository;

import com.example.app.SpringBootSunnyShop.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}