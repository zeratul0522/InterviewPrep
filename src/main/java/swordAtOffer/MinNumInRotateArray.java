package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 上午9:29
 */
public class MinNumInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        if(array.length==1) return array[0];
        return helper(array,array[0],0,array.length-1);
    }

    public int helper(int[] array, int start, int lo, int hi){
        if(lo==hi){
            return array[lo];
        }
        if(lo==hi-1){
            return array[lo]<array[hi]?array[lo]:array[hi];
        }
        int mid = (lo+hi)/2;
        if(array[lo]>=start && array[mid]>=start){
            return helper(array,start,mid+1,hi);
        }else{
            return helper(array,start,lo,mid);
        }

    }

    public static void main(String[] args) {
        MinNumInRotateArray minNumInRotateArray = new MinNumInRotateArray();
        int nums[] = {3,4,5,1,2};
        System.out.println(minNumInRotateArray.minNumberInRotateArray(nums));
    }
}
