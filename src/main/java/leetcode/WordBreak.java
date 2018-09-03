package main.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/12 13:57
 * @Desc
 */

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        if(s.length()==0) return true;
        boolean[] breakable = new boolean[s.length()+1];//breakable[i] denotes if s.substring(0,i) can be broken.
        breakable[0] = true;
        for(int i = 1; i < breakable.length; i++){
            //Calculate breakable[i]
            for(int j = 0; j < i; j++){
                if(breakable[j] && wordSet.contains(s.substring(j,i))) {
                    breakable[i] = true;
                    break;
                }

            }
        }
        return breakable[breakable.length-1];
    }

    public static void main(String[] args) {

    }
}
