package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 22:20
 * @Desc
 */

public class RemoveDuplicatesArray2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;

        int currCnt = 1;
        int prev = nums[0];
        int len = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev){
                currCnt++;
            }else{
                int temp = len;
                len += currCnt >= 2 ? 2 : currCnt;
                for(int j = temp; j < len; j++){
                    nums[j] = prev;
                }
                currCnt = 1;
            }
            prev = nums[i];
        }
        int temp = len;
        len += currCnt >= 2 ? 2 : currCnt;
        for(int j = temp; j < len; j++){
            nums[j] = prev;
        }
        return len;
    }

    public static void main(String[] args) {
        RemoveDuplicatesArray2 removeDuplicatesArray2 = new RemoveDuplicatesArray2();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicatesArray2.removeDuplicates(nums));
    }
}
