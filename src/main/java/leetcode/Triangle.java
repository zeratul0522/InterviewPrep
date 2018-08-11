package main.java.leetcode;

import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/10 23:33
 * @Desc
 */

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] minPath = new int[triangle.size()];
        //Initialize the bottom
        for(int i = 0; i < minPath.length; i++){
            minPath[i] = triangle.get(triangle.size()-1).get(i);
        }

        for(int len = triangle.size()-1; len >= 1; len--){
            for(int i = 0; i < len; i++){
                minPath[i] = Math.min(minPath[i],minPath[i+1])+triangle.get(len-1).get(i);
            }
        }

        return minPath[0];
    }
}
