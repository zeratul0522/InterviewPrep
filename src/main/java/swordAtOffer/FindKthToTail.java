package main.java.swordAtOffer;

import main.java.zutil.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午3:10
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        int cnt = 0;
        ListNode curr = head;
        while (curr!=null){
            cnt++;
            curr = curr.next;
        }

        if(k>cnt || k < 0) return null;
        int index = 0;
        ListNode runner = head;
        while (runner!=null){
            index++;
            if(index==cnt-k+1)  return runner;
            runner = runner.next;
        }
        return null;
    }
}
