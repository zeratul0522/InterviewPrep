package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午7:35
 */
public class ConstructBinaryTree {
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if(preorder.length == 0) return null;
            return construct(preorder,inorder);
        }

        public TreeNode construct(int[] preorder, int[] inorder){

            int rootVal = preorder[0];
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
            System.out.println("rootval="+rootVal);

            if(leftLen > 0){
                int[] left4pre = new int[leftLen];
                int[] left4in = new int[leftLen];
                for(int i = 0; i <= leftLen-1; i++){
                    left4pre[i] = preorder[i+1];
                }
                for(int i = 0; i < leftLen; i++){
                    left4in[i] = inorder[i];
                }
                node.left = construct(left4pre,left4in);
            }

            if(rightLen > 0){
                int[] right4pre = new int[rightLen];
                int[] right4in = new int[rightLen];
                for(int i = 0; i < rightLen; i++){
                    right4pre[i] = preorder[i+1+leftLen];
                }
                for(int i = 0; i < rightLen; i++){
                    right4in[i] = inorder[i+1+leftLen];
                }
                node.right = construct(right4pre, right4in);
            }

            return node;

        }


    }

    public static void main(String[] args) {
        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        Solution solution = constructBinaryTree.new Solution();
//     System.out.println(solution.binarySearchArray(nums,9));


        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        //System.out.println(solution.binarySearchArray(inorder,3));
        //solution.buildTree(preorder,inorder);

    }
}
