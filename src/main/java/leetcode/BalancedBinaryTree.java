package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午10:07
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(height(root.left)-height(root.right))<=1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node){
        if(node == null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }

    public static void main(String[] args) {

    }
}
