package main.java.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/13 下午7:48
 */
public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }else if(token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
