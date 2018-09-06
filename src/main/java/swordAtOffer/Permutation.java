package main.java.swordAtOffer;

import java.util.*;

/**
 * @Desc 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午11:51
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();
        if(str.length()==0)
            return ret;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];

        permute(ret,"",chars,used);

        ArrayList<String> ret2 = new ArrayList<>();
        for(String s : ret){
            if(!ret2.contains(s)){
                ret2.add(s);
            }
        }
        return ret2;
    }

    public static void permute(ArrayList<String> ret, String temp, char[] chars, boolean[] used){
        if(temp.length()==chars.length){
            ret.add(new String(temp));
            return;
        }
        for(int i = 0; i < chars.length;i++){
            if(!used[i]){
                used[i] = true;
                temp = new StringBuilder(temp).append(chars[i]).toString();
                permute(ret,temp,chars,used);
                used[i] = false;
                temp = temp.substring(0,temp.length()-1);
            }
        }
    }
}
