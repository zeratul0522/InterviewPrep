package main.java.leetcode;

import main.java.zutil.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午4:18
 */
public class MaxDepthofBT {
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        HashSet<Integer> levels = new HashSet<>();
        visit(root, 0, levels);
        int maxLevel = 0;
        for(Integer level : levels){
            if(level >= maxLevel) maxLevel = level;
        }
        return maxLevel+1;

    }
    public void visit(TreeNode node, int level, HashSet<Integer> levels){
        if(node == null) return;
        if(!levels.contains(level)) levels.add(level);
        visit(node.left, level+1, levels);
        visit(node.right, level+1, levels);
    }

    public static void main(String[] args) {
        Integer[] nums = {};
        TreeNode root = TreeNode.generateTreeWithBFS(nums);

        MaxDepthofBT maxDepthofBT = new MaxDepthofBT();
        System.out.println(maxDepthofBT.maxDepth(root));

    }
}
