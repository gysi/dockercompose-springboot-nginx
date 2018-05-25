package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfiguration {

    @Bean
    public DatePrefixGenerator datePrefixGenerator(){
        DatePrefixGenerator dgp = new DatePrefixGenerator();
        dgp.setPattern("yyyyMMdd");
        return dgp;
    }

    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffic("A");
        sequence.setPrefixGenerator(datePrefixGenerator());

        return sequence;
    }
}
