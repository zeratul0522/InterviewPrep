package main.java.writtenExam;

import java.util.Scanner;

public class Netease01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()<=1){
            System.out.println(str.length());
            return;
        }

        int len = 1;
        int cur = 1;

        for(int i = 1; i<str.length();i++){
            if (str.charAt(i) != str.charAt(i-1)) {
                cur++;
                len = Math.max(cur,len);
            }
            else {
                cur = 1;
            }

        }

        int head = 1;
        int tail = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                break;
            }
            head++;
        }

        for (int i = str.length() - 2; i >= 0; i--) {
            if (str.charAt(i) == str.charAt(i+1)) {
                break;
            }
            tail++;
        }

        if (str.charAt(0) !=str.charAt(str.length()-1) && len < str.length()) {
            len = Math.max(len, head + tail);
        }

        System.out.println(len);



//        int bcnt = 0, wcnt = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i)=='w')
//                wcnt++;
//            else
//                bcnt++;
//        }
//        int min = Math.min(wcnt,bcnt);
//        int max = Math.max(wcnt,bcnt);
//        if(max-min<=1){
//            System.out.println(min+max);
//        }else{
//            System.out.println(min*2+1);
//        }
    }
}
