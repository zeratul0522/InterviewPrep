package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午2:08
 */
public class FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            if(nums.length < 4) return ret;
            Arrays.sort(nums);
            for(int h = 0 ;h < nums.length-3;h++){
                if(h > 0 && nums[h] == nums[h-1]) continue;
                for(int i = h+1; i< nums.length-2;i++){
                    if(i > h+1 && nums[i] == nums[i-1] ) continue;
                    int j = i+1;
                    int k = nums.length-1;
                    while(j < k){
                        if(nums[j]+nums[k] == target - nums[i]-nums[h]){
                            ArrayList<Integer> temp = new ArrayList<Integer>();


                            temp.add(nums[h]);temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                            ret.add(temp);
                            j++;
                            while(nums[j]==nums[j-1] && j < k) j++;
                            k--;
                            while(nums[k]==nums[k+1] && j < k) k--;
                        }else if(nums[j]+nums[k] < target - nums[i]-nums[h]){
                            j++;
                            while(nums[j]==nums[j-1] && j < k) j++;
                        }else {
                            k--;
                            while(nums[k]==nums[k+1] && j < k) k--;
                        }
                    }
                }
            }

            return ret;
        }
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        Solution solution = fourSum.new Solution();
        int[] nums = {-3,-1,0,2,4,5};
        System.out.println(solution.fourSum(nums,2));

    }
}
