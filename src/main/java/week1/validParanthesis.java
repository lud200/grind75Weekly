package week1;

import java.util.Stack;

/***
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class validParanthesis {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
