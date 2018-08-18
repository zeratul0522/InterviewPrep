package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc Sort a linked list in O(n log n) time using constant space complexity.
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/13 下午6:56
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        return sort(head);
    }

    public ListNode sort(ListNode head){
        if(head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middle = slow;
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        return merge(sort(left),sort(right));
    }

    /*
    Merge two sorted linkedlists a and b, b will be merged to a.
     */
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = a;
        ListNode prev = dummy;
        while(a!=null&&b!=null){
            if(a.val < b.val){
                a = a.next;
                prev= prev.next;
            }else {
                ListNode bnext = b.next;
                prev.next = b;
                b.next = a;
                b = bnext;
                prev = prev.next;
            }
        }
        if(b!=null) prev.next = b;

        return dummy.next;
    }

    public static void main(String[] args) {
        SortList sortList = new SortList();
        int[] nums1 = {-1,5,3,4,0};
        //int[] nums2 = {-1,2,3,4,7,11};
        ListNode a = ListNode.generateList(nums1);
        //ListNode b = ListNode.generateList(nums2);
        System.out.println(sortList.sort(a));
    }
}
