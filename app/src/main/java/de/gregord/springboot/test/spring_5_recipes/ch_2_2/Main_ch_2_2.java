package de.gregord.springboot.test.spring_5_recipes.ch_2_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch_2_2 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_2.class);

    public static void init(){
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ShopConfiguration.class);

        Product aaa = ctx.getBean("aaa", Product.class);
        Product cdrw = ctx.getBean("cdrw", Product.class);

        log.info(aaa.toString());
        log.info(cdrw.toString());
    }
}
