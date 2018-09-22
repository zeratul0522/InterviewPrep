package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 下午6:48
 */
public class Zhaohang02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        if(n<3){
            System.out.println(dp[n]);
            return;
        }
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
