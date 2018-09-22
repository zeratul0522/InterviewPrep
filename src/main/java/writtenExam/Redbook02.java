package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 下午3:27
 */
public class Redbook02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(0);
            return;
        }

        //判断一个数有多少个因子5
        int[] factor = new int[n+1];
        for (int i=1; i<=n; i++){
            if (i%5==0)
                factor[i] = factor[i/5]+1;
        }

        //cnt代表n!中的5因子总个数
        int[] cnt = new int[n+1];
        for(int i = 1; i <= n; i++){
            cnt[i] = cnt[i-1]+factor[i];
        }
        int ret = 0;
        for(int i = 1; i <= n; i++){
            ret+=cnt[i];
        }
        System.out.println(ret);



    }
}
