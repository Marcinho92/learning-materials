package com.interview.exercises.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeConversion {

    public static void main(String[] args) {

        System.out.println(TimeConversion.timeConversion("12:45:54PM"));
        assertThat(TimeConversion.timeConversion("12:45:54PM")).isEqualTo("12:45:54");

    }

    public static String timeConversion(String s) {
        boolean isMorning = s.endsWith("AM");

        if (isMorning) {
            if (s.startsWith("12")) {
                return "00" + s.substring(2, 8);
            } else {
                return s.substring(0, 8);
            }
        } else {
            if (s.startsWith("12")) {
                return "12" + s.substring(2, 8);
            } else {
                return Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, 8);
            }
        }

    }

}