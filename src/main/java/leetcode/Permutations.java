package main.java.leetcode;

import main.java.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/30 上午10:17
 */
public class Permutations {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            permute(list,new ArrayList<Integer>(),nums);
            return list;
        }

        public void permute(List<List<Integer>> list, List<Integer> temp, int[] nums){
            if(temp.size() == nums.length){
                list.add(new ArrayList<>(temp));return;
            }
            for(int i = 0; i < nums.length; i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                permute(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        Solution solution = permutations.new Solution();
        int[] nums = {1,1,2};
        Print.printListList(solution.permute(nums));
    }
}
