package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 上午10:54
 */
public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] cnt = new int[n][m]; //denotes how many unique paths to location (i,j)
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                if(obstacleGrid[i][j] == 1) cnt[i][j] = 0;
                else cnt[i][j] = -1;
            }

        }
        if(obstacleGrid[0][0]==1) return 0;
        cnt[0][0] = 1;
        for(int j = 1; j < m; j++)  {
            if( cnt[0][j] == -1) cnt[0][j] = cnt[0][j-1];

        }
        for(int i = 1; i < n; i++) {
            if(cnt[i][0] == -1) cnt[i][0] = cnt[i-1][0];
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(cnt[i][j] == 0) continue;
                cnt[i][j] = cnt[i][j-1]+cnt[i-1][j];
            }
        }

        return cnt[n-1][m-1];
    }
}
