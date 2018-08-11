package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 0:23
 * @Desc
 */

public class SellStock2 {
    //Sum up all ascending edges
    public int maxProfit(int[] prices) {
        int ret = 0;
        if(prices.length <= 1) return 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i]-prices[i-1]>0) ret+=prices[i]-prices[i-1];
        }
        return ret;
    }

    public static void main(String[] args) {
        SellStock2 sellStock2 = new SellStock2();
        int[] nums = {7,1,5,3,6,4};
        System.out.println(sellStock2.maxProfit(nums));
    }
}
