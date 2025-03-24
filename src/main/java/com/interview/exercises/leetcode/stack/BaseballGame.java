package com.interview.exercises.leetcode.stack;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {
//        Input: ops = ["5","2","C","D","+"]
//        Output: 30
//        Explanation:
//        "5" - Add 5 to the record, record is now [5].
//        "2" - Add 2 to the record, record is now [5, 2].
//        "C" - Invalidate and remove the previous score, record is now [5].
//        "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//        "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//        The total sum is 5 + 10 + 15 = 30.

        Stack<Integer> records = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                records.pop();
            } else if (op.equals("D")) {
                Integer lastRecord = records.peek();
                records.push(lastRecord * 2);
            } else if (op.equals("+")) {
                Integer last1 = records.pop();
                Integer last2 = records.pop();
                records.push(last2);
                records.push(last1);
                records.push(last1 + last2);
            } else {
                records.push(Integer.parseInt(op));
            }
        }

        return records.stream().mapToInt(Integer::intValue).sum();
    }

}
