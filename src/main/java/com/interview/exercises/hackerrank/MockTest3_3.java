package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MockTest3_3 {

    public static void main(String[] args) {

//        assertThat(bigSorting(List.of("2345", "1", "200", "7111", "22", "1234", "17", "150", "3")))
//                .isEqualTo(List.of("1", "3", "17", "22", "150", "200", "1234", "2345", "7111"));
//        assertThat(bigSorting(List.of("31415926535897932384626433832795", "1", "3", "10", "3", "5")))
//                .isEqualTo(List.of("1", "3", "3", "5", "10", "31415926535897932384626433832795"));
        assertThat(bigSorting(List.of(
                "42969",
                "52657",
                "38097",
                "42295",
                "85083",
                "31678",
                "49862",
                "16061",
                "54904",
                "87093",
                "66902",
                "51740",
                "38790",
                "15166",
                "62117",
                "27325",
                "57938",
                "94673",
                "70894",
                "92501",
                "14452",
                "50168",
                "38386",
                "57720",
                "40219",
                "84692",
                "38416",
                "14353",
                "50942",
                "37008",
                "56919",
                "62438",
                "74300",
                "83444",
                "73877",
                "40046",
                "39929",
                "37634",
                "55894",
                "77410",
                "79434",
                "13795",
                "79504",
                "90784",
                "81222",
                "36682",
                "32242",
                "27910",
                "22864",
                "60843",
                "28159",
                "15215",
                "78143",
                "33903",
                "12373",
                "94057",
                "34693",
                "24159",
                "11445",
                "69978",
                "25880",
                "50248",
                "91090",
                "96152",
                "18207",
                "48873",
                "12151",
                "58724",
                "10852",
                "73485",
                "18287",
                "55748",
                "23474",
                "97647",
                "16067",
                "49786",
                "47468",
                "56026",
                "68639",
                "14125",
                "51810",
                "40468",
                "84429",
                "45807",
                "73728",
                "54526",
                "39701",
                "71288",
                "32690",
                "34958",
                "20098",
                "54331",
                "23346",
                "75827",
                "29469",
                "36920",
                "29279",
                "84412",
                "35219",
                "80613",
                "36139",
                "84630",
                "91498",
                "71611",
                "90209",
                "18795",
                "19671",
                "13986",
                "95427",
                "58726",
                "27672",
                "66670",
                "28435",
                "60312",
                "84147",
                "23254",
                "94162",
                "94756",
                "14764",
                "83861",
                "86169",
                "28286",
                "24389",
                "96358",
                "53374",
                "60553",
                "47938",
                "94329",
                "65144",
                "51527",
                "24609",
                "50557",
                "34679",
                "66861",
                "80414",
                "35563",
                "32228",
                "76732",
                "71353",
                "43951",
                "39434",
                "27506",
                "28194",
                "38996",
                "51757",
                "68581",
                "38400",
                "89204",
                "47251",
                "25302",
                "34612",
                "30004",
                "48364",
                "48197",
                "12250",
                "43287",
                "49793",
                "91912",
                "96786",
                "30890",
                "32827",
                "28230",
                "89721",
                "56523",
                "50857",
                "59315",
                "23373",
                "24839",
                "17662",
                "40831")))
                .isEqualTo(List.of("1", "3", "3", "5", "10", "31415926535897932384626433832795"));


    }

    public static List<String> bigSorting(List<String> unsorted) {
        List<String> sortedByLength = unsorted.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        Map<Integer, List<String>> groupedByLength = sortedByLength.stream()
                .collect(Collectors.groupingBy(String::length));

        List<String> sorted = new ArrayList<>();
        for (List<String> strings: groupedByLength.values()) {
            for (int i = strings.size() - 1; i > 0; --i) {
                for (int j = 0; j < i; ++j) {
                    if (isBigger(strings.get(j), strings.get(i))) {
                        String tmp = strings.get(i);
                        strings.set(i, strings.get(j));
                        strings.set(j, tmp);
                    }
                }
            }
            sorted.addAll(strings);
        }

        return sorted.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }

    private static boolean isBigger(String s1, String s2) {
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return true;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return false;
            }
        }

        return false;
    }

}