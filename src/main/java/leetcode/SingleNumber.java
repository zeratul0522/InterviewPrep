package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 22:00
 * @Desc Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int i : nums){
            ret ^= i;
        }
        return ret;
    }
}
