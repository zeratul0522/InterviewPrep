package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/8 下午3:45
 */
public class Netease02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        int[] k = new int[num];
        int[] output = new int[num];
        for(int h = 0;h < num;h++){
            n[h] = sc.nextInt();
            k[h] = sc.nextInt();
        }
        for(int i = 0;i<num;i++){
            if(n[i]<=2 || k[i]<2){
                output[i] = 0;
            }else{
                if(k[i]<=n[i]-k[i]){
                    output[i] = k[i]-1;
                }else{
                    output[i] = n[i]-k[i];
                }
            }

        }
        for(int j = 0;j<num;j++){
            System.out.println("0 "+output[j]);
        }
    }
}

