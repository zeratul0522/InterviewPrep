package main.java.leetcode;

import main.java.zutil.TreeLinkNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/10 上午10:30
 */
public class PopulateNextRightPointers {
    public class NodeWithLevel{
        TreeLinkNode node;
        int level;
        public NodeWithLevel(TreeLinkNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public void connect(TreeLinkNode root) {
        if(root==null || (root.left==null&&root.right==null)) return;
        Deque<NodeWithLevel> queue = new ArrayDeque<>();
        NodeWithLevel prev = null;
        queue.offer(new NodeWithLevel(root, 0));
        while(!queue.isEmpty()){
            NodeWithLevel temp = queue.poll();
            if(prev!=null && temp.level==prev.level){
                prev.node.next = temp.node;
            }else if(prev!=null && temp.level>prev.level){
                prev.node.next = null;
            }
            prev = temp;
            if(temp.node.left!=null)    queue.offer(new NodeWithLevel(temp.node.left, temp.level+1));
            if(temp.node.right!=null)    queue.offer(new NodeWithLevel(temp.node.right, temp.level+1));
        }
    }

    public static void main(String[] args) {

    }
}
