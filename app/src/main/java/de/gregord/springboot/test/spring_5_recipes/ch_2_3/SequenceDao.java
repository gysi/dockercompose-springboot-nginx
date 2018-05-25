package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Sequence;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
