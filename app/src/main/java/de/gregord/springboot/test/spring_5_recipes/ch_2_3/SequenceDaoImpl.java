package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Sequence;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao {

    private final Map<String, Sequence> sequences = new HashMap<>();
    private final Map<String, AtomicInteger> values = new HashMap<>();

    public SequenceDaoImpl(){
        sequences.put("TEST", new Sequence("TEST", "prefix", "suffix"));
        sequences.put("TEST2", new Sequence("TEST2", "prefix", "suffix"));

        values.put("TEST", new AtomicInteger(1));
        values.put("TEST2", new AtomicInteger(10));
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get(sequenceId);
    }

    @Override
    public int getNextValue(String sequenceId) {
        return values.get(sequenceId).getAndIncrement();
    }
}
