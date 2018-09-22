package main.java.swordAtOffer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 上午10:51
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int m = popA.length;
        if(m==1)    return pushA[0]==popA[0];
        int popIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m; i++){
            stack.push(pushA[i]);
            while ((!stack.isEmpty()) && popIndex<m && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return popIndex>=m-1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,3,5,1,2};
        IsPopOrder isPopOrder = new IsPopOrder();
        System.out.println(isPopOrder.IsPopOrder(a,b));
    }
}
