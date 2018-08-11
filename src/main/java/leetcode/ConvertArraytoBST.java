package main.java.leetcode;

import main.java.zutil.TreeNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午8:49
 */
public class ConvertArraytoBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return construct(nums);
    }

    public TreeNode construct(int[] nums){
        int mid = (nums.length-1)/2;
        TreeNode node = new TreeNode(nums[mid]);

        int[] left = new int[mid];
        int[] right = new int[nums.length-mid-1];
        for(int i =0; i < left.length; i++){
            left[i] = nums[i];
        }
        for(int j = 0; j < right.length; j++){
            right[j] = nums[j+1+left.length];
        }

        if(left.length == 1) node.left = new TreeNode(left[0]);
        else if(left.length == 2){
            node.left = new TreeNode(left[1]);
            node.left.left = new TreeNode(left[0]);
        }else if(left.length > 2){
            node.left = construct(left);
        }

        if(right.length == 1) node.right = new TreeNode(right[0]);
        else if(right.length == 2){
            node.right = new TreeNode(right[1]);
            node.right.left = new TreeNode(right[0]);
        }else if(right.length > 2){
            node.right = construct(right);
        }
        return node;
    }
}
