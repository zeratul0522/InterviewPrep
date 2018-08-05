package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 0:37
 * @Desc
 */

public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        while(curr != null && curr.next!=null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
        return head;
    }
}
