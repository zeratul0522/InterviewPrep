package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/21 下午11:19
 */
public class LetterCombinationsPhoneNumber {
    class Solution {
        public List<String> letterCombinations(String digits) {

            List<String> ret = new ArrayList<String>();
            if(digits.length() == 0) return ret;
            if(digits.length() == 1) {
                switch (digits.charAt(0)-'0'){
                    case 2:ret.add("a"); ret.add("b");ret.add("c"); break;
                    case 3:ret.add("d"); ret.add("e");ret.add("f"); break;
                    case 4:ret.add("g"); ret.add("h");ret.add("i"); break;
                    case 5:ret.add("j"); ret.add("k");ret.add("l"); break;
                    case 6:ret.add("m"); ret.add("n");ret.add("o"); break;
                    case 7:ret.add("p"); ret.add("q"); ret.add("r");ret.add("s");break;
                    case 8:ret.add("t");ret.add("u");ret.add("v");break;
                    case 9: ret.add("w"); ret.add("x"); ret.add("y");ret.add("z");break;
                    default:break;
                }
                return ret;

            }
            for(String s : letterCombinations(digits.substring(0,digits.length()-1))){
                switch (digits.charAt(digits.length()-1)-'0'){
                    case 2:ret.add(new StringBuilder(s).append("a").toString()); ret.add(new StringBuilder(s).append("b").toString());ret.add(new StringBuilder(s).append("c").toString()); break;
                    case 3:ret.add(new StringBuilder(s).append("d").toString()); ret.add(new StringBuilder(s).append("e").toString());ret.add(new StringBuilder(s).append("f").toString()); break;
                    case 4:ret.add(new StringBuilder(s).append("g").toString()); ret.add(new StringBuilder(s).append("h").toString());ret.add(new StringBuilder(s).append("i").toString()); break;
                    case 5:ret.add(new StringBuilder(s).append("j").toString()); ret.add(new StringBuilder(s).append("k").toString());ret.add(new StringBuilder(s).append("l").toString()); break;
                    case 6:ret.add(new StringBuilder(s).append("m").toString()); ret.add(new StringBuilder(s).append("n").toString());ret.add(new StringBuilder(s).append("o").toString()); break;
                    case 7:ret.add(new StringBuilder(s).append("p").toString()); ret.add(new StringBuilder(s).append("q").toString()); ret.add(new StringBuilder(s).append("r").toString());ret.add(new StringBuilder(s).append("s").toString());break;
                    case 8:ret.add(new StringBuilder(s).append("t").toString());ret.add(new StringBuilder(s).append("u").toString());ret.add(new StringBuilder(s).append("v").toString());break;
                    case 9: ret.add(new StringBuilder(s).append("w").toString()); ret.add(new StringBuilder(s).append("x").toString()); ret.add(new StringBuilder(s).append("y").toString());ret.add(new StringBuilder(s).append("z").toString());break;
                    default:break;
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        LetterCombinationsPhoneNumber letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
        Solution solution = letterCombinationsPhoneNumber.new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
