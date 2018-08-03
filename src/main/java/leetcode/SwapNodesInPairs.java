package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc Given a linked list, swap every two adjacent nodes and return its head.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/27 上午10:55
 */
public class SwapNodesInPairs {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null ) return head;

           ListNode lo = head;
            ListNode hi = head.next;
            ListNode prev = null;
            ListNode ret = head.next;

            //List has 3 nodes
            if(head.next.next != null && head.next.next.next == null){
                head.next = ret.next;
                ret.next = head;
                return ret;
            }
            //List has 2 nodes
            if(head.next != null && head.next.next == null){
                ret.next = head;
                head.next = null;
                return ret;
            }

            while (hi.next != null && hi.next.next !=null){
                lo.next = hi.next;
                hi.next = lo;
                if(prev != null)   prev.next = hi;
                prev = lo;
                lo = lo.next;
                hi = lo.next;
            }

            if(hi.next != null){
                lo.next = hi.next;
            }else{
                lo.next = null;
            }
            prev.next = hi;
            hi.next = lo;




            return ret;
        }
    }

    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        Solution solution = swapNodesInPairs.new Solution();
        int[] nums = {};
        System.out.println(solution.swapPairs(null));
    }

}
