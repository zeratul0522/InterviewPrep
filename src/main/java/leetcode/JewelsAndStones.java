package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 下午8:53
 */
public class JewelsAndStones {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            int ret = 0;
            if(S == null || J == null){
                return ret;
            }
            char[] chars = S.toCharArray();
            for(char c : chars){
                if(J.contains(String.valueOf(c))){
                    ret++;
                }
            }
            return ret;
        }
    }
}
