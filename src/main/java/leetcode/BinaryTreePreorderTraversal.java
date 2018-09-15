package main.java.leetcode;

import main.java.zutil.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/13 下午2:49
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null) return ret;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr!=null){
            while(curr!=null){
                stack.push(curr);
                ret.add(curr.val);
                curr = curr.left;

            }
            if(!stack.isEmpty()){
                curr = stack.pop();
                curr = curr.right;
            }

        }
        return ret;
    }

    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> ret = new ArrayList<>();
        helper(root,ret);
        return ret;
    }

    private void helper(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}
