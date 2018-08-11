package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/10 23:58
 * @Desc
 */

public class SellStock {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int lowest = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }else if((prices[i]-lowest)>maxProfit){
                maxProfit = prices[i]-lowest;
            }
        }
        return maxProfit;
    }
}
