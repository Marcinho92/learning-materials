package com.learning.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GridChallenge {

    public static void main(String[] args) {

        assertThat(gridChallenge(new ArrayList<>(List.of("eabcd", "fghij", "olkmn", "trpqs", "xywuv")))).isEqualTo("YES");
        assertThat(gridChallenge(new ArrayList<>(List.of("abc", "lmp", "qrt")))).isEqualTo("YES");
        assertThat(gridChallenge(new ArrayList<>(List.of("mpxz", "abcd", "wlmf")))).isEqualTo("NO");
        assertThat(gridChallenge(new ArrayList<>(List.of("abc", "hjk", "mpq", "rtv")))).isEqualTo("YES");

    }

    private static String gridChallenge(List<String> grid) {
        int n = grid.size();

        for (int i = 0; i < n; ++i) {
            char[] line = grid.remove(i).toCharArray();
            Arrays.sort(line);
            grid.add(i, new String(line));
        }

        for (int i = 0; i < grid.get(0).length(); ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (grid.get(j).charAt(i) > grid.get(j + 1).charAt(i)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

}