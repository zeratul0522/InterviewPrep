package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 下午8:18
 */
public class RemoveDuplicatesArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index = 0;
            for(int i = 1;i < nums.length;i++){
                if(nums[i] != nums[i-1]) {
                    nums[++index] = nums[i];
                }
            }
            return index+1;
        }
    }

    public static void main(String args[]){
        RemoveDuplicatesArray removeDuplicatesArray = new RemoveDuplicatesArray();
        RemoveDuplicatesArray.Solution rs = removeDuplicatesArray.new Solution();
        int[] nums = {1,1,1,2,3,3,4,5,5,5,6,7};
        int newLen = rs.removeDuplicates(nums);
        for(int i = 0; i < newLen; i++){
            System.out.println(nums[i]);
        }
    }
}
