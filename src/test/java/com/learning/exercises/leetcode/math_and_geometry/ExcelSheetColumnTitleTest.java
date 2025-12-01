package com.learning.exercises.leetcode.math_and_geometry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelSheetColumnTitleTest {

    @Test
    public void convertToTitle_test() {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

        assertThat(excelSheetColumnTitle.convertToTitle(1)).isEqualTo("A");
        assertThat(excelSheetColumnTitle.convertToTitle(28)).isEqualTo("AB");
        assertThat(excelSheetColumnTitle.convertToTitle(701)).isEqualTo("ZY");
        assertThat(excelSheetColumnTitle.convertToTitle(702)).isEqualTo("ZZ");
        assertThat(excelSheetColumnTitle.convertToTitle(703)).isEqualTo("AAA");
    }

}
