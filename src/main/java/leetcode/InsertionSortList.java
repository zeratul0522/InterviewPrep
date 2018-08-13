package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/13 下午4:34
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode sortedEnd = head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode unsortedStart = head.next;
        while (unsortedStart!=null){
            ListNode temp = unsortedStart;
            unsortedStart = temp.next;
            ListNode fast = head;
            ListNode slow = dummy;


            if(temp.val<=fast.val){
                dummy.next = temp;
                temp.next = head;
                head = dummy.next;
            }else{
                int found = 0;
                while (fast!=sortedEnd.next){
                    if(temp.val>=slow.val && temp.val<=fast.val){
                        slow.next = temp;
                        temp.next = fast;
                        found = 1;
                        break;
                    }
                    fast = fast.next;
                    slow = slow.next;
                }
                if(found==0){
                    sortedEnd.next = temp;
                    sortedEnd = temp;
                }
            }

            sortedEnd.next = unsortedStart;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        InsertionSortList insertionSortList = new InsertionSortList();
        int[] nums = {-1,5,3,4,0};
        System.out.println(ListNode.generateList(nums));
        System.out.println(insertionSortList.insertionSortList(ListNode.generateList(nums)));
    }
}
