package pro.sky.java.cours2.basket.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.cours2.basket.model.Cart;
import pro.sky.java.cours2.basket.model.Item;
import pro.sky.java.cours2.basket.service.CartService;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Item> add(List<Integer> id) {
        for (Integer ids : id) {
            Item item = new Item(ids);
            cart.getBasketList().add(item);
        }
        return cart.getBasketList();    }

    @Override
    public List<Item> get() {
        return cart.getBasketList();
    }
}

