package main.java.leetcode;

/**
 * @Desc Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 下午8:12
 */
public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums.length < 1) return 0;
            int max = nums[0];
            int maxSubarrayWithEnd = nums[0];
            for(int i = 1; i < nums.length; i++){
                maxSubarrayWithEnd = Math.max(nums[i],maxSubarrayWithEnd+nums[i]);
                max = Math.max(max,maxSubarrayWithEnd);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        Solution solution = maximumSubarray.new Solution();
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }

}
