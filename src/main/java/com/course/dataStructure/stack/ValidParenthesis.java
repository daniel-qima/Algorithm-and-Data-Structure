package com.course.dataStructure.stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

    }

    public static Boolean solution (String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // c 不是开区间 是毕区间
                if (stack.isEmpty())
                    return false;
                Character top = stack.pop();
                if (c == ')' && top != ')'){
                    return false;
                }
                if (c == '}' && top != '}') return false;

                if (c == ']' && top != ']') return false;
            }
        }
        return stack.isEmpty();
    }
}
