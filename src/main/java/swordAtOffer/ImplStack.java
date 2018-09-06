package main.java.swordAtOffer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午8:17
 */
public class ImplStack {
    List<Integer> linkedlist = new LinkedList<>();
    public void push(int node) {
        linkedlist.add(node);
    }

    public void pop() {
        linkedlist.remove(linkedlist.size()-1);
    }

    public int top() {
        return linkedlist.get(linkedlist.size()-1);
    }

    public int min() {
        return Collections.min(linkedlist);
    }
}
