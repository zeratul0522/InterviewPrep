package main.java.swordAtOffer;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午3:17
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode unreversedHead = head.next;
        while (unreversedHead!=null){
            ListNode temp = unreversedHead.next;
            ListNode prev = dummy.next;
            dummy.next = unreversedHead;
            dummy.next.next = prev;
            head.next = temp;
            unreversedHead = temp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.generateList(nums);
        System.out.println(reverseList.ReverseList(head));
    }
}
