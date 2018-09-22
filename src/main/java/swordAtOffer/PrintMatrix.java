package main.java.swordAtOffer;

import main.java.util.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午7:13
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(matrix.length == 0) return ret;
        int n = matrix.length;
        int m = matrix[0].length;
        spiral(matrix,ret,0,m,n);
        return ret;
    }

    public void spiral(int[][] matrix, ArrayList<Integer> list, int starter, int m, int n){
        if(m <= 0 || n <= 0) return;
        if(m == 1 && n == 1){
            list.add(matrix[starter][starter]);
        }else if(m == 1){
            for(int i = starter; i <= starter + n - 1; i++) list.add(matrix[i][starter+m-1]);
        }else if(n == 1){
            for(int i = starter; i <= starter + m - 1; i++) list.add(matrix[starter][i]);
        }else{
            for(int i = starter; i <= starter + m - 2; i++) list.add(matrix[starter][i]);
            for(int i = starter; i <= starter + n - 2; i++) list.add(matrix[i][starter+m-1]);
            for(int i = starter + m - 1; i > starter; i--) list.add(matrix[starter+n-1][i]);
            for(int i = starter + n - 1; i > starter; i--) list.add(matrix[i][starter]);
        }

        m -= 2;
        n -= 2;
        spiral(matrix,list,++starter,m,n);
    }


    public static void main(String[] args) {
        PrintMatrix printMatrix = new PrintMatrix();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8};
        int[] nums3 = {9,10,11,12};
        int[] nums4 = {13,14,15,16};
        int[][] matrix = new int[4][4];
        matrix[0] = nums1;
        matrix[1] = nums2;
        matrix[2] = nums3;
        matrix[3] = nums4;

        System.out.println(printMatrix.printMatrix(matrix));
    }
}
