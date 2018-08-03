package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/28 下午3:06
 */
public class CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ret = new ArrayList<>();
            Arrays.sort(candidates);
            backtrack(ret,new ArrayList<>(),candidates,target,0);
            return ret;

        }

        public void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int remain, int index){
            if(remain < 0) return;
            if(remain == 0) {
                list.add(new ArrayList<>(temp));
            }else {
                for(int i = index; i < candidates.length; i++){
                    temp.add(candidates[i]);
                    backtrack(list,temp,candidates,remain-candidates[i],i);
                    temp.remove(temp.size()-1);
                }
            }


        }
    }

    public static void main(String[] args) {

    }
}
