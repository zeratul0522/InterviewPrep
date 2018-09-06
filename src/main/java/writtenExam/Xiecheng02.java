package main.java.writtenExam;

import java.util.*;

public class Xiecheng02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int target = Integer.parseInt(sc.nextLine());

        Map<Integer,Integer> orderMap = new HashMap<>();
        Map<Integer,Integer> enterMap = new HashMap<>();
        Map<Integer,Integer> leaveMap = new HashMap<>();
        for(int i = 0; i < num;i++){
            String[] strs = sc.nextLine().split(" ");
            orderMap.put(i,Integer.parseInt(strs[0]));
            enterMap.put(i,Integer.parseInt(strs[1]));
            leaveMap.put(i,Integer.parseInt(strs[2]));
        }

        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < num; i++){
            if(target>=enterMap.get(i) && target <= leaveMap.get(i)){
                ret.add(orderMap.get(i));
            }
        }


        if(ret.isEmpty()){
            System.out.println("null");
        }else{
            Collections.sort(ret);
            for(int i : ret){
                System.out.println(i);
            }
        }


    }
}
