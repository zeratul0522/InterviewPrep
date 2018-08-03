package main.java.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/30 上午10:32
 */
public class Print {

    public static void printListList(List<List<Integer>> list){
        for(List l : list){
            for(int i = 0; i < l.size(); i++){
                System.out.print(l.get(i));
            }
            System.out.println(" ");
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j : matrix[i]){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

    }
}
