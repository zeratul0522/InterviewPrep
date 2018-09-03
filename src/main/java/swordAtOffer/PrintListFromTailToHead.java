package main.java.swordAtOffer;

import main.java.zutil.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/2 下午9:20
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode==null) return ret;
        while (listNode.next!=null){
            ret.add(listNode.val);
            listNode = listNode.next;
        }
        ret.add(listNode.val);
        Collections.reverse(ret);
        return ret;
    }
}
