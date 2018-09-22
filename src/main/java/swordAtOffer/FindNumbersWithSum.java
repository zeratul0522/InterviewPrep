package main.java.swordAtOffer;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/11 下午2:14
 */
public class FindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(array.length<=1)
            return ret;
        int i = 0, j = array.length-1;
        while (i<j){
            int tmp = array[i]+array[j];
            if(tmp==sum){
                ret.add(array[i]);
                ret.add(array[j]);
                return ret;
            }else if(sum<tmp){
                j--;
            }else {
                i++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        list = FindNumbersWithSum(array, -1);
        System.out.println(list);
    }
}
