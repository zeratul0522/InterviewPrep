package main.java.swordAtOffer;

import java.util.Arrays;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/7 下午3:47
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<1)
            return 0;
        int p[] = new int[array.length];//p[x]代表数组中[0,x]这一段上，所有包含array[x](即末尾)的子数组中最大的和
        p[0] = array[0];
        for(int i = 1; i < p.length;i++){
            p[i] = Math.max(p[i-1]+array[i],array[i]);
        }
        //返回数组pzhongz中的最大值
        Arrays.sort(p);
        return p[p.length-1];
    }


    public static void main(String[] args) {
        int[] nums = {6,-3,-2,7,-15,1,2,2};
        //System.out.println(FindGreatestSumOfSubArray(nums));
    }
}
