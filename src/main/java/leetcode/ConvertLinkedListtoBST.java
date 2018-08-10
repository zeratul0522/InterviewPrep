package main.java.leetcode;

import main.java.zutil.ListNode;
import main.java.zutil.TreeNode;

import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/9 下午9:32
 */
public class ConvertLinkedListtoBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return new TreeNode(head.val);
        else if(head.next.next == null){
            TreeNode temp = new TreeNode(head.next.val);
            TreeNode left = new TreeNode(head.val);
            temp.left = left;
            return temp;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        //By this time, slow indicates root within this linkedlist
        TreeNode root = new TreeNode(slow.val);

        prev.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }
}
