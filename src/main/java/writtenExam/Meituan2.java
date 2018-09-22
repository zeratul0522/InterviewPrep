package main.java.writtenExam;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/6 下午8:01
 */
public class Meituan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        if(t>k){
            System.out.println(0);
        }
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int l = 1; k+l-1<=n;l++){

            Map<Integer,Integer> map = new HashMap<>();
            for(int v = l; v <= k+l-1;v++){
                if(map.keySet().contains(array[v-1])){
                    int prev = map.get(array[v-1]);
                    map.put(array[v-1],prev+1);
                }else {
                    map.put(array[v-1],1);
                }
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>=t){
                    cnt++;
                    break;
                }

            }
        }

        System.out.println(cnt);
    }
}
