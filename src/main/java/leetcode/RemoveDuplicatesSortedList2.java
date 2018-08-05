package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 0:09
 * @Desc
 */

public class RemoveDuplicatesSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        boolean flag = false;

        while(curr.next != null){
            if(flag){
                if(curr.val!=curr.next.val){
                    prev.next = curr.next;
                    flag = false;
                }
            }else {
                if(curr.val!=curr.next.val){
                    prev = curr;
                    flag = false;
                }else{
                    flag = true;
                }
            }

            curr = curr.next;
        }
        if(flag){
                prev.next = null;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedList2 removeDuplicatesSortedList2 = new RemoveDuplicatesSortedList2();
        int[] nums = {1,1};
        ListNode head = ListNode.generateList(nums);
        ListNode ret = removeDuplicatesSortedList2.deleteDuplicates(head);
        System.out.println(ret);
    }
}
