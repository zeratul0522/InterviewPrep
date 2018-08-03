package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 下午7:31
 */
public class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            return binarySearchInsert(nums,target,0,nums.length-1);
        }

        public int binarySearchInsert(int[] nums, int target, int lo, int hi){
            if(lo == hi){
                if(nums[lo] >= target) return lo;
                else return lo+1;
            }

            if(hi - lo <= 1){
                if(target == nums[lo]) {
                    return lo;
                }else if(target == nums[hi]){
                    return hi;
                }else if(target < nums[lo]){
                    return lo;
                }else if(nums[lo]<target && target<nums[hi]){
                    return hi;
                }else {
                    return hi+1;
                }
            }

            int mid = (lo+hi)/2;
            if(target < nums[mid]) {
                return binarySearchInsert(nums,target,lo,mid);
            }else if(target > nums[mid]){
                return binarySearchInsert(nums,target,mid,hi);
            }else {
                return mid;
            }


        }
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        Solution solution = searchInsertPosition.new Solution();
        int nums[] = {1,3,5,6};
        System.out.println(solution.searchInsert(nums,5));

    }
}
