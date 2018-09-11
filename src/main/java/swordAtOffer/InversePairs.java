package main.java.swordAtOffer;

import java.util.Arrays;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/10 下午8:01
 */
public class InversePairs {
    public int InversePairs(int [] array) {
        return helper(array,0,array.length-1)%1000000007;
    }

    private static int helper(int[] array, int lo, int hi){
        if(lo>=hi){
            return 0;
        }

//        if(lo==hi-1){
//            return array[lo]>array[hi]?1:0;
//        }

        int mid = (lo+hi)>>1;
        int ret = 0;
        ret+=helper(array,lo,mid)%1000000007;
        ret+=helper(array,mid+1,hi)%1000000007;

        int[] tmp = new int[hi-lo+1];
        int i = lo, j = mid+1, k = 0;
        while (i <= mid && j <= hi){
            if(array[i]>array[j]){
                tmp[k] = array[j];
                k++;
                j++;
                ret+=(mid-i+1);
                ret=ret%1000000007;
            }else {
                tmp[k] = array[i];
                i++;
                k++;
            }
        }
        while (i<=mid){
            tmp[k] = array[i];
            i++;
            k++;
        }
        while (j<=hi){
            tmp[k] = array[j];
            k++;
            j++;
        }

        for(int h = 0; h < tmp.length; h++){
            array[lo+h] = tmp[h];
        }
        return ret;
    }

    public static void main(String[] args) {
        InversePairs inversePairs = new InversePairs();

        int[] nums = new int[]{1,2,3,4,5,6,7,0};
        System.out.println(inversePairs.InversePairs(nums));
    }
}
