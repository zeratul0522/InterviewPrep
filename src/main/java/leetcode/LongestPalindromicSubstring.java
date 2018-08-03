package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/19 下午10:31
 */
public class LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            int maxPalinLen = 0;
            int maxStart = 0;
            int maxEnd = 0;
            int[][] isPalindromic = new int[s.length()][s.length()]; //isPalindromic[i][j]表示s.substring(i,j+1)是回文,1代表是，0代表不是
            for(int j = 0; j < s.length();j++){
                for(int i = 0; i <= j; i++){
                    int palinLen = 0;
                    if(i == j) {
                        isPalindromic[i][j] = 1;
                        palinLen = 1;
                    }else if(i == j - 1){
                        if(s.charAt(i) == s.charAt(j)) {
                            isPalindromic[i][j] = 1;
                            palinLen = 2;
                        }

                    }else {
                        if(s.charAt(i) == s.charAt(j) && isPalindromic[i+1][j-1]==1) {
                            isPalindromic[i][j] = 1;
                            palinLen = j - i + 1;
                        }
                    }
                    if(palinLen > maxPalinLen){
                        maxPalinLen = palinLen;
                        maxStart = i;
                        maxEnd = j+1;

                    }
                }
            }
            return s.substring(maxStart,maxEnd);
        }
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        Solution solution = longestPalindromicSubstring.new Solution();
        System.out.println(solution.longestPalindrome("babad"));

    }
}
