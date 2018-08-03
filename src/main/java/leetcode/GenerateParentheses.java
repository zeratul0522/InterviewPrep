package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午9:02
 */
public class GenerateParentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ret = new ArrayList<>();
            if(n==0) {
                ret.add("");
                return ret;
            }
            for(int i = 0 ; i < n; i++){
                for(String str1 : generateParenthesis(i)){
                    for(String str2 : generateParenthesis(n-1-i)){
                       ret.add("("+str1+")"+str2);
                    }
                }
            }

            return ret;

        }
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        Solution solution = generateParentheses.new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}
