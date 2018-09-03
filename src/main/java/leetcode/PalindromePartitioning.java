package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 19:12
 * @Desc
 */

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<>();
        if(s.length()<=1){
            List<String> temp = new ArrayList<>();
            temp.add(s);
            ret.add(temp);
            return ret;
        }

        helper(s,new ArrayList<>(),ret);
        return ret;
    }

    public void helper(String s, List<String> temp, List<List<String>> ret){
        if(s.length()==0)   ret.add(new ArrayList<>(temp));

        for(int i = 1; i <= s.length();i++){
            String left = s.substring(0,i);
            if(isPalindrome(left)){
                String right = s.substring(i,s.length());
                temp.add(left);
                helper(right,temp,ret);
                temp.remove(temp.size()-1);
            }

        }
    }

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String temp = sb.reverse().toString();
        return temp.equals(s);
    }

    public static void main(String[] args) {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        System.out.println(palindromePartitioning.isPalindrome("ab"));
    }
}
