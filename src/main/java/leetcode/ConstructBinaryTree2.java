package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午8:36
 */
public class ConstructBinaryTree2 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0) return null;
        return construct(inorder,postorder);
    }

    public TreeNode construct(int[] inorder, int[] postorder){

        int rootVal = postorder[postorder.length-1];
        TreeNode node = new TreeNode(rootVal);
        int rootPos = -1;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == rootVal) {
                rootPos = i;
                break;
            }
        }

        int leftLen = rootPos;
        int rightLen = inorder.length-rootPos-1;

        if(leftLen > 0){
            int[] left4post = new int[leftLen];
            int[] left4in = new int[leftLen];
            for(int i = 0; i <= leftLen-1; i++){
                left4post[i] = postorder[i];
            }
            for(int i = 0; i < leftLen; i++){
                left4in[i] = inorder[i];
            }
            node.left = construct(left4in,left4post);
        }

        if(rightLen > 0){
            int[] right4post = new int[rightLen];
            int[] right4in = new int[rightLen];
            for(int i = 0; i < rightLen; i++){
                right4post[i] = postorder[i+leftLen];
            }
            for(int i = 0; i < rightLen; i++){
                right4in[i] = inorder[i+1+leftLen];
            }
            node.right = construct(right4in, right4post);
        }

        return node;

    }
}
