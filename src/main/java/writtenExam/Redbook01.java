package main.java.writtenExam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 下午3:44
 */
public class Redbook01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String[] tmp = str.split(" ");

        int[] nums = new int[tmp.length];
        for(int i =0; i < tmp.length; i++){
            nums[i] = Integer.parseInt(tmp[i]);
        }

        List<ListNode> list = new ArrayList<>();
        for(int i = 0; i < tmp.length;i++){
            ListNode node = new ListNode(nums[i]);
            list.add(node);
        }

        for(int i = 0; i < list.size(); i++){
            if(i>0){
                list.get(i-1).next = list.get(i);
            }
        }
        ListNode head = list.get(0);

        ListNode newhead = reverseKGroup(head,k);

        ListNode runner = newhead;
        StringBuilder sb = new StringBuilder();
        while (runner!=null){
            sb.append(runner.val);
            sb.append(" ");
            runner = runner.next;
        }

        System.out.println(sb.toString().trim());

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode end = dummy;
        ListNode prev = dummy;
        int cnt = 0;

        while(end.next!=null){
            end = end.next;
            cnt++;

            if(cnt==k){
                ListNode p = prev.next;
                while(prev.next!=end){

                    ListNode temp = prev.next;
                    prev.next = p.next;
                    p.next = p.next.next;
                    prev.next.next = temp;

                }
                end = p;
                prev = p;
                cnt=0;
            }
        }
        return dummy.next;

    }
}
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}