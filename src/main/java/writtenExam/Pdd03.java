package main.java.writtenExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pdd03{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rest = a%b;
        if(rest==0) {
            System.out.println("0 0");
        }else{
            int start = 0;
            Map<Integer, Integer> visited = new HashMap<>();
            while(rest!=0){
                rest = rest%b;
                if(visited.containsKey(rest)){
                    int index = visited.get(rest);
                    System.out.println(index+" "+(visited.size()-index));
                    break;
                }else{
                    if(rest==0) System.out.println(start+" 0");
                    visited.put(rest,start);
                    rest*=10;
                    start++;
                }
            }
        }
    }

}