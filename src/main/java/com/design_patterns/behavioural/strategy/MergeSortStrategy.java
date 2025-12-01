package com.design_patterns.behavioural.strategy;

import java.util.Arrays;

public class MergeSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("MergeSortStrategy");
        Arrays.sort(numbers);
    }

}
