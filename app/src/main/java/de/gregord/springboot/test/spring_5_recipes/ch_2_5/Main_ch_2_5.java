package de.gregord.springboot.test.spring_5_recipes.ch_2_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch_2_5 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_5.class);

    public static void init(){
        ApplicationContext
                ctx = new AnnotationConfigApplicationContext(
                        ShopConfiguration.class
        );
        Product aaa = ctx.getBean("aaa", Product.class);

        Product cdrw = ctx.getBean("cdrw", Product.class);
        Product dvdrw = ctx.getBean("dvdrw", Product.class);

        log.info("{} {} {}", aaa, cdrw, dvdrw);

        ShoppingCart cart = ctx.getBean(ShoppingCart.class);
        cart.addItems(aaa, cdrw, dvdrw);

        log.info("Shoppingcart1 items: {}", cart.getItems());

        ShoppingCart cart2 = ctx.getBean(ShoppingCart.class);
        cart2.addItems(aaa);
        log.info("Shoppingcart2 items: {}", cart2.getItems());
    }
}
