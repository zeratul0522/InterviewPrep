package main.java.leetcode;

import main.java.zutil.ListNode;
import main.java.zutil.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/7 上午11:54
 */
public class UniqueBST2 {
    public List<TreeNode> generateTrees(int n) {
        List<List<TreeNode>> ret = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            List<TreeNode> list = new ArrayList<>();
            ret.add(list);
        }
        ret.get(0).add(null);
        if(n == 0) return new ArrayList<TreeNode>();
        ret.get(1).add(new TreeNode(1));
        if(n == 1) return ret.get(1);

        for(int h = 2; h <= n; h++){
            for (int i = 1; i <= h; i++){
                List<TreeNode> left = ret.get(i-1);
                List<TreeNode> right = ret.get(h-i);
                for(int j = 0; j < left.size(); j++){
                    for(int k = 0; k < right.size(); k++){
                        TreeNode temp = new TreeNode(i);
                        temp.left = left.get(j);
                        temp.right = enlarge(right.get(k), i);
                        ret.get(h).add(temp);
                    }
                }

            }
        }
        return ret.get(n);
    }

    private TreeNode enlarge(TreeNode node, int offset){
        if(node==null) return null;
        TreeNode temp = new TreeNode(node.val+offset);
        temp.left = enlarge(node.left, offset);
        temp.right = enlarge(node.right, offset);

        return temp;
    }
}
