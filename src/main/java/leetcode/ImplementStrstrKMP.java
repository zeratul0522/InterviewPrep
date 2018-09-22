package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/10 下午4:09
 */
public class ImplementStrstrKMP {
    public static void main(String[] args) {
        ImplementStrstrKMP kmp = new ImplementStrstrKMP();
        System.out.println(kmp.strStr("hello","ll"));
        System.out.println(kmp.strStr("aaaaa","bba"));
        System.out.println(kmp.strStr("BBC ABCDAB ABCDABCDABDE","ABCDABD"));
    }

    public int strStr(String haystack, String needle) {
        // FIXME: 2018/9/10 当匹配字符串为空的时候返回0，这个是题目特定的要求，以后用的话要看具体情况
        if(needle.length()==0)
            return 0;
        if(haystack.length()==0)
            return -1;
        int[] partialMatchTable = kmpPartialMatch(needle);

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int matchCharCount = 0;

        int i = 0, j = 0, moveCount;
        while (i<haystack.length()){
            if(haystackChars[i] == needleChars[j]){
                i++;
                j++;
                matchCharCount++;
            }else {
                //如果子串的第一个字符发生不匹配，则将子串向后移动一位
                if(j==0){
                    i++;
                }else {
                    //向后移动位数=已匹配字符数目-查表得到的部分匹配值
                    //这里是j-1，因为是根据不匹配的字符的前一个进行查表的
                    moveCount = matchCharCount-partialMatchTable[j-1];
                    j-=moveCount;
                    matchCharCount-=moveCount;
                }
            }
            if(j==needleChars.length){
                return i-needle.length();
            }
        }
        return -1;
    }

    private static int[] kmpPartialMatch(String str){
        int[] ret = new int[str.length()];
        ret[0] = 0;
        if(str.length()>1){
            for(int i = 1; i < ret.length; i++){
                ret[i] = partialMatch(str.substring(0,i+1));
            }
        }
        return ret;
    }

    private static int partialMatch(String substring){
        if(substring.length()==1)
            return 0;
        String prefix = substring.substring(0,substring.length()-1);
        String suffix = substring.substring(1,substring.length());
        while (prefix.length()>0 && suffix.length()>0){
            if(prefix.equals(suffix)){
                return prefix.length();
            }

            if(prefix.length()==1){
                return 0;
            }

            prefix=prefix.substring(0, prefix.length()-1);
            suffix=suffix.substring(1,suffix.length());
        }
        return 0;
    }
}
