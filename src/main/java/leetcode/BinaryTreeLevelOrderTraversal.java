package main.java.leetcode;

import main.java.zutil.ListNode;
import main.java.zutil.TestUtils;
import main.java.zutil.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Desc Based on BFS.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午2:20
 */

public class BinaryTreeLevelOrderTraversal {
    public static class TreeNodeWithLevel{
        public TreeNode node;
        public int level;

        public TreeNodeWithLevel(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNodeWithLevel> queue = new ArrayDeque<>();
        queue.offer(new TreeNodeWithLevel(root, 0));
        while(!queue.isEmpty()){
            TreeNodeWithLevel queueHead = queue.poll();
            int level = queueHead.level;
            if(list.size() < level+1) list.add(new ArrayList<Integer>());
            list.get(level).add(queueHead.node.val);

            if(queueHead.node.left != null) queue.offer(new TreeNodeWithLevel(queueHead.node.left, level+1));
            if(queueHead.node.right != null) queue.offer(new TreeNodeWithLevel(queueHead.node.right, level+1));
        }
        return list;

    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        Integer[] nums = {3};
        TreeNode root = TreeNode.generateTreeWithBFS(nums);
        List<List<Integer>> list = binaryTreeLevelOrderTraversal.levelOrder(root);
        System.out.println(TestUtils.printNestedList(list));

    }

}
