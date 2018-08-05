package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 21:40
 * @Desc
 */

public class DecodeWays {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.startsWith("0")) return 0;
        int len = s.length();

        //dp[i] denotes there are i ways of decoding for s.substring(0,i), while dp[0] denotes empty string
        int[] dp = new int[len+1];

        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= len; i++){
            int curr = Integer.parseInt(s.substring(i-1,i));
            int prev = Integer.parseInt(s.substring(i-2,i));
            int tempCurr = 0, tempPrev = 0;
            if(curr >0 && curr <=9) tempCurr = dp[i-1];
            if(prev >= 10 && prev <= 26) tempPrev = dp[i-2];
            dp[i] = tempCurr+tempPrev;
        }
        return dp[len];
    }
}
