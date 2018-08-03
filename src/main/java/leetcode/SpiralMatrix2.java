package main.java.leetcode;

import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/2 下午7:09
 */
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        generate(ret, 0, n,1);
        return ret;
    }

    public void generate(int[][] matrix, int starter, int m, int ele){
        if(m <= 0)  return;
        if(m == 1)  matrix[starter][starter] = ele++;
        else{
            for(int i = starter; i <= starter + m - 2; i++) matrix[starter][i] = ele++;
            for(int i = starter; i <= starter + m - 2; i++) matrix[i][starter+m-1] = ele++;
            for(int i = starter + m - 1; i > starter; i--) matrix[starter+m-1][i] = ele++;
            for(int i = starter + m - 1; i > starter; i--) matrix[i][starter] = ele++;
        }

        m -= 2;
        generate(matrix,++starter,m,ele);
    }
    public static void main(String[] args) {

    }
}
