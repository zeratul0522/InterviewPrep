package main.java.leetcode;

import main.java.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/30 下午7:05
 */
public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] numsUsed =  new boolean[nums.length];
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        permute(list,new ArrayList<Integer>(),nums,numsUsed);
        return list;
    }

    public void permute(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] numsUsed){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));return;
        }
        for(int i = 0; i < nums.length; i++){
            if(numsUsed[i]) continue;
            if(i > 0 && nums[i]==nums[i-1] &&  !numsUsed[i-1]) continue;
            numsUsed[i] = true;
            temp.add(nums[i]);
            permute(list,temp,nums,numsUsed);
            numsUsed[i] = false;
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Permutations2 permutations2 = new Permutations2();
        int[] nums = {1,1,2};
        Print.printListList(permutations2.permuteUnique(nums));
    }
}
