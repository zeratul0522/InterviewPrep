package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 23:51
 * @Desc
 */

public class CopyListWithRandomPointer {
    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return head;
        Map<RandomListNode,RandomListNode> mapping = new HashMap<>();
        RandomListNode runner = head;
        while (runner != null){
            mapping.put(runner, new RandomListNode(runner.label));
            runner = runner.next;
        }

        runner = head;
        while (runner != null){
            mapping.get(runner).next = mapping.get(runner.next);
            mapping.get(runner).random = mapping.get(runner.random);
            runner = runner.next;
        }

        return mapping.get(head);
    }
}
