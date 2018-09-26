package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/26 下午3:42
 */
public class Duxiaoman01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if(a==1 && n>1){
                System.out.println("A&B");
                continue;
            }
            if(Math.pow(a,b)>=n){
                System.out.println("B");
                continue;
            }
            int cnt = 0;
            while (Math.pow(a,b)<n){
                if(Math.pow(a+1,b) >= Math.pow(a,b+1)){
                    a++;
                }else {
                    b++;
                }
                cnt++;
            }
            if(cnt%2==1){
                System.out.println("A");
                continue;
            }else {
                System.out.println("B");
                continue;
            }


        }
    }
}
