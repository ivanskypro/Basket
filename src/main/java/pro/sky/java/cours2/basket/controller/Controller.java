package pro.sky.java.cours2.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.cours2.basket.model.Item;
import pro.sky.java.cours2.basket.service.CartService;

import java.util.List;

@RestController
@RequestMapping (path = "/order")
public class Controller {
    private final CartService cartService;

    public Controller(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam List <Integer> id) {
        List<Integer> result = id;
        cartService.add(id);
        return "Товар Item{" +
                "itemId=" + result +
                '}'+ " успешно добавлен в корзину";
    }

    @GetMapping ("/get")
    public List<Item> getAllItems (){
        return cartService.get();
    }
}
