package week8;

import java.util.Stack;

/***
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1 + 1"
 * Output: 2
 * Example 2:
 *
 * Input: s = " 2-1 + 2 "
 * Output: 3
 * Example 3:
 *
 * Input: s = "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 */
public class basicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0, result = 0, sign = 1;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10+(int)(c-'0');
            }
            else if(c == '+'){
                result = result+num*sign;
                sign = 1;
                num = 0;
            }
            else if(c == '-'){
                result = result+num*sign;
                sign = -1;
                num = 0;
            }
            else if(c=='('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if(c==')'){
                result = result+num*sign;
                num = 0;
                result = result*stack.pop();
                result = result+stack.pop();
            }
        }
        if(num!=0) result = result+num*sign;
        return result;
    }
}
