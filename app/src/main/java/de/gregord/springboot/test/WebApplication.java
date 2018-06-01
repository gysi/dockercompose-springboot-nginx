package de.gregord.springboot.test;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Main_ch_2_1_2;
import de.gregord.springboot.test.spring_5_recipes.ch_2_2.Main_ch_2_2;
import de.gregord.springboot.test.spring_5_recipes.ch_2_3.Main_ch_2_3;
import de.gregord.springboot.test.spring_5_recipes.ch_2_5.Main_ch_2_5;
import de.gregord.springboot.test.spring_5_recipes.ch_2_6.Main_ch_2_6;
import de.gregord.springboot.test.spring_5_recipes.ch_2_7.Main_ch_2_7;
import de.gregord.springboot.test.spring_5_recipes.ch_2_8.Main_ch_2_8;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebApplication {
public static final Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(WebApplication.class, args);
        Main_ch_2_8.init();
    }
}

