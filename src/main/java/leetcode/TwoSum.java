package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/13 下午2:27
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target){
                        int[] res = new int[2];
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
            return null;
        }
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        TwoSum.Solution solution = ts.new Solution();
        int[] input = {3,2,4};
        int[] res = solution.twoSum(input,6);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
