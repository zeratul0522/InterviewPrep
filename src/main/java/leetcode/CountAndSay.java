package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 下午2:55
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1){return "1";}
        StringBuilder sb = new StringBuilder();
        String s = countAndSay(n-1);
        char[] charArray = s.toCharArray();
        if(charArray.length < 2){
            sb.append(1);
            sb.append(charArray[0]);
        }else{
            char temp = charArray[0];
            int count =1;
            for(int i = 1; i < s.length();i++){
                if(charArray[i] == temp){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(temp);
                    count = 1;
                }
                temp = charArray[i];
            }
            sb.append(count);
            sb.append(temp);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        CountAndSay cas = new CountAndSay();

            for(int i = 1; i<11;i++){
                System.out.println(cas.countAndSay(i));
            }

    }
}
