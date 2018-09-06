package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午2:53
 */
public class PrintFromTopToBottom {
    /*
    牛客网上用Deque或PriorityQueue都有问题，所以就用ArrayList来模拟队列
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root==null)  return ret;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.remove(0);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
            ret.add(tmp.val);
        }
        return ret;

    }

}
