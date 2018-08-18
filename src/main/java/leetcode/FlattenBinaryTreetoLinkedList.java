package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/10 上午10:00
 */
public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;

        flatten(left);
        flatten(right);

        root.left = null;
        root.right = left;

        TreeNode runner = root;
        while(runner.right!=null) runner = runner.right;
        runner.right = right;
    }
}
