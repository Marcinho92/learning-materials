package com.learning.exercises.hackerrank;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class BalancedBrackets {

    public static void main(String[] args) {

//        assertThat(isBalanced("{[()]}")).isEqualTo("YES");
//        assertThat(isBalanced("{[(])}")).isEqualTo("NO");
//        assertThat(isBalanced("{{[[(())]]}}")).isEqualTo("YES");
        assertThat(isBalanced("}][}}(}][))]")).isEqualTo("NO");

    }

    private static String isBalanced(String s) {
        Stack<Character> brackets = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') brackets.push(')');
            else if (c == '{') brackets.push('}');
            else if (c == '[') brackets.push(']');
            else {
                if (brackets.isEmpty() || brackets.pop() != c) return "NO";
            }
        }

        return brackets.empty() ? "YES" : "NO";
    }

}