package main.java.leetcode;

import main.java.zutil.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/13 上午10:11
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode fast = head, slow = head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode middle = slow;
        ListNode curr = middle.next;
        ListNode reverseHead = curr;
        while(curr.next!=null){
            ListNode temp = curr.next.next;
            middle.next = curr.next;
            middle.next.next = reverseHead;
            curr.next = temp;
            reverseHead = middle.next;
        }

        ListNode left = head;
        ListNode right = middle.next;
        while (left!=middle){
            ListNode temp1 = left.next;
            ListNode temp2 = right.next;
            left.next = right;
            left.next.next = temp1;
            middle.next = temp2;
            left = temp1;
            right = temp2;
        }

    }

    public static void main(String[] args) {
        ReorderList r = new ReorderList();
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = ListNode.generateList(nums);
        r.reorderList(head);
        System.out.println(head);
    }
}
