package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/28 下午3:40
 */
public class Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            backtrack(list,new ArrayList<>(),nums,0);
            return list;
        }

        public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int index){
            list.add(new ArrayList<>(temp));
            //if(index >= nums.length) return;
            for(int i = index; i < nums.length; i++){
                temp.add(nums[i]);
                backtrack(list,temp,nums,i+1);
                temp.remove(temp.size()-1);
            }

        }
    }

    public static void main(String[] args) {

    }
}
