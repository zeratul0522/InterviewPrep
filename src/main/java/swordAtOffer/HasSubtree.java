package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

/**
 * @Desc

 * @Version Created at: 2018/9/3 下午4:38
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return false;
        if(hasSubTree(root1,root2))  return true;
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }

    public boolean hasSubTree(TreeNode a, TreeNode b){
        if(b==null) return true;
        if(a==null) return false;
        if(a.val!=b.val)    return false;
        return hasSubTree(a.left,b.left) && hasSubTree(a.right,b.right);
    }
}
