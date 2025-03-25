package com.learning.exercises.leetcode.two_pointers;

public class ReverseInteger {

    public int reverse(int x) {
        if (x == 0) return x;

        char[] array = String.valueOf(x).toCharArray();

        StringBuilder sb = new StringBuilder();

        int left = 0, right = array.length - 1;
        if (array[0] == '-') {
            sb.append("-");
            ++left;
        }

        while (array[right] == '0') {
            --right;
        }

        for (int i = right; i >= left; --i) {
            sb.append(array[i]);
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}