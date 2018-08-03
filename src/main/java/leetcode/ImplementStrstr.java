package main.java.leetcode;

/**
 * @Desc Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. This is consistent to C's strstr() and Java's indexOf().
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/18 上午10:54
 */
public class ImplementStrstr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length();i++){
            int j = 0;
            while(j < needle.length() && haystack.length() > (i+j) && haystack.charAt(i+j)==needle.charAt(j)){
                ++j;
            }
            if(j == needle.length()){
                return i;
            }
            if(i+j == haystack.length()) //This is important! It can save a lot of time.
                return -1;

        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrstr implementStrstr = new ImplementStrstr();
        int ret = implementStrstr.strStr("helloworld","wo");
        System.out.println(ret);
    }

}
