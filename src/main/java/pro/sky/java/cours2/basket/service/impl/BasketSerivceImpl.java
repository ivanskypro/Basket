package pro.sky.java.cours2.basket.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.cours2.basket.model.Item;
import pro.sky.java.cours2.basket.service.BasketService;

import java.util.ArrayList;
import java.util.List;
@Service
@SessionScope
public class BasketSerivceImpl implements BasketService {

    List<Item> basket = new ArrayList<>();

    @Override
    public Item add(int id) {
        Item item = new Item(id);
        basket.add(item);
        return item;
    }

    @Override
    public List<Item> get() {
        return basket;
    }
}

