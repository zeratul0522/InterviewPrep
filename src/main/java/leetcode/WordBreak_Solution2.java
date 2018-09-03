package main.java.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/12 14:57
 * @Desc
 */

public class WordBreak_Solution2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return helper(s, wordSet);
    }

    public boolean helper(String s, Set<String> wordSet){
        if(s.length()==0) return true;
        for(int i = 1; i <= s.length();i++){
            String temp = s.substring(0,i);
            if(wordSet.contains(temp)){
                if(helper(s.substring(i,s.length()),wordSet)){
                    return true;
                }
            }
        }
        return false;
    }
}
