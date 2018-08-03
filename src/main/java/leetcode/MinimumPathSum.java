package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 下午2:09
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] cnt = new int[n][m]; //denotes minimum path sum at location (i,j)
        cnt[0][0] = grid[0][0];
        for(int j = 1; j < m; j++)  cnt[0][j] = cnt[0][j-1] + grid[0][j];
        for(int i = 1; i < n; i++)  cnt[i][0] = cnt[i-1][0] + grid[i][0];
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                cnt[i][j] = Math.min(cnt[i][j-1],cnt[i-1][j]) + grid[i][j];
            }
        }

        return cnt[n-1][m-1];
    }

    public static void main(String[] args) {

    }
}
