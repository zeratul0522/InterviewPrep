package main.java.swordAtOffer;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/12 下午2:16
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null || pHead.next==null){
            return null;
        }

        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                fast = pHead;
                while (fast!=slow){
                    fast = fast.next;
                    slow = slow.next;

                }
                return slow;

            }
        }
        return null;

    }
}
