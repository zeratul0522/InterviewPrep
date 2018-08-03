package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 下午10:08
 */
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length < 1) return -1;
        if (nums.length == 1) return target==nums[0]?0:-1;
        return search(nums,target,0,nums.length-1);
    }

    public int search(int[] nums, int target, int lo, int hi){
        //if(lo == hi) return nums[lo] == target?lo:-1;
        if(lo == hi - 1){
            if(target == nums[lo]) return lo;
            if(target == nums[hi]) return hi;
            return -1;
        }

        int mid = (lo+hi)/2;
        if(nums[lo] > nums[hi]){
            if(nums[mid] > nums[lo]){
                if(target >= nums[lo] && target <= nums[mid]) return search(nums,target,lo,mid);
                else return search(nums,target,mid,hi);
            }else{
                if(target <= nums[hi] && target >= nums[mid]) return search(nums,target,mid,hi);
                else  return search(nums,target,lo,mid);
            }
        }else{
            if(target <= nums[mid]) return search(nums,target,lo,mid);
            else return search(nums,target,mid,hi);
        }
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int ret = searchRotatedSortedArray.search(nums,4);
        System.out.println(ret);
    }
}
