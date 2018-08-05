package main.java.leetcode;

import main.java.util.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/4 19:33
 * @Desc
 */

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(n,k,list,new ArrayList<>(),1);
        return list;
    }

    public void backtrack(int n, int k, List<List<Integer>> list, List<Integer> temp, int start){
        if(temp.size() == k){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= n; i++){
            temp.add(i);
            backtrack(n,k,list,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        Print.printListList( combinations.combine(4,2));
    }
}
