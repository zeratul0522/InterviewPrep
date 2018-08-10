package main.java.leetcode;

import main.java.zutil.TreeNode;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午3:59
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public static class TreeNodeWithLevel{
        public TreeNode node;
        public int level;

        public TreeNodeWithLevel(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<LinkedList<Integer>> list = new LinkedList<>();
        if(root == null) return new ArrayList<List<Integer>>();
        Deque<TreeNodeWithLevel> queue = new ArrayDeque<>();
        queue.offer(new TreeNodeWithLevel(root, 0));
        while(!queue.isEmpty()){
            TreeNodeWithLevel queueHead = queue.poll();
            int level = queueHead.level;
            if(list.size() < level+1) list.add(new LinkedList<Integer>());

            if(level%2==0)  list.get(level).add(queueHead.node.val);
            else list.get(level).addFirst(queueHead.node.val);


            if(queueHead.node.left != null) queue.offer(new TreeNodeWithLevel(queueHead.node.left, level+1));
            if(queueHead.node.right != null) queue.offer(new TreeNodeWithLevel(queueHead.node.right, level+1));
        }
        return new ArrayList<>(list);
    }

}
