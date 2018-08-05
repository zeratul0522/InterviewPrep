package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 16:15
 * @Desc
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index4m = m-1, index4n = n-1, mergedLen = m+n-1;
        while(index4m >= 0 && index4n >= 0){
            if(nums1[index4m] >= nums2[index4n]){
                nums1[mergedLen--] = nums1[index4m--];
            }else{
                nums1[mergedLen--] = nums2[index4n--];
            }
        }

        while (index4n >= 0){
            nums1[mergedLen--] = nums2[index4n--];
        }
    }
}
