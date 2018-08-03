package main.java.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/2 上午9:44
 */
enum Index{
    GOOD,BAD,UNKNOWN
}
public class JumpGame {
    public boolean canJump(int[] nums) {
        Index[] index = new Index[nums.length];
        for(int i = 0; i < nums.length; i++){
            index[i] = Index.UNKNOWN;
        }
        index[nums.length-1] = Index.GOOD;

        for(int i = nums.length-2; i >= 0; i--){
            for(int j = i+1; j <= Math.min(nums.length-1,i+nums[i]);j++){
                if(index[j] == Index.GOOD) {
                    index[i] =Index.GOOD;
                    break;
                }
            }
        }

        return index[0] == Index.GOOD;
    }


    public static void main(String[] args) {
//        JumpGame jumpGame = new JumpGame();
//        int[] nums = {3,2,1,0,4};
//        List<Integer> list = new ArrayList<>();
//        jumpGame.jump(0,list,nums);
//        System.out.println(Collections.max(list));
    }
}
