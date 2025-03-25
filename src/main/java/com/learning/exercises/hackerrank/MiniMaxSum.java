package com.learning.exercises.hackerrank;

import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        miniMaxSum(List.of(1, 3, 5, 7, 9));

    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> sortedArr = arr.stream()
                .sorted()
                .toList();

        long minSum = sortedArr.stream()
                .limit(4)
                .mapToLong(num -> num)
                .sum();
        long maxSum = sortedArr.stream()
                .skip(1)
                .mapToLong(num -> num)
                .sum();

        System.out.println(minSum + " " + maxSum);
    }

}