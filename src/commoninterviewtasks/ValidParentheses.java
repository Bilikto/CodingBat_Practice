package commoninterviewtasks;

import java.util.Stack;

public class ValidParentheses {

    /*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:
    Input: s = "()"
    Output: true

Example 2:
    Input: s = "()[]{}"
    Output: true

Example 3:
    Input: s = "(]"
    Output: false*/

    public static void main(String[] args) {
        String s = "([)]";

        System.out.println(isValid(s));

    }

    private static boolean isValid(String s) {
        boolean flag = true;

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char c : chars) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '{') {
                stack.push('}');
            } else if(c == '[') {
                stack.push(']');
            } else if(c != stack.pop() || stack.isEmpty()) {
                return false;
            }

        }

        return stack.isEmpty();

    }
}
