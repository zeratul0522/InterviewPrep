package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/20 下午9:33
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if(str.length() == 0) return 0;
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        if(str.equals("")) return 0;
        if(str.length()<=1){
            if(str.charAt(0)>='0'&&str.charAt(0)<='9') return str.charAt(0)-'0';
            else return 0;
        }
        int sign = 1;
        char first = str.charAt(0);
        if(!((first>='0'||first<='9')||((first=='+'||first=='-')&&(str.charAt(1)>='0'||str.charAt(1)<='9')))){
            return 0;
        }
        if(first == '-') {
            sign = -1;
            str = str.substring(1,str.length());
        }else if(first == '+'){
            str = str.substring(1,str.length());
        }
        System.out.println("str="+str);
        int index;
        int result = 0;
        for(index = 0;index<str.length();index++){

           // System.out.println("char = "+str.charAt(index));
            if(!(str.charAt(index)>='0'&&str.charAt(index)<='9')){
                //System.out.println("A");
                break;
            }
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10&&((str.charAt(index)-'0')>7))){
                if(sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
                result = result*10 + str.charAt(index)-'0';

        }


        return result*sign;


    }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("+1"));
        System.out.println(stringToInteger.myAtoi("42"));
        System.out.println(stringToInteger.myAtoi("   -42"));
        System.out.println(stringToInteger.myAtoi("4193 with words"));
        System.out.println(stringToInteger.myAtoi("words and 987"));
        System.out.println(stringToInteger.myAtoi("-91283472332"));
    }
}
