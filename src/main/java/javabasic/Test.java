package main.java.javabasic;

import main.java.zutil.ListNode;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/4 下午2:44
 */
public class Test {

    public static void main(String[] args){
        int[] nums = new int[]{1,4,6,2,3};
        ListNode head = ListNode.generateList(nums);

        List<ListNode> list = new ArrayList<>();
        while (head!=null){
            list.add(head);
            head = head.next;
        }
        Comparator myComparator = new MyComparator();
        Collections.sort(list,myComparator);
        for(ListNode node : list){
            System.out.print(node.val);
        }
    }


}

class MyComparator implements Comparator{
    public int compare(Object a, Object b){
        if(((ListNode)a).val<((ListNode)b).val) return -1;
        else if(((ListNode)a).val == ((ListNode)b).val) return 0;
        else return 1;
    }
}
