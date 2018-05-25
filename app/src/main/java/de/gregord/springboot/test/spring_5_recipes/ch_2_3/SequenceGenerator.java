package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger(0);

    public SequenceGenerator(){

    }

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public void setSuffic(String suffix){
        this.suffix = suffix;
    }

    public void setInitial(int initial){
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator){

    }

    public String getSequence(){
        return prefix +
                initial +
                counter.getAndIncrement() +
                suffix;
    }
}
