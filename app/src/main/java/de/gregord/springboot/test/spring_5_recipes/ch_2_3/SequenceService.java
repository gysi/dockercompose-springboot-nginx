package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceService {

    private final SequenceDao sequenceDao;

    @Autowired
    public SequenceService(SequenceDao sequenceDao) {
        this.sequenceDao = sequenceDao;
    }

    public String generate(String sequenceId){
        Sequence sequence = sequenceDao.getSequence(sequenceId);
        int value = sequenceDao.getNextValue(sequenceId);
        return sequence.getPrefix() + value + sequence.getSuffix();
    }
}
