package de.gregord.springboot.test.spring_5_recipes.ch_2_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class Main_ch_2_6 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_6.class);

    public static void init() throws IOException {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        ShopConfiguration.class
                );

        Product dvdrw = ctx.getBean("dvdrw", Product.class);

        log.info("dvdrw price: {}", dvdrw.getPrice());

        Resource resource = new ClassPathResource("ch_2_6/discounts.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        log.info("And don't forget our discounts!");
        log.info("{}", props);
    }
}
