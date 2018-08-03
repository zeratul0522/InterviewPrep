package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/2 下午6:52
 */
public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        s = s.trim();
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' ') return s.length()-1-i;
        }
        return s.length();
    }

    public static void main(String[] args) {

    }
}
