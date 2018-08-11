package main.java.leetcode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 18:54
 * @Desc
 */

public class SurroundedRegions {
    public void solve(char[][] board) {
        if(board.length <= 1) return;
        int rowNum = board.length;
        int colNum = board[0].length;
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j <= colNum-1; j+=(colNum-1)){
                if(board[i][j] == 'O') visit(i,j,board);
            }
        }

        for(int j = 0; j < colNum; j++){
            for(int i = 0; i <= rowNum-1; i+=(rowNum-1)){
                if(board[i][j] == 'O') visit(i,j,board);
            }
        }

        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                if(board[i][j] == 'S') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }

    }

    public void visit(int i, int j, char[][] board){
        if(i<0 || i >= board.length) return;
        if(j<0 || j >= board[0].length) return;
        if(board[i][j]=='S' || board[i][j]=='X') return;

        board[i][j] = 'S';
        visit(i+1,j,board);
        visit(i-1,j,board);
        visit(i,j+1,board);
        visit(i,j-1,board);
    }


}
