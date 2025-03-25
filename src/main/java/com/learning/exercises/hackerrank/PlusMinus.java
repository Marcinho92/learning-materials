package com.learning.exercises.hackerrank;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusMinus {

    public static void main(String[] args) {

        PlusMinus.plusMinus(List.of(1, 2, 3, 4, 0));

    }

    public static void plusMinus2(List<Integer> arr) {
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (Integer num: arr) {
            if (num > 0) ++positives;
            else if (num < 0) ++negatives;
            else ++zeros;
        }

        System.out.printf("%.6f\n", positives / arr.size());
        System.out.printf("%.6f\n", negatives / arr.size());
        System.out.printf("%.6f\n", zeros / arr.size());
    }

    public static void plusMinus(List<Integer> arr) {
        double positiveNumbers = countNumbers(arr, num -> num > 0);
        System.out.printf("%.6f\n", positiveNumbers / arr.size());

        double negativeNumbers = countNumbers(arr, num -> num < 0);
        System.out.printf("%.6f\n", negativeNumbers / arr.size());

        double zeros = countNumbers(arr, num -> num == 0);
        System.out.printf("%.6f\n", zeros / arr.size());

    }

    private static double countNumbers(List<Integer> arr, Predicate<Integer> typesOfNumbers) {
        return arr.stream()
                .filter(typesOfNumbers)
                .count();
    }

}