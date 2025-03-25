package com.learning.exercises.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarCipher {

    public static void main(String[] args) {

        assertThat(caesarCipher("www.abc.xy", 87)).isEqualTo("fff.jkl.gh");

    }

    private static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int DIFF_BETWEEN_START_END_OF_ALPHABET = 'z' - 'a' + 1;
        k %= DIFF_BETWEEN_START_END_OF_ALPHABET;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c + k > 'z') {
                    sb.append((char) ((c + k) - DIFF_BETWEEN_START_END_OF_ALPHABET));
                } else {
                    sb.append((char) (c + k));
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c + k > 'Z') {
                    sb.append((char) ((c + k) - DIFF_BETWEEN_START_END_OF_ALPHABET));
                } else {
                    sb.append((char) (c + k));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}