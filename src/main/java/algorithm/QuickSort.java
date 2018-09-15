package main.java.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 上午12:49
 */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a1 = {5,2,4,6,1,7,9,3};
        quickSort.quicksort(a1);
        System.out.println(Arrays.toString(a1));
    }
    public void quicksort(int[] nums){
        sort(nums,0,nums.length-1);
    }

    public void sort(int[] nums, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int j = partition(nums,lo,hi);

        sort(nums,lo,j-1);
        sort(nums,j+1,hi);
    }

    private static int partition(int[] nums, int l, int h) {
        int i = l+1, j = h;
        int v = nums[l];
        while (i<=j) {
            while (nums[i]<v && i <=j){
                i++;
            }
            while (v<nums[j] && i<=j) {
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
}
