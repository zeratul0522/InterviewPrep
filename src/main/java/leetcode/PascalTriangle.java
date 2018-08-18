package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/10 下午3:35
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows==0) return ret;
        if(numRows==1){
            List<Integer> firstline = new ArrayList<>();
            firstline.add(1);
            ret.add(firstline);
            return ret;
        }
        List<List<Integer>> prev = generate(numRows-1);
        List<Integer> prevLine = prev.get(prev.size()-1);
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            if(i==0 || i == numRows-1){
                temp.add(1);
            }else {
                temp.add(prevLine.get(i-1)+prevLine.get(i));
            }
        }
        ret = prev;
        ret.add(temp);
        return ret;
    }
}
