package com.learning.exercises.leetcode.arrays;

public class RedistributeCharactersMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
//        Input: words = ["abc","aabc","bc"]
//        Output: true
//        Explanation: Move the first 'a' in words[1] to the front of words[2],
//                to make words[1] = "abc" and words[2] = "abc".
//                All the strings are now equal to "abc", so return true.

        if (words.length == 1) {
            return true;
        }
        int total_charCount = 0;
        for (String s : words) {
            total_charCount += s.length();
        }
        if (total_charCount % words.length != 0) {
            return false;
        }

        int[] count = new int[26];

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                int index = (int) letter - 'a';
                ++count[index];
            }
        }

        for (int c : count) {
            if (c % words.length != 0) {
                return false;
            }
        }

        return true;
    }

}
