package main.java.leetcode;

import java.util.Arrays;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/21 下午10:47
 */
public class ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {

            if(nums.length < 3) return 0;
            int minDiff = Math.abs(nums[0]+nums[1]+nums[2]-target);
            int minSum = nums[0]+nums[1]+nums[2];
            Arrays.sort(nums);
            for(int i = 0;i < nums.length;i++){
                if(i>0 && nums[i] == nums[i-1] ) continue;
                for(int j = i+1;j < nums.length;j++){
                    if(j>i+1 && nums[j]==nums[j-1]) continue;
                    for(int k = j+1;k<nums.length;k++){
                        if(k>j+1 && nums[k]==nums[k-1]) continue;
                        if(nums[i]+nums[k]+nums[j]==target) return target;
                        if(Math.abs(nums[i]+nums[k]+nums[j]-target) < minDiff ) {
                            minDiff = Math.abs(nums[i]+nums[k]+nums[j]-target);
                            minSum = nums[i]+nums[k]+nums[j];
                        }
                        if(nums[i]+nums[k]+nums[j]-target>0) break;

                    }
                }
            }
            return minSum;
        }
    }

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        Solution solution = threeSumClosest.new Solution();
        int[] nums = {-1,2,1,4};
        System.out.println(solution.threeSumClosest(nums,1));
    }
}
