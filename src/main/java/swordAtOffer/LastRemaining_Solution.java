package main.java.swordAtOffer;

import java.util.LinkedList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/11 下午2:34
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0 || m<0)
            return -1;
        if(n==1)
            return 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }

        int tmp = 0;
        while (list.size()>1){
            tmp = (tmp+m-1)%list.size();
            list.remove(tmp);
        }
        return list.getLast();
    }
}
