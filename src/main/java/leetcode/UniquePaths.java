package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 上午10:29
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] cnt = new int[n][m]; //denotes how many unique paths to location (i,j)
        cnt[0][0] = 1;
        for(int j = 1; j < m; j++)  cnt[0][j] = 1;
        for(int i = 1; i < n; i++)  cnt[i][0] = 1;

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                cnt[i][j] = cnt[i][j-1]+cnt[i-1][j];
            }
        }

        return cnt[n-1][m-1];

    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(7,3));
    }
}
