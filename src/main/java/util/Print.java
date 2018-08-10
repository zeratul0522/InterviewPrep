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
            System.out.print("[");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < l.size(); i++){
                sb.append(l.get(i));
                sb.append(",");
            }
            if(sb.length() > 0)  sb.delete(sb.length()-1,sb.length());
            System.out.print(sb.toString());
            System.out.println("]");
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
