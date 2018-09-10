package main.java.writtenExam;

import java.util.LinkedList;
import java.util.Scanner;

public class Toutiao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int max=0,cur=0;
        char[] chars =str.toCharArray();
        LinkedList<Character> temp=new LinkedList<>();

        for (int i = 0; i < str.length();i++) {
            if (temp.contains(chars[i])) {
                temp.add(chars[i]);
                int firstOccurIndex=temp.indexOf(chars[i]);

                for (int j=0;j<=firstOccurIndex ;j++ ){
                    temp.remove();
                }

            }else {
                temp.add(chars[i]);
                cur = temp.size();
                max = Math.max(max,cur);
            }
        }
        System.out.println(max);
    }
}
