package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 下午3:47
 */
public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            for(int i = digits.length-1;i>=0;i--){
                if(digits[i]<9){
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            return ret;
        }
    }
    public static void main(String[] args){
        PlusOne plusOne = new PlusOne();
        PlusOne.Solution ps = plusOne.new Solution();
        int[] origin = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] digits = ps.plusOne(origin);
        for(int j = 0;j<digits.length;j++){
            System.out.println(digits[j]);
        }
        //System.out.println(ps.plusOne(digits));

    }
}
