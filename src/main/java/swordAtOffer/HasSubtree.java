package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午4:38
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return false;
        if(isTheSameTree(root1,root2))  return true;
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }

    public boolean isTheSameTree(TreeNode a, TreeNode b){
        if(b==null) return true;
        if(a==null) return false;
        if(a.val!=b.val)    return false;
        return isTheSameTree(a.left,b.left) && isTheSameTree(a.right,b.right);
    }
}
