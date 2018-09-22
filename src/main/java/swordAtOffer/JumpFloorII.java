package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 上午10:29
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        return 2*JumpFloorII(target-1);
    }
}
