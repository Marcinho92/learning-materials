package com.interview.exercises.leetcode.bit_manipulation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
//        Input: num = [1,2,0,0], k = 34
//        Output: [1,2,3,4]
//        Explanation: 1200 + 34 = 1234

        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }

}
