package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/11 上午10:25
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return NodeDepth(root)>-1;
    }

    private int NodeDepth(TreeNode node){
        //如果以节点node为根节点的树是平衡二叉树，则返回树的高度；否则返回-1
        if(node==null){
            return 0;
        }
        int left = NodeDepth(node.left);
        if(left==-1){
            return -1;
        }
        int right = NodeDepth(node.right);
        if(right==-1){
            return -1;
        }

        if(Math.abs(left-right)<=1){
            //平衡
            return Math.max(left,right)+1;
        }else {
            //不平衡
            return -1;
        }
    }
}
