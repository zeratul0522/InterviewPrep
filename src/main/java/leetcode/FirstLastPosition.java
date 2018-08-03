package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 下午10:26
 */
public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0]=ret[1]=-1;
        if(nums.length < 1) return ret;
        if(nums.length == 1){
            if(nums[0]==target){
                ret[0]=ret[1]=0;
            }
            return ret;
        }

        return searchRange(nums,target,0,nums.length-1);
    }


    public int[] searchRange(int[] nums, int target, int lo, int hi){
        int[] ret = new int[2];
        ret[0]=ret[1]=-1;

        if(lo == hi - 1){
           if(target==nums[lo]&&target!=nums[hi]) {
               ret[0]=ret[1]=lo;
           }else if(target==nums[hi]&&target!=nums[lo]){
               ret[0]=ret[1]=hi;
           }
           else if(target==nums[hi]&&target==nums[lo]){
               ret[0] = lo;
               ret[1] = hi;
           }
           return ret;
        }

        int mid = (lo + hi)/2;
        if(target == nums[mid]){
            ret[0]=ret[1]=mid;
            int tempLo = mid;
            int tempHi = mid;
            while (tempLo >= 0 && nums[tempLo]==target){
                tempLo--;
            }
            ret[0] = tempLo+1;
            while (tempHi < nums.length && nums[tempHi]==target){
                tempHi++;
            }
            ret[1] = tempHi-1;
            return ret;
        }else if(target < nums[mid]) {
            return searchRange(nums,target,lo, mid);
        }else {
            return searchRange(nums,target,mid,hi);
        }
    }
    public static void main(String[] args) {
        FirstLastPosition firstLastPosition = new FirstLastPosition();
        int nums[] = {5,7,7,8,8,8};
        int target = 8;
        for(int i : firstLastPosition.searchRange(nums,target)){
            System.out.print(i);
        }


    }
}
