package main.java.leetcode;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/21 下午4:53
 */
public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            if(nums.length < 3) return ret;
            Arrays.sort(nums);
            for(int i = 0; i< nums.length-2;i++){
                if(i>0 && nums[i] == nums[i-1] ) continue;
                int j = i+1;
                int k = nums.length-1;
                while(j < k){
                    if(nums[j]+nums[k] == 0 - nums[i]){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                        ret.add(temp);
                        j++;
                        while(nums[j]==nums[j-1] && j < k) j++;
                        k--;
                        while(nums[k]==nums[k+1] && j < k) k--;
                    }else if(nums[j]+nums[k] < 0 - nums[i]){
                        j++;
                        while(nums[j]==nums[j-1] && j < k) j++;
                    }else {
                        k--;
                        while(nums[k]==nums[k+1] && j < k) k--;
                    }
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        Solution solution = threeSum.new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));
    }
}
