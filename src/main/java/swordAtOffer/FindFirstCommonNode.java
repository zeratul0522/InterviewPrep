package main.java.swordAtOffer;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/10 下午9:02
 */
public class FindFirstCommonNode {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1.next==null || pHead2.next==null)
            return null;
        ListNode curr = pHead2;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = pHead2;

        ListNode slow = pHead1, fast = pHead1;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                fast = pHead1;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);


        node1.next = node3;
        node2.next = node4;
        node4.next = node5;
        node3.next = node6;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;


        System.out.println(FindFirstCommonNode(node1,node2).val);

    }
}
