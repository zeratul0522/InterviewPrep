package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/6 上午9:25
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> ret = new ArrayList<>();
        if(s.length() < 4 || s.length() > 12) return ret;
        for(int i = 1; i <= 3 && i <= len-3; i++){
            for(int j = i+1; j <= i+3 && j <= len-2; j++){
                for(int k = j+1; k <= j+3 && k <= len-1; k++){
                    String s1 = s.substring(0,i);
                    String s2 = s.substring(i,j);
                    String s3 = s.substring(j,k);
                    String s4 = s.substring(k,len);
                    if(checkValid(s1) && checkValid(s2) && checkValid(s3) && checkValid(s4)){
                        StringBuilder sb = new StringBuilder();
                        sb.append(s1);
                        sb.append(".");
                        sb.append(s2);
                        sb.append(".");
                        sb.append(s3);
                        sb.append(".");
                        sb.append(s4);
                        ret.add(sb.toString());
                    }
                }
            }
        }
        return ret;
    }

    private boolean checkValid(String str){
        if(str.length() < 1 || str.length() > 3) return false;
        if(str.length() >= 2 && str.startsWith("0")) return false;
        if(Integer.parseInt(str) > 255 || Integer.parseInt(str) < 0) return false;
        return true;

    }

    public static void main(String[] args) {
        System.out.println("a");
    }
}
