package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 23:45
 * @Desc
 */

public class SearchRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {

        HashSet<Integer> filter = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!filter.contains(nums[i])){
                list.add(nums[i]);
                filter.add(nums[i]);
            }
        }

        int[] temp = new int[list.size()];
        for(int i = 0; i < temp.length; i++){
            temp[i] = list.get(i);
        }
        if (temp.length < 1) return false;
        if (temp.length == 1) return target==temp[0]?true:false;
        return search(temp,target,0,temp.length-1)==-1?false:true;
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

}
