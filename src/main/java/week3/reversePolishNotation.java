package week3;

import java.util.Stack;

/***
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 *
 * Evaluate the expression. Return an integer that represents the value of the expression.
 *
 * Note that:
 *
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 *
 *
 * Example 1:
 *
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 */
public class reversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a = 0, b = 0;

        for(String token:tokens){
            if(token.equals("+")){
                stack.add(stack.pop()+stack.pop());
            }else if(token.equals("*")){
                stack.add(stack.pop()*stack.pop());
            }else if(token.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a-b);
            }else if(token.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a/b);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
