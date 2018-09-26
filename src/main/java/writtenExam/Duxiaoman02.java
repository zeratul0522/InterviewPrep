package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/26 下午3:58
 */
public class Duxiaoman02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for(int i = 0; i < n; i++){
            nodes[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n-1; j++){
            int cnt = 0;
            for(int x = 0; x <=j; x++){
                for(int y = j+1; y < nodes.length; y++){
                    if(nodes[x]!=nodes[y]){
                        cnt++;
                    }
                }
            }

            sb.append(cnt);
            sb.append(" ");
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }
}
