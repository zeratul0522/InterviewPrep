package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午11:26
 */
public class ConvertBSTtoDoubleLinkedList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null || pRootOfTree.left==null&&pRootOfTree.right==null)
            return pRootOfTree;
        List<TreeNode> list = new ArrayList<>();
        helper(pRootOfTree,list);
        for(int i = 0; i < list.size()-1; i++){
            list.get(i).right = list.get(i+1);
            list.get(i+1).left = list.get(i);
        }
        return list.get(0);

    }

    public static void helper(TreeNode node, List<TreeNode> list){
        if(node.left==null && node.right==null){
            list.add(node);
            return;
        }else {
            if(node.left!=null){
                helper(node.left,list);
            }
            list.add(node);
            if(node.right!=null){
                helper(node.right,list);
            }
        }
    }

    public static void main(String[] args) {
        ConvertBSTtoDoubleLinkedList convertBSTtoDoubleLinkedList = new ConvertBSTtoDoubleLinkedList();
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        a1.left=a2;
        a1.right=a3;
        a2.left=a4;
        a3.left=a5;
        convertBSTtoDoubleLinkedList.Convert(a1);

    }
}
