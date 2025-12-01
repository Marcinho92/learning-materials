package com.learning.exercises.leetcode.math_and_geometry;

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        String shorter = str1.length() >= str2.length() ? str2 : str1;
        String longer = str1.length() < str2.length() ? str2 : str1;

        for (int i = shorter.length(); i > 0; --i) {
            if (longer.length() % i == 0 && shorter.length() % i == 0) {
                String tmp = shorter.substring(0, i);
                int factorLong = longer.length() / i;
                int factorShort = shorter.length() / i;
                if (tmp.repeat(factorLong).equals(longer)
                        && tmp.repeat(factorShort).equals(shorter)) {
                    return tmp;
                }
            }
        }

        return "";
    }

}
