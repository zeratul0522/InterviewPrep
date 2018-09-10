package main.java.writtenExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int j = 0; j < m; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                matrix[x-1][y-1] = 1;
                matrix[y-1][x-1] = 1;
            }
            Boolean isVisited[] = new Boolean[n];
            List<List<Integer>> assign = new ArrayList<>();
            for(int k = 0; k < n; k++){
                if(!isVisited[k]){
                    isVisited[k]=true;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(k);
                    for(int l = k+1; l < n; l++){
                        if(!isVisited[l] && matrix[k][l]==0){
                            temp.add(l);
                            isVisited[l]=true;
                        }
                    }
                    assign.add(temp);
                }

            }

            for(List<Integer> temp : assign){
                for(int p = 0; p < temp.size();p++){
                    for(int q = p+1; q<temp.size();q++){
                        if(matrix[temp.get(p)][temp.get(q)]==1){
                            System.out.println("No");
                            return;
                        }
                    }
                }
            }
            System.out.println("Yes");

        }


    }
}


/*
package main.java.writtenExam;


import java.util.Scanner;

public class Jd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++){
            System.out.println("Yes");
        }
    }
}

 */