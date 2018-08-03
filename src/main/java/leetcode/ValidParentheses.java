package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午7:02
 */
public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            int acount = 0,bcount = 0,ccount = 0;
            List<Integer> recentOccurrence = new ArrayList<>();//1 for {, 2 for [, 3 for (
            if(s.length() < 1) return true;
            if(s.length() == 1) return false;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '{') {
                    acount++;
                    recentOccurrence.add(1);
                }
                if(s.charAt(i) == '[') {
                    bcount++;
                    recentOccurrence.add(2);
                }
                if(s.charAt(i) == '(') {
                    ccount++;
                    recentOccurrence.add(3);
                }
                if(s.charAt(i) == '}') {
                    acount--;
                    if(acount < 0 || recentOccurrence.get(recentOccurrence.size()-1) != 1) return false;
                    recentOccurrence.remove(recentOccurrence.size()-1);
                }
                if(s.charAt(i) == ']') {
                    bcount--;
                    if(bcount < 0 || recentOccurrence.get(recentOccurrence.size()-1) != 2) return false;
                    recentOccurrence.remove(recentOccurrence.size()-1);
                }
                if(s.charAt(i) == ')') {
                    ccount--;
                    if(ccount < 0 || recentOccurrence.get(recentOccurrence.size()-1) != 3) return false;
                    recentOccurrence.remove(recentOccurrence.size()-1);
                }

            }
            if(recentOccurrence.size() != 0) return false;
            return true;
        }
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        Solution solution = validParentheses.new Solution();
        System.out.println(solution.isValid("[()]"));
    }
}
