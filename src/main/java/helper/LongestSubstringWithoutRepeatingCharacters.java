package main.java.helper;

import java.util.HashSet;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/9/19 11:07
 * @Desc
 */

public class LongestSubstringWithoutRepeatingCharacters {
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
