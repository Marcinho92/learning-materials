package com.learning.exercises.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindAllNumbersDisappearedInArrayTest {

    @Test
    public void singleThreadedCPU_test() {

        FindAllNumbersDisappearedInArray findAllNumbersDisappearedInArray = new FindAllNumbersDisappearedInArray();

        assertThat(findAllNumbersDisappearedInArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).isEqualTo(List.of(5, 6));
        assertThat(findAllNumbersDisappearedInArray.findDisappearedNumbers(new int[]{1, 1})).isEqualTo(List.of(2));

    }

}