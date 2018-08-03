package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 下午4:25
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRowContainsZero = false;
        boolean firstColumnContainsZero = false;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) firstRowContainsZero = true;
                    if(j == 0) firstColumnContainsZero = true;
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
               if(matrix[i][0] == 0 || matrix[0][j] == 0)   matrix[i][j] = 0;
            }
        }

        if(firstRowContainsZero){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        if(firstColumnContainsZero){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

}
