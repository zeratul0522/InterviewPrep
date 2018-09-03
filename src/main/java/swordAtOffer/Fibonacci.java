package main.java.swordAtOffer;

import java.io.FileNotFoundException;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 上午10:18
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n==0 || n==1) return 0;
        return Fibonacci(n-1)+ Fibonacci(n-2);
    }
}
