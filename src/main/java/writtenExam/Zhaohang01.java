package main.java.writtenExam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 下午6:48
 */
public class Zhaohang01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<Integer> appetite = new ArrayList<>();
//        List<Integer> weight = new ArrayList<>();
        String[] appetite = sc.nextLine().trim().split(" ");
        String[] weight = sc.nextLine().trim().split(" ");
        Arrays.sort(appetite);
        Arrays.sort(weight);

        boolean[] visited = new boolean[appetite.length];

        for(int i = weight.length-1; i >= 0; i--){
            int temp_weight = Integer.parseInt(weight[i]);
            int curr = -1;
            for(int j = 0; j < appetite.length; j++){
                if(Integer.parseInt(appetite[j])<=temp_weight && !visited[j]){
                    curr = j;
                }
            }
            if(curr!=-1){
                visited[curr] = true;
            }

        }

        int cnt = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
