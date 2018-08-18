package main.java.leetcode;

import main.java.zutil.TreeLinkNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/10 下午1:04
 */
public class PopulateNextRightPointers2 {
    public void connect(TreeLinkNode root) {
        if( root==null||(root.left==null && root.right==null) ) return;
        //Move on current level
        TreeLinkNode curr = root;
        //Making links on next level
        TreeLinkNode runner = null;
        //Head of next level
        TreeLinkNode head = null;

        while(curr!=null){
            //Changes on current level
            while(curr!=null){
                if(curr.left!=null){
                    if(head==null){
                        head = curr.left;
                    }else{
                        runner.next = curr.left;
                    }
                    runner = curr.left;
                }

                if(curr.right!=null){
                    if(head==null){
                        head = curr.right;
                    }else {
                        runner.next = curr.right;
                    }
                    runner = curr.right;
                }
                curr = curr.next;
            }
            curr = head;
            head = null;
            runner = null;
        }
    }
}
