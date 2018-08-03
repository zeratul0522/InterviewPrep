package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/26 下午4:15
 */
public class RemoveNthNodeFromEnd {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode slowPrev = head;
            boolean slowModified = false;
            int count = 0;
            if(head.next == null) return null;
            for(int i=0;;i++){

                fast = fast.next;
                if(i-n+2 > 0) {
                    slow = slow.next;
                    slowModified = true;
                }
                if(i-n+2 > 1){
                    slowPrev = slowPrev.next;
                }
                if(fast.next == null) break;

            }
            if(slowModified){
                slowPrev.next = slowPrev.next.next;
                return head;
            }else {
                return head.next;
            }

        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        Solution solution = removeNthNodeFromEnd.new Solution();

    }

}
