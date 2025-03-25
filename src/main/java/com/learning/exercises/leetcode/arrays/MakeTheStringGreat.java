package com.learning.exercises.leetcode.arrays;

import java.util.Stack;

import static java.lang.Character.toLowerCase;

public class MakeTheStringGreat {

    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (stack.isEmpty() || stack.peek() == s.charAt(i) || toLowerCase(stack.peek()) != toLowerCase(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c: stack) {
            sb.append(c);
        }

        return sb.toString();
    }

}
