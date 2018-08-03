package main.java.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/25 下午4:55
 */
public class Recur {

    public List<String> recur(String str, int num){
        List<String> ret = new ArrayList<String>();
        char x = str.charAt(str.length()-num);
        if(num == 1){
            for(int j = 0; j < x-'0';j++){
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                ret.add(sb.toString());
            }
            return ret;
        }

        System.out.println(x);
        for(int i = 0; i < (x-'0');i++){
            for(String s : recur(str,num-1)){
                System.out.println("i="+i+"s="+s);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(s);
                ret.add(sb.toString());
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        Recur r = new Recur();
        System.out.println(r.recur("123",3));
    }
}
