package de.gregord.springboot.test.spring_5_recipes.ch_2_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator seqGen = new SequenceGenerator();
        seqGen.setPrefix("30");
        seqGen.setSuffic("A");
        seqGen.setInitial(100);
        return seqGen;
    }
}
