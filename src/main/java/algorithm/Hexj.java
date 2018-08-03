package main.java.algorithm;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/25 下午8:03
 */
public class Hexj {
    public ArrayList<String> iteration(String str){

        if(str.length() < 1) return null;
        if(str.length()==1){
            ArrayList<String> ret = new ArrayList<String>();
            for(int k = 0; k < str.charAt(0)-'0';k++){
                ret.add(""+k);
            }
            return ret;
        }

        ArrayList<String> result = new ArrayList<String>();
        for(int h = 0; h < str.charAt(str.length()-1)-'0';h++){
            result.add(""+h);
        }
        for(int i = 1; i < str.length();i++){
            ArrayList<String> temp = new ArrayList<String>();
            for(int j = 0; j < str.charAt(str.length()-1-i)-'0';j++){
                for(String s : result){
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append(s);
                    temp.add(sb.toString());
                }
            }
            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        Hexj hexj = new Hexj();
        System.out.println(hexj.iteration("223"));
    }

}
