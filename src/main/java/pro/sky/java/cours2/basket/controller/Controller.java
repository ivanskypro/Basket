package pro.sky.java.cours2.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.cours2.basket.model.Item;
import pro.sky.java.cours2.basket.service.BasketService;

import java.util.List;

@RestController
@RequestMapping (path = "/store/order")
public class Controller {
    private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int id) {
        Item result = basketService.add(id);
        return "товар с артикулом " + result + " успешно добавлен в корзину";
    }

    @GetMapping ("/get")
    public List<Item> getAllItems (){
        List<Item> result = basketService.get();
        return result;
    }

}
