package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午2:29
 */
public class ImplBitCount {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n!=0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}
