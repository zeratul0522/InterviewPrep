package main.java.writtenExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午7:31
 */
public class Pdd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        char[][] map = new char[n][m];
        for(int i = 0; i < n; i++){
            String str = sc.next();
            for(int j = 0; j < m; j++){
                map[i][j] = str.charAt(j);
            }
        }
        sc.close();

        for(int ii = m-1; ii >=0; ii--){
            int index = -1;
            for(int i = n-1; i >=0; i--){
                if(map[i][ii]=='x'){
                    index = i;
                }else if (map[i][ii] == 'o') {
                    if(index==-1){
                        map[i][ii] = '.';
                        continue;
                    }
                    map[i][ii] = '.';
                    map[index-1][ii] = 'o';
                    index --;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(map[i]);
        }
    }
}
