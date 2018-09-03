package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 13:10
 * @Desc
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        int lo = 0, hi = s.length()-1;
        while(lo <= hi){
            char clo = s.charAt(lo), chi = s.charAt(hi);
            if(!isValid(clo)){
                lo++;
                continue;
            }
            if(!isValid(chi)){
                hi--;
                continue;
            }
            if(Character.toLowerCase(clo) != Character.toLowerCase(chi))    return false;
            else {
                lo++;
                hi--;
            }
        }
        return true;
    }
    private boolean isValid(char c){
        if(c >='0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') return true;
        else return false;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("race a car"));
    }
}
