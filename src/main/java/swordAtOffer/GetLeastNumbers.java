package main.java.swordAtOffer;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/5 下午3:52
 */
public class GetLeastNumbers {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(input.length==0 || k > input.length)
            return ret;
        for(int i = 0; i < k; i++){
            ret.add(findKth(i,input));
        }
        return ret;
    }
//
//    public static int partition(int[] nums,int lo,int hi){
//        if(lo>hi)
//            return 0;
//        int pivot = nums[lo];
//        int i = lo, j = hi;
//        while (i < j){
//            while (nums[i]<pivot && i < j){
//                i++;
//            }
//            while (nums[j]>pivot && j > i){
//                j--;
//            }
//            if(i<j){
//                swap(nums,i,j);
//            }
//        }
//        swap(nums,lo,j);
//        return j;
//    }
    private static int partition(int[] nums, int l, int h) {
        int i = l+1, j = h;
        int v = nums[l];
        while (i<=j) {
            while (nums[i]<v && i <= j){
                i++;
            }
            while (nums[j]>v && i <= j){
                j--;
            }
            if (i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, l, j);
        return j;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    //从0开始的
    public static int findKth(int k, int[] nums){
        int lo = 0, hi = nums.length-1;
        while (lo < hi){
            int temp = partition(nums, lo, hi);

            if(k == temp){
                return nums[k];
            }else if(k < temp){
                hi = temp-1;
            }else {
                lo = temp+1;
            }
        }
        return nums[k];
    }



    public static void main(String[] args) {
        int[] a = {4,5,1,6,2,7,3,8};


        for(int i = 0; i < 8; i++){
            System.out.println(findKth(i,a));
        }
    }
}
