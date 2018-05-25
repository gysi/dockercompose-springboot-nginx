package de.gregord.springboot.test.spring_5_recipes.ch_2_1_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch_2_1_2 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_1_2.class);

    public static void init(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "de.gregord.springboot.test.spring_5_recipes.ch_2_1_2"
        );

        SequenceDao sequenceDao = context.getBean(SequenceDao.class);
        log.info("TEST: " + String.valueOf(sequenceDao.getNextValue("TEST")));
        log.info("TEST: " + String.valueOf(sequenceDao.getNextValue("TEST")));

        log.info("TEST2: " + String.valueOf(sequenceDao.getNextValue("TEST2")));
        log.info("TEST2: " + String.valueOf(sequenceDao.getNextValue("TEST2")));

    }
}
