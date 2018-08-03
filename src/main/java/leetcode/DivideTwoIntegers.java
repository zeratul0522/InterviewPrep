package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午7:25
 */
public class DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            long ldividend = (long)dividend;
            long ldivisor = (long)divisor;
            int sign = 1;
            if((ldividend > 0 && ldivisor < 0)||(ldividend < 0 && ldivisor > 0)) sign = -1;
            ldividend = Math.abs(ldividend);
            ldivisor = Math.abs(ldivisor);
            long result = sign*ldivide(ldividend,ldivisor);
            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return (int)result;
        }

        public long ldivide(long dividend, long divisor){
            if(dividend<divisor) return 0;
            long quotient = 1;
            long sum = divisor;
            while(sum+sum <= dividend){
                sum+=sum;
                quotient+=quotient;
            }

            return quotient+ldivide(dividend-sum,divisor);
        }
    }

    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        Solution solution = divideTwoIntegers.new Solution();
        System.out.println(solution.divide(0,-3));
    }
}
