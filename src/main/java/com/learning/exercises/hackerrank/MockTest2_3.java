package com.learning.exercises.hackerrank;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest2_3 {

    public static void main(String[] args) {

//        assertThat(anagram("cbaefd")).isEqualTo(3);
        assertThat(anagram("hhpddlnnsjfoyxpciioigvjqzfbpllssuj")).isEqualTo(10);


    }

    public static int anagram(String s) {
        if (s.length() % 2 == 1) return -1;

        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        int counter = 0;
        int index = 0;
        while (index < arrayA.length) {
            boolean foundMatchingLetter = false;
            for (int i = 0; i <arrayB.length; ++i) {
                foundMatchingLetter = arrayA[index] == arrayB[i];
                if (foundMatchingLetter) {
                    arrayB[i] = '0';
                    break;
                }
            }
            if (!foundMatchingLetter) {
                ++counter;
            }
            ++index;
        }

        return counter;
    }


}