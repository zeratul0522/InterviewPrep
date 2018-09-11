package main.java.swordAtOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/7 下午6:31
 */
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        int cnt = 1;
        int currUgly = 1;

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        while (cnt<index){
            list1.add(currUgly*2);
            list2.add(currUgly*3);
            list3.add(currUgly*5);

            int tmp1 = list1.getFirst();
            int tmp2 = list2.getFirst();
            int tmp3 = list3.getFirst();

            int min = Math.min(Math.min(tmp1,tmp2),tmp3);
            if(tmp1==min){
                list1.remove();
            }
            if(tmp2==min){
                list2.remove();
            }
            if(tmp3==min){
                list3.remove();
            }
            currUgly = min;
            cnt++;
        }

        return currUgly;

    }

    public static void main(String[] args) {
        GetUglyNumber getUglyNumber = new GetUglyNumber();
        for(int i = 1; i < 20; i++){
            System.out.println(getUglyNumber.GetUglyNumber_Solution(i));
        }

    }
}
