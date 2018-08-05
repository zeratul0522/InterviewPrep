package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 16:30
 * @Desc
 */

public class SortColors {
    public void sortColors(int[] nums) {
        int lastZeroIndex = -1;
        int firstTwoIndex = nums.length;
        for(int i = 0; i < firstTwoIndex; i++){
            if(nums[i]==0){
                swap(i,++lastZeroIndex,nums);
            }else if(nums[i]==2){
                swap(i--,--firstTwoIndex,nums);
            }
        }

    }
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sortColors.sortColors(nums);
        for(int num : nums) System.out.print(num);
    }

}
