package de.gregord.springboot.test;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Main_ch_2_1_2;
import de.gregord.springboot.test.spring_5_recipes.ch_2_2.Main_ch_2_2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//mv
public class WebApplication {
public static final Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(WebApplication.class, args);
        Main_ch_2_2.init();
    }
}

