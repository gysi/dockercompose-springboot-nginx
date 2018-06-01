package de.gregord.springboot.test.spring_5_recipes.ch_2_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ShoppingCart.class)
public class ShopConfiguration {

    @Bean
    public Product aaa(){
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Product cdrw(){
        return new Disc("CD-RW", 1.5, 1000);
    }

    @Bean
    public Product dvdrw(){
        return new Disc("DVD-RW", 3.0, 700);
    }
}
