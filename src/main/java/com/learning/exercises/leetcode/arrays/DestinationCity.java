package com.learning.exercises.leetcode.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
//        Input: paths = [["B","C"],["D","B"],["C","A"]]
//        Output: "A"
//        Explanation: All possible trips are:
//        "D" -> "B" -> "C" -> "A".
//                "B" -> "C" -> "A".
//                "C" -> "A".
//                "A".
//                Clearly the destination city is "A".

        Map<String, String> map = new HashMap<>();

        for (List<String> path: paths) {
            map.put(path.get(0), path.get(1));
        }

        String destination = paths.get(0).get(1);
        while (map.containsKey(destination)) {
            destination = map.get(destination);
        }

        return destination;
    }

}
