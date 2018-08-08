package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/7 下午3:46
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
