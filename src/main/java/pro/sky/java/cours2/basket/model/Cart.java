package pro.sky.java.cours2.basket.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Scope("prototype")
public class Cart {
    private List<Item> basketList = new ArrayList<>();

    @Bean
    @SessionScope
    public List<Item> getBasketList () {
        return basketList;
    }
}








