package main.java.leetcode;

import java.util.HashSet;

/**
 * @Desc Given a string, find the length of the longest substring without repeating characters.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/19 下午7:23
 */
public class LongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s.length() <= 1) return s.length();
            HashSet<Character> window = new HashSet<Character>();
            int start = 0;
            //int end = 0;
            int maxWinLen = 0;
            window.add(s.charAt(0));
            for(int i = 1; i < s.length();i++){
                if(!window.contains(s.charAt(i))){
                    window.add(s.charAt(i));
                }else {

                    while (s.charAt(i) != s.charAt(start)){
                        window.remove(s.charAt(start));
                        start++;
                    }
                    start++;
                }
                int winLen = i - start+1;
                if(winLen > maxWinLen) maxWinLen = winLen;
            }
            return maxWinLen;
        }
    }

    public static void main(String[] args) {
        String s = "tmmzuxt";

        LongestSubstring longestSubstring = new LongestSubstring();
        Solution solution = longestSubstring.new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));

    }
}
