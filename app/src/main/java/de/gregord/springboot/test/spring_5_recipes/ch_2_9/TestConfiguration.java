package de.gregord.springboot.test.spring_5_recipes.ch_2_9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackageClasses = {
        Main_ch_2_9.class
})
public class TestConfiguration {
    private static final Logger log = LoggerFactory.getLogger(TestConfiguration.class);

    @Bean
    @Lazy
    public String someStringBean(){
        log.info("log within beginning of method someStringBean");
        return "someStringBean";
    }
}
