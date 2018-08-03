package main.java.leetcode;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 上午10:48
 */
public class PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0){
                return false;
            }

            if(x == reverse(x)){
                return true;
            }else return false;
        }

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
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        PalindromeNumber.Solution ps = palindromeNumber.new Solution();
        System.out.println(ps.isPalindrome(2332));
    }
}
