package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/10 下午3:53
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            ret.add(1);
            if(i >= 2){
                int prev = ret.get(0);
                for(int j = 1; j < i; j++){
                    int temp = ret.get(j);
                    ret.set(j,prev+ret.get(j));
                    prev = temp;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
        List<Integer> list = pascalTriangle2.getRow(0);
        for(int i : list) System.out.println(i);
    }
}
