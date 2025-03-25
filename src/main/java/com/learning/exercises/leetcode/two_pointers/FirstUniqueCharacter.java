package com.learning.exercises.leetcode.two_pointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstUniqueCharacter {


    public int firstUniqChar(String s) {
        Set<Character> chars = new HashSet<>();
        List<Character> uniqueChars = new ArrayList<>();

        char firstUnique = ' ';
        for (char c : s.toCharArray()) {
            if (!chars.contains(c)) {
                if (firstUnique == ' ') {
                    firstUnique = c;
                }
                chars.add(c);
                uniqueChars.add(c);
            } else {
                uniqueChars.remove(Character.valueOf(c));
                if (firstUnique == c) {
                    firstUnique = uniqueChars.isEmpty() ? ' ' : uniqueChars.get(0);
                }
            }
        }

        return firstUnique == ' ' ? -1 : s.indexOf(firstUnique);
    }
}