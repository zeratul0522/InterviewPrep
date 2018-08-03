package main.java.leetcode;

import java.util.Arrays;

/**
 * @Desc Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/17 下午2:30
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length < 1) return "";
        StringBuilder sb = new StringBuilder();
        int minLen = strs[0].length();
       for(int i =0; i<strs.length;i++){
            if(strs[i].length()<minLen){minLen = strs[i].length();}
       }
       Arrays.sort(strs);
       for(int j = 0; j < minLen;j++){
           System.out.println("j="+j);
           if(strs[0].charAt(j)!=strs[strs.length-1].charAt(j)){
                break;
           }
           sb.append((strs[0].charAt(j)));
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        System.out.println(longestCommonPrefix.longestCommonPrefix(strs).equals(""));

    }
}
