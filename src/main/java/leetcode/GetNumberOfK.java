package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/11 上午9:29
 */
public class GetNumberOfK {
    public static void main(String[] args) {
        GetNumberOfK g = new GetNumberOfK();
        int[] nums = {1,2,3,4,5,6,6,6,6,7,8};
        System.out.println(g.GetNumberOfK(nums,7));
    }

    public int GetNumberOfK(int [] array , int k) {
        if(array.length==0)
            return 0;
        int cnt;
        int tmp = helper(array,k,0,array.length-1);
        if(tmp==-1){
            return 0;
        }else {
            cnt = 1;
            int i = tmp, j = tmp;
            while (i<=array.length-1 && array[i]==k){
                i++;
                cnt++;
            }
            cnt--;
            while (j >= 0 && array[j]==k){
                j--;
                cnt++;
            }
            cnt--;
        }
        return cnt;
    }

    /*
    用二分法找到一个值为k的下标
     */
    private int helper(int[] array, int k, int lo, int hi){

        if(lo==hi){
            return array[lo]==k?lo:-1;
        }

        int mid = (lo+hi)/2;
        System.out.println("lo="+lo+ " hi="+hi+" array[mid]="+array[mid]+" k="+k);
        if(k<array[mid]){
            return helper(array,k,lo,mid-1);
        }else if(k == array[mid]){
            return mid;
        }else {
            return helper(array,k,mid+1,hi);
        }
    }
}
