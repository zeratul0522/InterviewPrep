package main.java.writtenExam;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 上午9:42
 */
public class Iqiyi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int[] count = new int[N];
        for(int i = 0; i < N; i++){
            count[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++){
            String s = sc.next();
            int tmp = sc.nextInt()-1;
            if(s.equals("A")){
                count[tmp]++;
            }else{
                count[tmp]--;
            }
        }

        int value = count[P-1];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < count.length;i++){
            list.add(count[i]);
        }

        Collections.sort(list);
        System.out.println(N - list.lastIndexOf(value));

    }
}
