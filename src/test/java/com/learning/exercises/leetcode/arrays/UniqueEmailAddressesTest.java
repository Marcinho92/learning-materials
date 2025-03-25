package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueEmailAddressesTest {

    @Test
    public void singleThreadedCPU_test() {

        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();

        assertThat(uniqueEmailAddresses.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"
        })).isEqualTo(2);
        assertThat(uniqueEmailAddresses.numUniqueEmails(new String[]{
                "a@leetcode.com","b@leetcode.com","c@leetcode.com"
        })).isEqualTo(3);

    }

}