package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/29 下午2:52
 */
public class MultiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {
            if(num1.equals("0")||num2.equals("0")) return "0";
            int m = num1.length(),n = num2.length();
            List<String> nlist = new ArrayList<>();
            for(int i = n-1; i >= 0; i--){
                StringBuilder sb = new StringBuilder();
                int carry = 0;
                for(int h = m-1; h >= 0; h--){
                    int quotient = ((num2.charAt(i)-'0')*(num1.charAt(h)-'0')+carry)/10;
                    int remainder = ((num2.charAt(i)-'0')*(num1.charAt(h)-'0')+carry)%10;
                    sb.append(remainder);
                    carry = quotient;
                }
                if(carry > 0) sb.append(carry);
                sb = sb.reverse();
                for(int k = 0; k < n-1-i; k++){
                    sb.append(0);
                }
                nlist.add(sb.reverse().toString());
            }

            int maxLen = nlist.get(nlist.size()-1).length();

            int nCarry = 0;
            StringBuilder ret = new StringBuilder();
            for(int i = 0; i < maxLen; i++){

                int temp = 0;
                for(int j = 0; j < nlist.size();j++){
                    if(nlist.get(j).length() >= i+1)    temp += nlist.get(j).charAt(i)-'0';
                }
                int quotient = (temp+nCarry)/10;
                int remainder = (temp+nCarry)%10;
                ret.append(remainder);
                nCarry = quotient;
            }

            if(nCarry > 0){
                ret.append(nCarry);
            }

            return ret.reverse().toString();


        }
    }
    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        Solution solution = multiplyStrings.new Solution();
        System.out.println(solution.multiply("1234","123"));

    }
}
