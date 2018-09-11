package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/11 上午10:00
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return NodeDepth(root);
    }

    private int NodeDepth(TreeNode node){
        if(node.left==null && node.right==null){
            return 1;
        }else if(node.left==null){
            return NodeDepth(node.right)+1;
        }else if(node.right==null){
            return NodeDepth(node.left)+1;
        }else {
            return Math.max(NodeDepth(node.left),NodeDepth(node.right))+1;
        }
    }

}
