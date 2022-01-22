package pro.sky.java.cours2.basket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.cours2.basket.model.Cart;

@Configuration
public class ConfigurationCart {
    private Cart cart;

    @Bean
    @SessionScope
    public Cart getCart () {
        return new Cart ();
    }
}
