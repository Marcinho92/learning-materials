package com.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MutexTest {

    @Test
    public void givenUnsafeSequenceGenerator_whenRaceCondition_thenUnexpectedBehavior() throws Exception {
        int count = 1000;
//        Set<Integer> uniqueSequences = getUniqueSequences(new SequenceGenerator(), count);
//        assertThat(uniqueSequences.size()).isEqualTo(count);
    }

}
