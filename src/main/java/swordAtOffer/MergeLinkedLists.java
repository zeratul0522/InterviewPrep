package main.java.swordAtOffer;

import main.java.zutil.ListNode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午4:19
 */
public class MergeLinkedLists {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode runner = dummy;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                runner.next = new ListNode(list1.val);
                list1=list1.next;
                runner=runner.next;
            }else {
                runner.next = new ListNode(list2.val);
                list2=list2.next;
                runner=runner.next;
            }
        }
        if(list1!=null){
            while (list1!=null){
                runner.next = new ListNode(list1.val);
                list1=list1.next;
                runner=runner.next;
            }
        }else {
            while (list2!=null){
                runner.next = new ListNode(list2.val);
                list2=list2.next;
                runner=runner.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeLinkedLists mergeLinkedLists = new MergeLinkedLists();
        int[] nums1 = {1,2,3,4,6};
        int[] nums2 = {2,3,6,7,9};
        System.out.println(mergeLinkedLists.Merge(ListNode.generateList(nums1),ListNode.generateList(nums2)));
    }
}
