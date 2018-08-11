package main.java.leetcode;

import main.java.zutil.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 18:27
 * @Desc
 */

public class SumRootToLeafNumbers {
    private class NodeWithSum{
        TreeNode node;
        int sum;
        public NodeWithSum(TreeNode node, int sum){
            this.node = node;
            this.sum = sum;
        }
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;

        int ret = 0;
        Deque<NodeWithSum> queue = new ArrayDeque<>();
        queue.offer(new NodeWithSum(root, root.val));
        while (!queue.isEmpty()){
            NodeWithSum temp = queue.poll();
            if(temp.node.left==null && temp.node.right==null) {
                ret+=temp.sum;
                continue;
            }
            if(temp.node.left!=null) queue.offer(new NodeWithSum(temp.node.left,temp.sum*10+temp.node.left.val));
            if(temp.node.right!=null) queue.offer(new NodeWithSum(temp.node.right,temp.sum*10+temp.node.right.val));
        }
        return ret;
    }
}
