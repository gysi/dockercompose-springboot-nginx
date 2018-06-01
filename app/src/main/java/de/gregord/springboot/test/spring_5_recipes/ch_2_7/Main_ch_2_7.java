package de.gregord.springboot.test.spring_5_recipes.ch_2_7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;

public class Main_ch_2_7 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_7.class);

    public static void init() throws IOException {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        ShopConfiguration.class
                );

        String alert = ctx.getMessage("alert.checkout", null, Locale.US);
        String alert_inventory = ctx.getMessage(
                "alert.inventory.checkout",
                new Object[] {
                        "DVD-RW 3.0",
                        new Date()
                },
                Locale.US
        );

        log.info(alert);
        log.info(alert_inventory);

        ShoppingCart cart = ctx.getBean(ShoppingCart.class);
        cart.addItem(new Product() {
            @Override
            public String getName(){
                return "TestProduct";
            }

            @Override
            public double getPrice(){
                return 2.0;
            }
        });

        Cashier cashier = ctx.getBean(Cashier.class);
        cashier.checkout(cart);
    }
}
