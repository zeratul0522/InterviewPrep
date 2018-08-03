package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/18 下午4:32
 */
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int cnt = 0; // Total number of integers that are not equal to val
            for(int i = 0; i< nums.length; i++){
                if(nums[i] != val){
                    nums[cnt] = nums[i];
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        RemoveElement.Solution rs = removeElement.new Solution();
        int [] nums = {1};
        System.out.println(rs.removeElement(nums,3));
        for(int i : nums){
            System.out.print(i);
        }

    }
}
