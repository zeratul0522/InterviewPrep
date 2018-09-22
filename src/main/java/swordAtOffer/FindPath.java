package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午4:18
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(root==null)  return ret;
        backtrack(ret,new ArrayList<>(),target,root);
        return ret;
    }

    public static void backtrack(ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> path, int target, TreeNode node){
        path.add(node.val);
        if(target < node.val)   return;
        if(node.left==null && node.right==null){
            if(target==node.val)
                lists.add(path);
            return;
        }
        if(node.left!=null){
            backtrack(lists,new ArrayList<>(path),target-node.val,node.left);
        }
        if(node.right!=null){
            backtrack(lists,new ArrayList<>(path),target-node.val,node.right);
        }

    }
}
