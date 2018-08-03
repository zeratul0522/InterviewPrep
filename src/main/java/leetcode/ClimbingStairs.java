package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 下午3:12
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int left = 1, right = 2;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int ret = 0;
        for(int i = 3; i <=n; i++){
            ret = left+right;
            left = right;
            right = ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(5));
    }
}
