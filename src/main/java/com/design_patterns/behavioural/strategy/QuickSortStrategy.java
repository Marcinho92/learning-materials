package com.design_patterns.behavioural.strategy;

import java.util.Arrays;

public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("QuickSortStrategy");
        Arrays.sort(numbers);
    }

}
