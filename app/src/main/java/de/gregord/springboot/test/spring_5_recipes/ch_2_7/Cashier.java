package de.gregord.springboot.test.spring_5_recipes.ch_2_7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Locale;

@Component
public class Cashier {
    private static final Logger log = LoggerFactory.getLogger(Cashier.class);

    private final MessageSource messageSource;

    @Autowired
    public Cashier(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void checkout(ShoppingCart shoppingCart){
        String alert = messageSource.getMessage(
                "alert.inventory.checkout",
                new Object[] {
                        shoppingCart.getItems(),
                        new Date()
                },
                Locale.US
        );

        log.info(alert);
    }
}
