package com.example.app.SpringBootSunnyShop.service.Admin;

import com.example.app.SpringBootSunnyShop.entity.Fruit;
import com.example.app.SpringBootSunnyShop.repository.FruitRepository;
import com.example.app.SpringBootSunnyShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class AdminFruitService {

    @Autowired
    FruitRepository repository;

    public void createFruit(Fruit fruit) {
        repository.save(fruit);
    }

    public List<Fruit> getAll() {
        Iterable<Fruit> iterable = repository.findAll();
        List<Fruit> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(fruit -> new Fruit(fruit.getId(),
                                Constants.URL_IMAGES_UPLOADS + fruit.getImg(),
                                fruit.getName(),
                                fruit.getArticle(),
                                fruit.getDescr(),
                                fruit.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}