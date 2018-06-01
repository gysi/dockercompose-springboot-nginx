package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch_2_3 {
    private static final Logger log = LoggerFactory.getLogger(Main_ch_2_3.class);

    public static void init() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("de.gregord.springboot.test.spring_5_recipes.ch_2_3");
//        AnnotationConfigApplicationContext ctx =
//                new AnnotationConfigApplicationContext(
//                        SequenceDaoImpl.class,
//                        SequenceService.class,
//                        SequenceConfiguration.class
//                );

        SequenceService sequenceS = ctx.getBean(SequenceService.class);
        log.info("Bean: " + sequenceS);
        log.info("CustomVariable: " + sequenceS.getCustomVariableName());

        SequenceGenerator sequenceGenerator = ctx.getBean(SequenceGenerator.class);
        log.info(sequenceGenerator.getSequence());

        log.info("works");
    }
}
