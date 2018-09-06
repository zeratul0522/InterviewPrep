package main.java.swordAtOffer;

import java.io.PipedWriter;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午2:33
 */
public class ImplPower {
    public double Power(double base, int exponent) {
        if(exponent==-1)    return 1/base;
        if(exponent==0) return 1;
        if(exponent==1) return base;
        return exponent%2==0?Power(base,exponent/2)*Power(base,exponent/2)
                :Power(base,exponent/2)*Power(base,exponent/2)*Power(base,exponent%2);
    }

    public static void main(String[] args) {
        System.out.println(127&-2);
    }
}
