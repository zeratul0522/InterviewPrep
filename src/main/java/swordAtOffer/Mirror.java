package main.java.swordAtOffer;

import main.java.zutil.ListNode;
import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午6:59
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        helper(root);
    }

    public TreeNode helper(TreeNode node){
        if(node==null || (node.left==null &&node.right==null)){
            return node;
        }
        TreeNode tmp = node.left;
        node.left = helper(node.right);
        node.right = helper(tmp);
        return node;
    }
}
