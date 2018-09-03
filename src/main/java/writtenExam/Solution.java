package main.java.writtenExam;

import main.java.zutil.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午6:49
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = listNode;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(list);
        return list;
    }
}
