package main.java.writtenExam;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 上午10:32
 */
public class Tencent02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < m;i++){
            int srcIndex = sc.nextInt()-1;
            int destIndex = sc.nextInt()-1;

            if(srcIndex!=destIndex){
                matrix[srcIndex][destIndex] = 1;
            }

        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int x = allReachable(i,matrix,n).size();
            int y = 0;
            for(int j = 0; j < n; j++){
                if(j!=i){
                    if(allReachable(j,matrix,n).contains(i)){
                        y++;
                    }
                }
            }

            if(y>x){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static Set<Integer> allReachable(int a, int[][] matrix,int n ){
        boolean[] visited = new boolean[n];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(a);
        visited[a] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            visited[temp] = true;
            Set<Integer> set = directedGet(temp,matrix);
            for(int i : set){
                if(!visited[i]){
                    queue.offer(i);
                }
            }
        }
        Set<Integer> ret = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(visited[i] && i!=a){
                ret.add(i);
            }
        }
        return ret;
    }

    public static Set<Integer> directedGet(int a, int[][] matrix){
        Set<Integer> ret = new HashSet<>();
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[a][i]==1){
                ret.add(i);
            }
        }
        return ret;
    }
}
