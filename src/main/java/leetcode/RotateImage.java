package main.java.leetcode;

import javafx.scene.input.RotateEvent;
import main.java.util.Print;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/30 下午7:34
 */
public class RotateImage  {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n - 1 - i; j++){
                int temp1 = matrix[j][n-1-i];
                int temp2 = matrix[n-1-i][n-1-j];
                int temp3 = matrix[n-1-j][i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[n-1-i][n-1-j] = temp1;
                matrix[n-1-j][i] = temp2;
                matrix[i][j] = temp3;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,6,7,8};
        matrix[2] = new int[]{9,10,11,12};
        matrix[3] = new int[]{13,14,15,16};


        rotateImage.rotate(matrix);
        Print.printMatrix(matrix);

    }
}
