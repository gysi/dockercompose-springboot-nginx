package de.gregord.springboot.test.spring_5_recipes.ch_2_3;

import de.gregord.springboot.test.spring_5_recipes.ch_2_1_2.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SequenceService {

    /**
     * Resolution of component sequenceDao only works because
     * the variable name is the same as the component name.
     */
    @Autowired
    private SequenceDao sequenceDao;

    @Autowired
    private SequenceDao customVariableName;

    public String generate(String sequenceId){
        Sequence sequence = sequenceDao.getSequence(sequenceId);
        int value = sequenceDao.getNextValue(sequenceId);
        return sequence.getPrefix() + value + sequence.getSuffix();
    }

    public SequenceDao getCustomVariableName(){
        return customVariableName;
    }
}
