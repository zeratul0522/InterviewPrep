package main.java.leetcode;

import main.java.zutil.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午10:43
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<>(),root,sum);
        return list;
    }

    public void helper(List<List<Integer>> list, List<Integer> temp, TreeNode root, int sum){
        if(root==null) return;
        temp.add(root.val);
        if(root.right==null && root.left==null){
            if(root.val==sum){
                list.add(new ArrayList<>(temp));
            }
        }

        helper(list,new ArrayList<>(temp),root.left,sum-root.val);
        helper(list,new ArrayList<>(temp),root.right,sum-root.val);
    }

}
