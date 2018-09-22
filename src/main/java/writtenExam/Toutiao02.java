package main.java.writtenExam;


import java.util.Scanner;

public class Toutiao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        char[][] grid = new char[m][m];
        if(m==0){
            System.out.println(0);
            return;
        }
        for(int i = 0;i < m;i++){
            for (int j = 0;j < m;j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(numIslands(grid));


    }
    public static int numIslands(char[][] grid) {
        if(grid ==null||grid.length==0||grid[0].length==0)
            return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    markIsland(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void markIsland(int i, int j, char[][] grid,boolean[][] visited){
        visited[i][j]= true;
        if(i-1>=0 && grid[i-1][j]=='1' &&!visited[i-1][j] )
            markIsland(i-1,j,grid,visited);
        if(i+1<visited.length && grid[i+1][j]=='1' && !visited[i+1][j])
            markIsland(i+1,j,grid,visited);
        if(j-1>=0 && grid[i][j-1]=='1'&& !visited[i][j-1])
            markIsland(i,j-1,grid,visited);
        if(j+1<visited[0].length && grid[i][j+1]=='1'&& !visited[i][j+1])
            markIsland(i,j+1,grid,visited);
    }
}