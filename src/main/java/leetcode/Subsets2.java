package main.java.leetcode;

import main.java.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 20:38
 * @Desc
 */

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        Arrays.sort(nums);
        backtrack(hashSet, new ArrayList<>(), nums, 0);
        List<List<Integer>> ret = new ArrayList<>();
        for(List<Integer> list : hashSet){
            ret.add(list);
        }
        return ret;
    }

    public void backtrack(HashSet<List<Integer>> hashSet, List<Integer> list, int[] nums, int index){
        hashSet.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(hashSet, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Subsets2 subsets2 = new Subsets2();
        int[] nums = {1,2,2};
        Print.printListList(subsets2.subsetsWithDup(nums));

    }
}
