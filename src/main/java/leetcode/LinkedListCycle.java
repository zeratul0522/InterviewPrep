package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/1 上午9:53
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow = head, fast = head.next;
        while (fast.next!=null && fast.next.next!=null){
            if(fast.val==slow.val) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
