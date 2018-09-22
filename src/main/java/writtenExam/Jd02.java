package main.java.writtenExam;


import java.util.*;

public class Jd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MyNode> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new MyNode(a,b,c));
        }
        int ret = 0;
        Collections.sort(list, new Comparator<MyNode>() {
            @Override
            public int compare(MyNode o1, MyNode o2) {
                return o1.a-o2.a;
            }
        });

        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(i < j){
                    if(list.get(j).b>list.get(i).b && list.get(j).c>list.get(i).c){
                        ret++;
                        break;
                    }
                }

            }
        }

        System.out.println(ret);
    }


}
class MyNode{
    int a;
    int b;
    int c;
    public MyNode(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

/*
package main.java.writtenExam;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MyNode> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new MyNode(a,b,c));
        }
        int ret = 0;
        for(int i = 0; i < list.size();i++){
            for(int j = 0; j < list.size();j++){
                if(list.get(j).a>list.get(i).a && list.get(j).b>list.get(j).b && list.get(j).c>list.get(j).c){
                    ret++;
                    break;
                }
            }
        }
        System.out.println(ret);
    }


}
class MyNode{
    int a;
    int b;
    int c;
    public MyNode(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
 */