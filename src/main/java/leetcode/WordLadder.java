package main.java.leetcode;

import java.util.*;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 13:28
 * @Desc
 */

public class WordLadder {
    private class MarkedWord{
        String word;
        int level;
        public MarkedWord(String word, int level){
            this.word = word;
            this.level = level;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordset = new HashSet<>(wordList);
        int ret = 0;
        Deque<MarkedWord> queue = new ArrayDeque<>();
        queue.offer(new MarkedWord(beginWord, 0));
        while (!queue.isEmpty()){
            MarkedWord curr = queue.poll();
            if(curr.word.equals(endWord)){
                ret = curr.level+1;
                return ret;
            }
            for(int i = 0; i < curr.word.length(); i++){
                char[] chars = curr.word.toCharArray();
                for(int j = 0; j < 26; j++){
                    if(chars[i]-'a'==j) continue;
                    chars[i] = (char)('a'+j);
                    String changed = new String(chars);
                    if(wordset.contains(changed)){
                        queue.offer(new MarkedWord(changed, curr.level+1));
                        wordset.remove(changed);
                    }
                }
            }
        }
        return ret;
    }

    //Where string a and b have the same length
//    private boolean isNear(String a, String b){
//        int editDistance = 0;
//        for(int i = 0; i < a.length(); i++){
//            if(a.charAt(i)!=b.charAt(i))    editDistance++;
//        }
//        if(editDistance == 1) return true;
//        else return false;
//    }
    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        String a = "hit";
        String b = "cog";
        String[] strings = {"hot","dot","dog","lot","log","cog"};
        System.out.println(wordLadder.ladderLength(a,b, Arrays.asList(strings)));
    }
}
