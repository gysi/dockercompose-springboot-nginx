package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger(0);

    private PrefixGenerator prefixGenerator;

    public SequenceGenerator(){

    }

    public void setSuffic(String suffix){
        this.suffix = suffix;
    }

    public void setInitial(int initial){
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator){
        this.prefixGenerator = prefixGenerator;
    }

//    public PrefixGenerator[] getPrefixGenerators(){
//        return this.prefixGenerators;
//    }

    private PrefixGenerator getPrefixGenerator(){
        return this.prefixGenerator;
    }

    private String getPrefix(){
        if(getPrefixGenerator() != null){
            return getPrefixGenerator().getPrefix();
        }

        return null;
    }

    public String getSequence(){
        return getPrefix() +
                initial +
                counter.getAndIncrement() +
                suffix;
    }
}
