package pro.sky.java.cours2.basket.service;

import pro.sky.java.cours2.basket.model.Item;
import java.util.List;

public interface CartService {

    List<Item> add(List<Integer> id);

    List<Item> get();
}
