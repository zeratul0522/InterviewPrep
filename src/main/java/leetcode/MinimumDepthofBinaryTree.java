package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午10:20
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.right==null) return minDepth(root.left)+1;
        if(root.left==null) return minDepth(root.right)+1;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
