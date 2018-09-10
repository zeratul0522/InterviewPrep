package main.java.writtenExam;

import java.util.*;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/6 下午6:26
 */
public class Meituan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            List<Integer> tmp;

            if(map.keySet().contains(a)){
               tmp = map.get(a);
            }else{
                tmp = new ArrayList<>();
            }
            tmp.add(b);
            map.put(a,tmp);
        }

        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        list.addAll(map.get(1));

        while (!list.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            while (!list.isEmpty()) {
                int first = list.get(0);
                list.remove(0);
                if (map.containsKey(first)) {
                    temp.addAll(map.get(first));
                }
            }
            list = temp;
            cnt++;
        }
        int result = 2*(n-1)-cnt;
        System.out.println(result);
    }



}


