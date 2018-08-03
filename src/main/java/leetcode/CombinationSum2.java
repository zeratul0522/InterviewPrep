package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/28 下午8:19
 */
public class CombinationSum2 {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ret = new ArrayList<>();
            Arrays.sort(candidates);
            backtrack(ret,new ArrayList<>(),candidates,target,0);

//            HashSet<List<Integer>> filter = new HashSet<>();
//            for(List<Integer> l : ret){
//                filter.add(l);
//            }
//
//            List<List<Integer>> ret2 = new ArrayList<>();
//            for(List<Integer> l : filter){
//                ret2.add(l);
//            }
            return ret;

        }

        public void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int remain, int index){
            if(remain < 0) return;
            if(remain == 0) {
                list.add(new ArrayList<>(temp));
            }else {
                for(int i = index; i < candidates.length; i++){
                    if(i>index && candidates[i]==candidates[i-1]) continue;
                    temp.add(candidates[i]);
                    backtrack(list,temp,candidates,remain-candidates[i],i+1);
                    temp.remove(temp.size()-1);
                }
            }


        }
    }

    public static void main(String[] args) {
        CombinationSum2 combinationSum2 = new CombinationSum2();
        Solution solution = combinationSum2.new Solution();
        int[] cand = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(solution.combinationSum2(cand,target));
    }
}
