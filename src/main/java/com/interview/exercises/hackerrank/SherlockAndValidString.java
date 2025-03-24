package com.interview.exercises.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SherlockAndValidString {

    public static void main(String[] args) {

        assertThat(isValid("abc")).isEqualTo("YES");
        assertThat(isValid("abcc")).isEqualTo("YES");
        assertThat(isValid("abccc")).isEqualTo("NO");
        assertThat(isValid("aabbc")).isEqualTo("YES");

    }

    private static String isValid(String s) {
        if (s.length() < 3) return "YES";

        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        List<Integer> sorted = map.values().stream().sorted().collect(Collectors.toList());

        int min = sorted.get(0);
        int min2nd = sorted.get(1);
        int max = sorted.get(sorted.size() - 1);
        int max2nd = sorted.get(sorted.size() - 2);

        if (min == max) return "YES";
        if (max == min + 1 && min == max2nd) return "YES";
        if (min == 1 && min2nd == max) return "YES";
        return "NO";
    }

}