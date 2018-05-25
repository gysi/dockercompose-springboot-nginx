package de.gregord.springboot.test.spring_5_recipes.ch_2_1_2;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
