package main.java.leetcode;

import main.java.zutil.ListNode;

import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午8:43
 */
public class MergeTwoSortedLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode temp;
            ListNode head;

            if(l1==null) return l2;
            if(l2==null) return l1;
            if(l1.val <= l2.val){
                head = l1;
                l1 = l1.next;
            }else {
                head = l2;
                l2 = l2.next;
            }
            temp = head;
            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    temp.next = l1;
                    temp = temp.next;
                    l1 = l1.next;
                }else {
                    temp.next = l2;
                    temp = temp.next;
                    l2 = l2.next;
                }
            }

            if(l1==null){
                while(l2!=null){
                    temp.next = l2;
                    temp = temp.next;
                    l2 = l2.next;
                }
            }else {
                while(l1!=null){
                    temp.next = l1;
                    temp = temp.next;
                    l1 = l1.next;
                }
            }
            return head;
        }
    }
}
