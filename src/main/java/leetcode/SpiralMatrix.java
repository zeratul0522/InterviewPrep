package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/1 下午9:06
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if(matrix.length == 0) return ret;
        int n = matrix.length;
        int m = matrix[0].length;
        spiral(matrix,ret,0,m,n);
        return ret;
    }

    public void spiral(int[][] matrix, List<Integer> list, int starter, int m, int n){
        if(m <= 0 || n <= 0) return;
        if(m == 1 && n == 1){
            list.add(matrix[starter][starter]);
        }else if(m == 1){
            for(int i = starter; i <= starter + n - 1; i++) list.add(matrix[i][starter+m-1]);
        }else if(n == 1){
            for(int i = starter; i <= starter + m - 1; i++) list.add(matrix[starter][i]);
        }else{
            for(int i = starter; i <= starter + m - 2; i++) list.add(matrix[starter][i]);
            for(int i = starter; i <= starter + n - 2; i++) list.add(matrix[i][starter+m-1]);
            for(int i = starter + m - 1; i > starter; i--) list.add(matrix[starter+n-1][i]);
            for(int i = starter + n - 1; i > starter; i--) list.add(matrix[i][starter]);
        }

        m -= 2;
        n -= 2;
        spiral(matrix,list,++starter,m,n);
     }


    public static void main(String[] args) {

    }
}
