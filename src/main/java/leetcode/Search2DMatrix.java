package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 15:26
 * @Desc
 */

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int begin = 0, end = row_num * col_num - 1;

        while(begin <= end){
            int mid = (begin + end) / 2;
            int mid_value = matrix[mid/col_num][mid%col_num];

            if( mid_value == target){
                return true;

            }else if(mid_value < target){
                //Should move a bit further, otherwise dead loop.
                begin = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int[][] matrix = new int [3][4];
        matrix[0] = new int[]{1,3,5,7};
        matrix[1] = new int[]{9,11,13,15};
        matrix[2] = new int[]{17,19,21,23};
       search2DMatrix.searchMatrix(matrix, 8);
    }
}
