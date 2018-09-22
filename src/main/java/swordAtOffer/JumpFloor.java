package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 上午10:24
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        int[] a = new int[target+1];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        for(int i = 3; i <= target; i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[target];
    }
}
