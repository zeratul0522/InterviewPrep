package main.java.swordAtOffer;

import main.java.zutil.TreeNode;

/**
 * @Desc 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/2 下午9:24
 */
public class ReconstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in){
        TreeNode currRoot = new TreeNode(pre[0]);
        int rootInInorder=0;
        for(int i = 0; i < in.length; i++){
            if(in[i]==pre[0]){
                rootInInorder = i;
                break;
            }
        }

        int leftNum = rootInInorder;
        int rightNum = in.length-rootInInorder-1;
        if(leftNum>0){
            int[] leftPre = new int[leftNum];
            int[] leftIn = new int[leftNum];
            for(int i = 0; i < leftNum; i++){
                leftPre[i] = pre[i+1];
                leftIn[i] = in[i];
            }
            currRoot.left = reConstructBinaryTree(leftPre,leftIn);
        }

        if(rightNum>0){
            int[] rightPre = new int[rightNum];
            int[] rightIn = new int[rightNum];
            for(int i = 0; i < rightNum; i++){
                rightPre[i] = pre[i+leftNum+1];
                rightIn[i] = in[i+leftNum+1];
            }
            currRoot.right = reConstructBinaryTree(rightPre,rightIn);
        }
        return currRoot;
    }
}
