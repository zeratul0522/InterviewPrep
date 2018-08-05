package main.java.leetcode;

import main.java.zutil.ListNode;

import java.util.*;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 15:46
 * @Desc
 */

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        Queue<ListNode> queue = new LinkedList<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null){
            if(curr.next.val >= x){
                queue.offer(curr.next);
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        while (queue.size() != 0){
            curr.next =queue.poll();
            curr = curr.next;
        }
        curr.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        int[] nums = {1,4,3,2,5,2};
        ListNode head = ListNode.generateList(nums);
        int x = 3;
        System.out.println(partitionList.partition(head, x));

    }
}
