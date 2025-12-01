package com.learning.exercises.leetcode.math_and_geometry;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int tmp = (columnNumber - 1) % 26;
            sb.append((char) ('A' + tmp));
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.reverse().toString();
    }

}
