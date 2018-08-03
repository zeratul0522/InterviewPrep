package main.java.leetcode;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/28 下午1:32
 */
public class ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            for(int i = 0; i < 9;i++){
                ArrayList<Character> temp = new ArrayList<>();
                for(char c : board[i]) temp.add(c);
                if(!checkRepetition(temp)) return false;
            }

            for(int j = 0; j < 9; j++){
                ArrayList<Character> temp = new ArrayList<>();
                for(int k = 0 ; k < 9; k++){
                    temp.add(board[k][j]);
                    if(!checkRepetition(temp)) return false;
                }
            }

            if(!checkSubBox(0,3,0,3,board)) return false;
            if(!checkSubBox(0,3,3,6,board)) return false;
            if(!checkSubBox(0,3,6,9,board)) return false;
            if(!checkSubBox(3,6,0,3,board)) return false;
            if(!checkSubBox(3,6,3,6,board)) return false;
            if(!checkSubBox(3,6,6,9,board)) return false;
            if(!checkSubBox(6,9,0,3,board)) return false;
            if(!checkSubBox(6,9,3,6,board)) return false;
            if(!checkSubBox(6,9,6,9,board)) return false;

            return true;
        }



        public boolean checkRepetition(ArrayList<Character> characters){
            int[] check = new int[10];
            for(char c : characters){
                if(!((c-'0'<10 && c-'0'>=0)||c=='.')) return false;
                if(c-'0'<10 && c-'0'>=0){
                    if(check[c-'0'] == 1) return false;
                    check[c-'0'] = 1;
                }
            }
            return true;
        }

        public boolean checkSubBox(int xlo,int xhi, int ylo, int yhi,char[][] board){
            for(int i = xlo; i < xhi; i++){
                for(int j = ylo; j < yhi; j++){
                    ArrayList<Character> temp = new ArrayList<>();
                    temp.add(board[i][j]);
                    if(!checkRepetition(temp)) return false;
                }
            }
            return true;
        }
    }


}
