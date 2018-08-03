package main.java.leetcode;

import java.util.Arrays;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 下午3:49
 */
public class NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            if(nums.length <= 1) return;
            int pivotIndex = -1;
            int replaceIndex = -1;
            for(int i = nums.length-2;i >= 0;i--){
                if(nums[i] < nums[i+1]){
                    pivotIndex = i;
                    break;
                }
            }
            if(pivotIndex == -1) {
                Arrays.sort(nums);
                return;
            }

            for(int j = nums.length-1;j > pivotIndex;j--){
                if(nums[j] > nums[pivotIndex]){
                    replaceIndex = j;
                    break;
                }
            }
           swap(nums,pivotIndex,replaceIndex);

           int lo = pivotIndex+1;
           int hi = nums.length - 1;
           while (lo <= hi){
               swap(nums,lo,hi);
               lo++;
               hi--;
           }


        }

        public void swap(int[] nums, int pivotIndex, int replaceIndex){
            int temp = nums[replaceIndex];
            nums[replaceIndex] = nums[pivotIndex];
            nums[pivotIndex] = temp;
        }
    }

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        Solution solution = nextPermutation.new Solution();
        int[] nums = {6,4,3,2,1};
        solution.nextPermutation(nums);
        for(int i : nums){
            System.out.print(i);
        }



    }

}
