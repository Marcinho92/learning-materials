package com.interview.exercises.hackerrank;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class Pangram {

    public static void main(String[] args) {

        assertThat(pangrams("We promptly judged antique ivory buckles for the next prize")).isEqualTo("pangram");

    }

    public static String pangrams(String s) {
        Set<Character> chars = new HashSet<>(Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        for (char c: s.toCharArray()) {
            chars.remove(Character.toLowerCase(c));
        }

        return chars.isEmpty() ? "pangram" : "not pangram";
    }

}