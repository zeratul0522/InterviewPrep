package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/1 下午7:40
 */
public class Power {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n == 1) return x;
       double half = myPow(x,n/2);
       if(n%2!=0) return n<0 ? 1/x*half*half : x*half*half;
       else return  half*half;
    }




    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.myPow(2,5));

    }
}
