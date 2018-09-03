package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 21:28
 * @Desc
 */

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0;
        for(int i = 0; i < gas.length; i++) gasSum+=gas[i];
        for(int i = 0; i < cost.length; i++) costSum+=cost[i];
        if(gasSum < costSum) return -1;

        int remain = 0, start = -1, min = Integer.MAX_VALUE;
        for(int i = 0; i < gas.length; i++){
            remain+=gas[i]-cost[i];
            if(remain <= min){
                if(i == gas.length-1) start = 0;
                else start = i+1;
                min = remain;
            }
        }
        return start;
    }
}
