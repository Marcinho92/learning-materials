package com.learning.exercises.leetcode.arrays;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
//        Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

}
