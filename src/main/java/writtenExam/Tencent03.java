package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 上午10:32
 */
public class Tencent03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();


            if(isValid(A,B,C)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }


    public static boolean isValid(int A, int B, int C){
        for(int j = 0; j <= 1000; j++){
            if((A*j)%B == C){
                return true;
            }
        }
        return false;
    }

    /*
    海锐的方法
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (C == 0){
                System.out.println("YES");
            }else{
                int aMod = A%B;
                if (aMod == 0)
                    System.out.println("NO");
                else{
                    boolean[] mod = new boolean[B];
                    int cur = aMod;
                    while (!mod[cur]){
                        mod[cur] = true;
                        cur = (cur+aMod)%B;
                    }
                    if (mod[C])
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }

}
