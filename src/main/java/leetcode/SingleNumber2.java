package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 23:21
 * @Desc
 */

public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for(int i : nums){
            a = (a ^ i) & ~b;
            b = (b ^ i) & ~a;
        }
        return a;
    }
}
