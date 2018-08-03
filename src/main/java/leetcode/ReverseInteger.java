package main.java.leetcode;

import java.util.ArrayList;

/**
 * @Desc Given a 32-bit signed integer, reverse digits of an integer.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/13 下午5:10
 */
public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            Long result = 0L;
            while(x >= 10 || x <= -10){
                arrayList.add(x % 10);
                x = (x - x % 10)/10;
            }
            arrayList.add(x);
            for(int i = arrayList.size()-1; i >= 0; i --){
                result += Math.round(arrayList.get(i) * Math.pow(10,arrayList.size()-i-1));
            }
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }else {
                int resultInt = result.intValue();
                return resultInt;
            }
        }
    }
    public static void main(String[] args){
        ReverseInteger reverseInteger = new ReverseInteger();
        ReverseInteger.Solution rs = reverseInteger.new Solution();
        System.out.println(rs.reverse(1534236469));
        System.out.println(rs.reverse(57));
        System.out.println(rs.reverse(10));
    }
}
