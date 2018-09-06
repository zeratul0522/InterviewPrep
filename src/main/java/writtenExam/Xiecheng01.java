package main.java.writtenExam;


import java.util.Scanner;

public class Xiecheng01 {
    public static void main(String[] args) {
        int cnt = 0;
        long n = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLong()){
            n = sc.nextLong();
        }
        sc.close();



        while (n!=0){
            n = n & (n-1);
            cnt++;
        }
        System.out.println(cnt);
    }

}
