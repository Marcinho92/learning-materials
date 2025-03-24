package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BombermanGame {

    public static void main(String[] args) {

        assertThat(bomberMan(3, new ArrayList<>(List.of(".......", "...O...", "....O..", ".......", "OO.....", "OO....."))))
                .isEqualTo(List.of("OOO.OOO", "OO...OO", "OOO...O", "..OO.OO", "...OOOO", "...OOOO"));

    }

    private static List<String> bomberMan(int n, List<String> grid) {
// 1. Wait
// 2. New bombs
// 3. Detonate bombs
// 4. New bombs
// 5. Detonate bombs
// 6. New bombs
// 7. Detonate bombs
// 8. New bombs

        if (n == 0 || n == 1) return grid;

        if (n % 2 == 0) {
            grid.replaceAll(row -> "O".repeat(grid.get(0).length()));
            return grid;
        }

        for (int j = 0; j < grid.size(); ++j) {
            for (int k = 0; k < grid.get(0).length(); ++k) {
                if (grid.get(j).charAt(k) == 'O') {
                    StringBuilder sb = new StringBuilder(grid.get(j));
                    sb.setCharAt(k, '0');
                    grid.set(j, sb.toString());
                }
            }
        }

        for (int i = 2; i <= n; ++i) {

            if (i % 2 == 0) {
                for (int j = 0; j < grid.size(); ++j) {
                    for (int k = 0; k < grid.get(0).length(); ++k) {
                        if (grid.get(j).charAt(k) == '.') {
                            StringBuilder sb = new StringBuilder(grid.get(j));
                            sb.setCharAt(k, (char)(i + '0'));
                            grid.set(j, sb.toString());
                        }
                    }
                }
            } else {
                for (int j = 0; j < grid.size(); ++j) {
                    for (int k = 0; k < grid.get(0).length(); ++k) {
                        if (i - Character.getNumericValue(grid.get(j).charAt(k)) == 3) {
                            StringBuilder sb = new StringBuilder(grid.get(j));
                            sb.setCharAt(k, '.');
                            grid.set(j, sb.toString());

                            if (j > 0 && j < grid.size() - 1 && k > 0 && k < grid.get(0).length() - 1) {
                                sb = new StringBuilder(grid.get(j - 1));
                                sb.setCharAt(k, '.');
                                grid.set(j - 1, sb.toString());

                                sb = new StringBuilder(grid.get(j + 1));
                                sb.setCharAt(k, '.');
                                grid.set(j + 1, sb.toString());

                                sb = new StringBuilder(grid.get(j));
                                sb.setCharAt(k - 1, '.');
                                grid.set(j, sb.toString());

                                sb = new StringBuilder(grid.get(j));
                                sb.setCharAt(k + 1, '.');
                                grid.set(j, sb.toString());
                            } else if (j == 0) {
                                if (k == 0) {
                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k + 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j + 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j, sb.toString());
                                } else if (k == grid.get(0).length() - 1) {
                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(grid.get(0).length() - 2, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j + 1));
                                    sb.setCharAt(grid.get(0).length() - 1, '.');
                                    grid.set(j, sb.toString());
                                } else {
                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k + 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k - 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j + 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j, sb.toString());
                                }
                            } else if (j == grid.size() - 1) {
                                if (k == 0) {
                                    sb = new StringBuilder(grid.get(j - 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k + 1, '.');
                                    grid.set(j, sb.toString());
                                } else if (k == grid.get(0).length() - 1) {
                                    sb = new StringBuilder(grid.get(j - 1));
                                    sb.setCharAt(grid.get(0).length() - 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(grid.get(0).length() - 2, '.');
                                    grid.set(j, sb.toString());
                                } else {
                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k + 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k - 1, '.');
                                    grid.set(j, sb.toString());

                                    sb = new StringBuilder(grid.get(j - 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j, sb.toString());
                                }
                            } else {
                                if (k == 0) {
                                    sb = new StringBuilder(grid.get(j - 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j - 1, sb.toString());

                                    sb = new StringBuilder(grid.get(j + 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j + 1, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k + 1, '.');
                                    grid.set(j, sb.toString());
                                } else {
                                    sb = new StringBuilder(grid.get(j - 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j - 1, sb.toString());

                                    sb = new StringBuilder(grid.get(j + 1));
                                    sb.setCharAt(k, '.');
                                    grid.set(j + 1, sb.toString());

                                    sb = new StringBuilder(grid.get(j));
                                    sb.setCharAt(k - 1, '.');
                                    grid.set(j, sb.toString());
                                }
                            }

                        }
                    }
                }
            }

        }



        return grid;
    }

}