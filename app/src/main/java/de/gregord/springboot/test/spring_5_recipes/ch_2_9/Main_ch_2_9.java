package de.gregord.springboot.test.spring_5_recipes.ch_2_9;

import de.gregord.springboot.test.spring_5_recipes.ch_2_8.ShopConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main_ch_2_9 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_9.class);

    public static void init() {
        log.info("creating context");
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        TestConfiguration.class
                );

        log.info("Getting some someStringBean");
        String someStringBean = ctx.getBean("someStringBean", String.class);
        log.info("Got some someStringBean");
        log.info("someStringBean: {}", someStringBean);
        log.info("closing context");
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
