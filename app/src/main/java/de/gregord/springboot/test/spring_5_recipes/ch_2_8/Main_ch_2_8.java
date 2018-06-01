package de.gregord.springboot.test.spring_5_recipes.ch_2_8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main_ch_2_8 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_8.class);

    public static void init() throws IOException {
        log.info("Creating Context");
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        ShopConfiguration.class
                );

        log.info("closing ctx");
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
