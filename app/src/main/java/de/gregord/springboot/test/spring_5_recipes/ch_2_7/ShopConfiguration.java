package de.gregord.springboot.test.spring_5_recipes.ch_2_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackageClasses = {
        ShoppingCart.class,
        Cashier.class
})
public class ShopConfiguration {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:ch_2_7/messages");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }
}
