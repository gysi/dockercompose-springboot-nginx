package de.gregord.springboot.test.spring_5_recipes.ch_2_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch_2_1 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_1.class);

    public static void init(){
        log.info("test1");
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
        SequenceGenerator bean = context.getBean(SequenceGenerator.class);
        log.info(bean.getSequence());
        log.info("test2");
    }
}
