package de.gregord.springboot.test.spring_5_recipes.ch_2_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
        Main_ch_2_9.class
})
public class TestConfiguration {
    @Bean
    public String someStringBean(){
        return "someStringBean";
    }
}
