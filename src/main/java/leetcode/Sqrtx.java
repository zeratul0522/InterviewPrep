package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/17 下午6:56
 */
public class Sqrtx {
    public int mySqrt(int x) {
        return mySqrt(x,0,x);
    }

    public int mySqrt(long x,long lo,long hi){
        long mid = (lo+hi)/2;
        if(mid*mid>x){
            return mySqrt(x,lo,mid-1);

        }else if((mid+1)*(mid+1)<=x){
            return mySqrt(x,mid+1,hi);

        }
        return (int)mid;
    }

    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        //for(int i = 0; i < 30;i++){
            //System.out.println(i+" has sqrt value = "+sqrtx.mySqrt(i));
       // }
        System.out.println(sqrtx.mySqrt(2147395598));

    }
}
