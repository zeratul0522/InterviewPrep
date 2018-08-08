package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/7 上午10:27
 */
public class UniqueBST {
    //How to solve this problem: F(j, n) = G(j-1) * G(n-j)
    public int numTrees(int n) {
        int[] uniqueBST = new int[n+1];
        uniqueBST[0] = 1;
        uniqueBST[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                uniqueBST[i] += uniqueBST[j-1] * uniqueBST[i-j];
            }
        }
        return uniqueBST[n];
    }
}
