package main.java.leetcode;

import java.util.HashSet;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 19:55
 * @Desc
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        HashSet<Integer> used = new HashSet<>();
        int rowNum = board.length;
        int colNum = board[0].length;
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                if(word.charAt(0) == board[i][j] && visitDFS(board,word,1,i,j,used)) return true;
            }
        }
        return false;
    }

    public boolean visitDFS(char[][] board, String word, int wordIndex, int i, int j, HashSet<Integer> used){
        int index = i*board[0].length+j;
        if(used.contains(index))  return false;
        if(word.charAt(wordIndex) != board[i][j])   return false;

        if(wordIndex == word.length()-1)    return true;

        used.add(index);
        wordIndex++;
        if(i >= 1) {
            if(visitDFS(board, word, wordIndex, i-1, j, used)) return true;
        }
        if(i <= board.length -2) {
            if(visitDFS(board, word, wordIndex, i+1, j, used)) return true;
        }
        if(j >= 1) {
            if(visitDFS(board, word, wordIndex, i, j-1, used)) return true;
        }
        if(j <= board[0].length-2) {
            if(visitDFS(board, word, wordIndex, i, j+1, used)) return true;
        }
        used.remove(index);
        return false;

    }

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        char[][] board = new char[3][4];
        board[0] = new char[]{'A','B','C','E'};
        board[1] = new char[]{'S','F','C','S'};
        board[2] = new char[]{'A','D','E','E'};
        System.out.println(wordSearch.exist(board,"ABCB"));

    }


}
