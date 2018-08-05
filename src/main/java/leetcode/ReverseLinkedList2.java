package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 23:09
 * @Desc
 */

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m >= n || m < 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftEnd = dummy;
        ListNode reverseStart = null, reverseEnd = null;
        ListNode curr = head;
        int cnt = 1;
        while(curr != null){
            if(cnt <= m-1){
                if(cnt == m-1) leftEnd = curr;
                curr = curr.next;
            }else if(cnt == m){
               reverseStart = curr;
               reverseEnd = curr;
               curr = curr.next;
            }else if(cnt <= n){
                reverseEnd.next = curr.next;
                curr.next = reverseStart;
                reverseStart = curr;
                leftEnd.next = reverseStart;
                curr = reverseEnd.next;
            }else {
                return dummy.next;
            }
            cnt++;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseLinkedList2 reverseLinkedList2 = new ReverseLinkedList2();
        int nums[] = new int[]{1,2,3,4,5};
        ListNode head = ListNode.generateList(nums);
        System.out.println(reverseLinkedList2.reverseBetween(head,1,5));

    }
}
