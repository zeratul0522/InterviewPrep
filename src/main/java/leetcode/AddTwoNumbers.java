package main.java.leetcode;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/19 下午2:10
 */
public class AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head;
            int list1Finished = 0;
            int list2Finished = 0;
            int carryFlag = 0;

            if(l1 == null) return l2;
            if(l2 == null) return l1;
            //deal with the units
            int s = l1.val + l2.val;
            if(s < 10){
                head = new ListNode(s);
            }else {
                head = new ListNode(s-10);
                carryFlag = 1;
            }
            ListNode ret = head;
            if(l1.next == null){
                list1Finished = 1;
                l1.val = 0;
            }else {
                l1 = l1.next;
            }
            if(l2.next == null){
                list2Finished = 1;
                l2.val = 0;
            }else {
                l2 = l2.next;
            }

            while(list1Finished == 0 || list2Finished == 0){
                int sum = l1.val + l2.val;
                if(carryFlag == 1) sum++;
                if(sum < 10){
                    ret.next = new ListNode(sum);
                    ret = ret.next;
                    carryFlag = 0;
                }else{
                    ret.next = new ListNode(sum-10);
                    ret = ret.next;
                    carryFlag = 1;
                }
                if(l1.next == null){
                    list1Finished = 1;
                    l1.val = 0;
                }else {
                    l1 = l1.next;
                }
                if(l2.next == null){
                    list2Finished = 1;
                    l2.val = 0;
                }else {
                    l2 = l2.next;
                }


            }
            if(carryFlag == 1){
                ret.next = new ListNode(1);
                ret = ret.next;
            }
            return head;
        }
    }



    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Solution solution = addTwoNumbers.new Solution();
        int nums1[] = {5};
        int nums2[] = {5};
        ListNode l1 = ListNode.generateList(nums1);
        ListNode l2 = ListNode.generateList(nums2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(solution.addTwoNumbers(l1,l2));


    }
}
