package com.design_patterns.behavioural.strategy;

import java.util.Arrays;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("BubbleSortStrategy");
        Arrays.sort(numbers);
    }

}
